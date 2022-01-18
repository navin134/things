package otherthings.fynngallup.inheritance;

public class Car extends Vehicle {
    private String colour;
    private int wheels;
    private int lights;
    private int doors;
    private int windows;
    
    public Car(Point coordinates) {
        this("Electric battery powered", 1, 1, 45, 1, "defualt colour", 4, 4, 4, 6, coordinates);

    }

    public Car(String modeOfTransportation, int size, int weight, int maxVelocity, int maxAcceleration, String colour, int wheels, int lights, int doors, int windows, Point coordinates) {
        super(modeOfTransportation, "joules", size, weight, 1, 1, maxVelocity, maxAcceleration, coordinates);
        this.colour = colour;
        this.wheels = wheels;
        this.lights = lights;
        this.doors = doors;
        this.windows = windows;

    }



    public double destinationTime(int x, int y) {
        double minTime = super.destinationTime(x, y);
        System.out.println("Min time to destination: " + minTime);

        return 0;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getLights() {
        return this.lights;
    }

    public void setLights(int lights) {
        this.lights = lights;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return this.windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }
    
}
