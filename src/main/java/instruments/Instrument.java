package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {
    private String manufacturer;
    private String material;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String manufacturer, String material, double buyPrice, double sellPrice){
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

    public double getBuyPrice(){
        return this.buyPrice;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }

    public double profitOnItem(){
        return this.sellPrice - this.buyPrice;
    }

    public double calculateMarkup(){
        double profit = profitOnItem();
        double markup = (profit/this.sellPrice)*100;
        markup = Math.round(markup);
        return markup;
    }
}
