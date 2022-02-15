package otherthings.fynngallup.composition;

public class MotherBoard {

    private String model;
    private String manufactorer;
    private int ramSlot;
    private int cardSlots;
    private String bios;


    public MotherBoard(String model, String manufactorer, int ramSlot, int carSlots, String bios) {
        this.model = model;
        this.manufactorer = manufactorer;
        this.ramSlot = ramSlot;
        this.cardSlots = carSlots;
        this.bios = bios;

    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading");
        
    }

    public String getModel() {
        return this.model;
    }

    public String getManufactorer() {
        return this.manufactorer;
    }

    public int getRamSlot() {
        return this.ramSlot;
    }

    public int getCarSlots() {
        return this.cardSlots;
    }

    public String getBios() {
        return this.bios;
    }
    
}
