package otherthings.fynngallup.inheritance;

public class Vehicle extends Point{
    private String modeOftransporation;
    private String energyUnit;
    private int size;
    private int weight;
    private int dimensionsOfMovement;
    private int joulesMultiplier;
    private int maxVelocity;
    private int maxAcceleration;
    private Point coordinates;

    public Vehicle(Point coordinates) {
        this("", "", 0, 0, 0, 0, 0, 0, coordinates);

    }

    public Vehicle(String modeOftransporation, String energyUnit, int size, int weight, int dimensionsOfMovement, int joulesMultiplier, int maxVelocity, int maxAcceleration, Point coordinates) {
        this.modeOftransporation = modeOftransporation;
        this.energyUnit = energyUnit;
        this.size = size;
        this.weight = weight;
        this.dimensionsOfMovement = dimensionsOfMovement;
        this.joulesMultiplier = joulesMultiplier;
        this.maxVelocity = maxVelocity;
        this.maxAcceleration = maxAcceleration;
        this.coordinates = coordinates;

    }

    private double continousCoordinateShift(int x, int y) {
        Point point = new Point(x, y);
        double distance = coordinates.distance(point);
        double minTravelTime = distance / maxVelocity;
        return minTravelTime;

    }

    public double destinationTime(int x, int y) {
        return continousCoordinateShift(x, y);

    }

    public double discreteCoordinateShift() {
        return 0.0;
       
    }


    public String getModeOftransporation() {
        return this.modeOftransporation;
    }

    public void setModeOftransporation(String modeOftransporation) {
        this.modeOftransporation = modeOftransporation;
    }

    public String getEnergyUnit() {
        return this.energyUnit;
    }

    public void setEnergyUnit(String energyUnit) {
        this.energyUnit = energyUnit;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDimensionsOfMovement() {
        return this.dimensionsOfMovement;
    }

    public void setDimensionsOfMovement(int dimensionsOfMovement) {
        this.dimensionsOfMovement = dimensionsOfMovement;
    }

    public int getJoulesMultiplier() {
        return this.joulesMultiplier;
    }

    public void setJoulesMultiplier(int joulesMultiplier) {
        this.joulesMultiplier = joulesMultiplier;
    }

    public int getMaxVelocity() {
        return this.maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public int getMaxAcceleration() {
        return this.maxAcceleration;
    }

    public void setMaxAcceleration(int maxAcceleration) {
        this.maxAcceleration = maxAcceleration;
    }

    public Point coordinates() {
        return this.coordinates;

    }

    public void coordinates(Point coordinates) {
        this.coordinates = coordinates;

    }

    
}
