package otherthings.fynngallup.composition;

public class Wall {
    private String material;
    private Dimensions dimensions;
    private boolean door;
    private String identity;

    public Wall(String material, Dimensions dimensions, boolean door) {
        this.material = material;
        this.dimensions = dimensions;
        this.door = door;

    }

    public String getMaterial() {
        return this.material;

    }

    public Dimensions getDimensions() {
        return this.dimensions;

    }

    public void setDoor(boolean door) {
        this.door = door;
        
    }

    public boolean hasDoor() {
        return this.door;

    }

    public String getIdentity() {
        return this.identity;

    }

    public void setIdentity(String identity) {
        identity = identity.toLowerCase();
        if(identity.equals("n") || identity.equals("s") || identity.equals("e") || identity.equals("w")) {
            this.identity = identity;

        }else{ 
            System.out.println("invalid identity possible identities are as follows: \nn \ns \ne \nw");

        }
    }

}
