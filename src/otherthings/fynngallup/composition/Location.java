package otherthings.fynngallup.composition;

public class Location {

    private Floor floor;
    private int x;
    private int y;

    public Location(Floor floor, int x, int y) {
        this.floor = floor;
        this.x = x;
        this.y = y;

    }



    public int getX() {
        return this.x;

    }

    public int getY() {
        return this.y;

    }


    
}
