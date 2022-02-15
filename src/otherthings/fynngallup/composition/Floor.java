package otherthings.fynngallup.composition;

public class Floor {
    private String material;
    private Dimensions dimensions;

    public Floor(String material, Dimensions dimensions) {
        this.material = material;
        this.dimensions = dimensions;

    }

    public String getMaterial() {
        return this.material;

    }

    public Dimensions getDimensions() {
        return this.dimensions;
        
    }

}
