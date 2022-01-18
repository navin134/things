package otherthings.fynngallup.inheritance;

public class ColourChangingCar extends Car{

    public ColourChangingCar(Point point) {
        super(point);

    }

    public void changeColour(String colour) {
        super.setColour(colour);

    }
    
}
