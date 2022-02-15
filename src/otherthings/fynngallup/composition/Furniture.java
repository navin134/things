package otherthings.fynngallup.composition;

import java.text.DecimalFormat;
import java.time.format.DecimalStyle;

public class Furniture {
    private String object;
    private int numberOfObj;
    private Dimensions dimensions;

    public Furniture(String object, int numberOfObj, Dimensions dimensions) {
        this.object = object;
        this.numberOfObj = numberOfObj;
        this.dimensions = dimensions;

    }

    public String getObject() {
        return this.object;

    }

    public int numberOfObj() {
        return this.numberOfObj;

    }
    
    public Dimensions getDimensions() {
        return this.dimensions;

    }

}
