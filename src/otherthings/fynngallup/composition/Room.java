package otherthings.fynngallup.composition;

import javax.management.relation.Relation;

public class Room {
    
    private String identity;
    private Furniture[] furnitures;
    private Floor floor;
    private Wall wall;
    private Relative position;

    public Room(String identity, Furniture[] furnitures, Floor floor, Wall wall) {
        this.identity = identity;
        this.furnitures = furnitures;
        this.floor = floor;
        this.wall = wall;
        

    }

    public String getIdentity() {
        return this.identity;

    }

    public int getRoomVolume() {
        return floor.getDimensions().getArea() * wall.getDimensions().getHeight();
 
    }
    

    
    
}