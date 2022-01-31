package otherthings.fynngallup.inheritance;

public class Vehicle {
    private String modeOftransporation;
    private String energyUnit;
    private int size;
    private int mass;
    private int dimensionsOfMovement;
    private int joulesMultiplier;
    private int maxVelocity;
    private int maxAcceleration;
    private Point location;
    private Point destination;
    private float velocity;

    public Vehicle() {
        this("", "", 0, 0, 0, 0, 0, 0, 0);

    }

    public Vehicle(String modeOftransporation, String energyUnit, int size, int weight, int dimensionsOfMovement, int joulesMultiplier, int maxVelocity, int maxAcceleration, float velocity) {
        this.modeOftransporation = modeOftransporation;
        this.energyUnit = energyUnit;
        this.size = size;
        this.mass = weight;
        this.dimensionsOfMovement = dimensionsOfMovement;
        this.joulesMultiplier = joulesMultiplier;
        this.maxVelocity = maxVelocity;
        this.maxAcceleration = maxAcceleration;
        this.location = new Point();
        this.destination = new Point();
        this.velocity = velocity;

    }

    private double continousCoordinateShift() {
        double distance = location.distance(this.destination);
        return distance;

    }

    public double destinationTime() {
        return continousCoordinateShift();

    }

    public double discreteCoordinateShift() {
        return 0;
       
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public float getVelocity() {
        return velocity;
    }

    public Point getDestination() {
        return destination;
    }

    public void setDestination(int x, int y) {
        destination.setX(x);
        destination.setY(y);
        
    }

}

