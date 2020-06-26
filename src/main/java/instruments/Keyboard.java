package instruments;

public class Keyboard extends Instrument{
    public Keyboard(String manufacturer, String material, double buyPrice, double sellPrice){
        super(manufacturer, material, buyPrice, sellPrice);
    }

    public String play(){
        return "plink plink plonk";
    }
}
