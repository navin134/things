package otherthings.fynngallup.composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        TheCase theCase  = new TheCase("acer5000", "acer", 27, dimensions);

        Monitor monitor = new Monitor("nvidiar83", "Nvidia", 37, new Resolution(1080, 1940));

        MotherBoard motherBoard = new MotherBoard("fireFoxer", "fireFox", 4, 2, "v2342");

        PC pc = new PC(theCase, monitor, motherBoard);
        pc.powerUp();
    }
    
}
