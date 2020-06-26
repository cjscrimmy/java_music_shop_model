package accessories;

public abstract class Accessories {

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
}
