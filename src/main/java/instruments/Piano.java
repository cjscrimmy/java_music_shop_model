package instruments;

public class Piano extends Instrument{
    public Piano(String manufacturer, String material, int buyPrice, int sellPrice){
        super(manufacturer, material, buyPrice, sellPrice);
    }

    public String play(){
        return "plink plonk plink";
    }
}
