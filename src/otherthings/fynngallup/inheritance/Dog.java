package otherthings.fynngallup.inheritance;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.teeth = teeth;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;

    }

    private void chew() {
        System.out.println("Dog.chew() called");

    }

    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();

    }

    public void walk() {
        System.out.println("Dog.walk called");
        move(5);

    }

    public void run() {
        System.out.println("Dog.run called");
        move(10);

    }

    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);

    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs called. moving each leg at " + speed / 4);

    }


    public int getEyes() {
        return this.eyes;

    }

    public int getLegs() {
        return this.legs;

    }

    public int getTail() {
        return this.tail;

    }

    public int getTeeth() {
        return this.teeth;

    }

    public String getCoat() {
        return this.coat;

    }
    
}
