package otherthings.fynngallup.inheritance;

public class Fish extends Animal {
    
    private String type;
    private String colour;
    private int fins;
    private int teeth;
    private int lifeSpan;
    private int foodBar;
    private int health;
    
    public Fish(String name, int size, int weight, String type, String colour, int fins, int teeth, int lifeSpan, int foodBar, int health) {
        super(name, 1, 1, size, weight);
        this.type = type;
        this.colour = colour;
        this.fins = fins;
        this.teeth = teeth;
        this.lifeSpan = lifeSpan;
        this.foodBar = foodBar;
        this.health = health;
        
    }
    
    public void eat() {
        System.out.println("Fish.eat() called");
        slurp();
        super.eat();
        
    }
    
    private void slurp() {
        System.out.println("fish is slurping up worlds");
        
    }
    
    public void move(int speed) {
        System.out.println("Fish.move() called");
        super.move(speed);
    }
    
    public void idleMoving() {
        System.out.println("Fish is idly moving around");
        searchForFood();
        searchForMate();
        move(100);
        
    }
    
    private void searchForFood() {
        System.out.println("Fish is searching for food 60% chance");
        
    }
    
    private void searchForMate() {
        System.out.println("Fish is searching for mate: 10% chance");
        
    }
    
    public void escapeFast() {
        System.out.println("Fish is escaping");
        evade();
        move(10000);
        
    } 
    
    private void evade() {
        System.out.println("Fish is evading");
        
    }
    
    
    
}