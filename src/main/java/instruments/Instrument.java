package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {
    private String manufacturer;
    private String material;
    private int buyPrice;
    private int sellPrice;

    public Instrument(String manufacturer, String material, int buyPrice, int sellPrice){
        this.manufacturer = manufacturer;
        this.material = material;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public String getMaterial(){
        return this.material;
    }

    public int getBuyPrice(){
        return this.buyPrice;
    }

    public int getSellPrice(){
        return this.sellPrice;
    }

    public int profitOnItem(){
        return this.sellPrice - this.buyPrice;
    }

    public long calculateMarkup(){
        double profit = profitOnItem();
        double markup = profit/this.sellPrice;
        long percentage = Math.round(markup * 100);
        return percentage;
    }
}
