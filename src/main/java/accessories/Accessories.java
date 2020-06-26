package accessories;

import behaviours.ISell;

public abstract class Accessories implements ISell {

    private String description;
    private double buyPrice;
    private double sellPrice;

    public Accessories(String description, double buyPrice, double sellPrice){
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription(){
        return this.description;
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
