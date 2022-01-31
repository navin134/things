package otherthings.fynngallup.inheritance;

public class Car extends Vehicle {
    private String colour;
    private int wheels;
    private int lights;
    private int doors;
    private int windows;
    private float gearRatio;
    private int gear;
    private float[] gearList;
    private int rpm;

    
    public Car() {
        this("Electric battery powered", 1, 1, 45, 1, "defualt colour", 4, 4, 4, 6, 0);

    }

    public Car(String modeOfTransportation, int size, int weight, int maxVelocity, int maxAcceleration, String colour, int wheels, int lights, int doors, int windows, float velocity) {
        super(modeOfTransportation, "joules", size, weight, 1, 1, maxVelocity, maxAcceleration, velocity);
        this.colour = colour;
        this.wheels = wheels;
        this.lights = lights;
        this.doors = doors;
        this.windows = windows;
        this.gearRatio = 1;
        this.rpm = 0;
        float[] gearList = {0.02f, 0.005f, 0.002f};
        this.gearList = gearList;

    }

    public void gasPercent(int gasP) {
        if(gasP >= 0 && gasP <= 100) {
            gasP /= 100;
            this.rpm = gasP * 10000;
            velocityUpdater();

        }
        
    }

    public void gearChange(int gear) {
        if((gear >= 0 && gear <= 3) && gear != this.gear) {
            this.gear = gear-1;
            this.gearRatio = gearList[this.gear];
            velocityUpdater(); 

        }

    }

    private void velocityUpdater() {
        float velocity = gearRatio * rpm;
        super.setVelocity(velocity);
        getTimeToDestination();
        
    }

    public void getTimeToDestination() {
        float distance = (float) super.destinationTime();
        float time = (distance / super.getVelocity()) ;
        System.out.println("Min to destination " + time);
        
    }

    public String getColour() {
        return this.colour;

    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
}
