package otherthings.fynngallup.composition;

public class Monitor {
    private String model;
    private String manufactorer;
    private int size;
    private Resolution nativeResolution;
    

    public Monitor(String model, String manufactorer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufactorer = manufactorer;
        this.size = size;
        this.nativeResolution = nativeResolution;

    }
    
    public void drawPixelAt(int x, int y, String colour) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in colour " + colour);

    }


    public String getModel() {
        return this.model;
    }

    public String getManufactorer() {
        return this.manufactorer;
    }

    public int getSize() {
        return this.size;
    }


    public Resolution getNativeResolution() {
        return this.nativeResolution;
    }

}
