package instruments;

import behaviours.IPlay;

public abstract class Instrument {
    private String manufacturer;

    public Instrument(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }
}
