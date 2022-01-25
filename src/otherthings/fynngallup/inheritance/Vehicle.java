package otherthings.fynngallup.inheritance;

public class Vehicle extends Point{
    private String modeOftransporation;
    private String energyUnit;
    private int size;
    private int mass;
    private int dimensionsOfMovement;
    private int joulesMultiplier;
    private int maxVelocity;
    private int maxAcceleration;
    private Point coordinates;
    private double velocity;

    public Vehicle() {
        this("", "", 0, 0, 0, 0, 0, 0, 0);

    }

    public Vehicle(String modeOftransporation, String energyUnit, int size, int weight, int dimensionsOfMovement, int joulesMultiplier, int maxVelocity, int maxAcceleration, double velocity) {
        this.modeOftransporation = modeOftransporation;
        this.energyUnit = energyUnit;
        this.size = size;
        this.mass = weight;
        this.dimensionsOfMovement = dimensionsOfMovement;
        this.joulesMultiplier = joulesMultiplier;
        this.maxVelocity = maxVelocity;
        this.maxAcceleration = maxAcceleration;
        this.coordinates = new Point();
        this.velocity = velocity;

    }

    private double continousCoordinateShift(int x, int y) {
        Point point = new Point(x, y);
        double distance = coordinates.distance(point);
        return distance;

    }

    public double destinationTime(int x, int y) {
        return continousCoordinateShift(x, y);

    }

    public double discreteCoordinateShift() {
        return 0;
       
    }

    public double changeVelocity(double change) {
        this.velocity += change;
        return velocity;

    }
}
