package instruments;

import behaviours.IPlay;

public abstract class Instrument {
    private String manufacturer;
    private String material;

    public Instrument(String manufacturer, String material){
        this.manufacturer = manufacturer;
        this.material = material;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public String getMaterial(){
        return this.material;
    }
}
