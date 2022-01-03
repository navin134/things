package otherthings.fynngallup;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("porche") || validModel.equals("exception")){
            this.model = model;
        }
    }   

    public String getModel() {
        return this.model;
    }
}
