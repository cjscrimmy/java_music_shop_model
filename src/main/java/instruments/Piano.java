package instruments;

public class Piano extends Instrument{
    public Piano(String manufacturer, String material, double buyPrice, double sellPrice){
        super(manufacturer, material, buyPrice, sellPrice);
    }

    public String play(){
        return "plink plonk plink";
    }
}
