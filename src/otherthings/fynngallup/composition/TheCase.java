package otherthings.fynngallup.composition;

public class TheCase {
    private String model;
    private String manufactorer;
    private int powerSupply;
    private Dimensions dimensions;


    public TheCase(String model, String manufactorer, int powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufactorer = manufactorer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed booting up");

    }

    public String getModel() {
        return this.model;
    }

    public String getManufactorer() {
        return this.manufactorer;
    }

    public int getPowerSupply() {
        return this.powerSupply;
    }

    public Dimensions getDimensions() {
        return this.dimensions;
    }

}
