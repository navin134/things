package otherthings.fynngallup.inheritance;

public class Car extends Vehicle {
    private String colour;
    private int wheels;
    private int lights;
    private int doors;
    private int windows;
    private int gearRatio;
    private int rotationsPerMinute;

    
    public Car() {
        this("Electric battery powered", 1, 1, 45, 1, "defualt colour", 4, 4, 4, 6, 0);

    }

    public Car(String modeOfTransportation, int size, int weight, int maxVelocity, int maxAcceleration, String colour, int wheels, int lights, int doors, int windows, double velocity) {
        super(modeOfTransportation, "joules", size, weight, 1, 1, maxVelocity, maxAcceleration, velocity);
        this.colour = colour;
        this.wheels = wheels;
        this.lights = lights;
        this.doors = doors;
        this.windows = windows;
        this.gearRatio = 1;
        this.rotationsPerMinute = 0;

    }



    public double destinationTime(int x, int y) {
        double distance = super.destinationTime(x, y);
        
        System.out.println("approximate time to destination " + minToDest + "minutes");

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
