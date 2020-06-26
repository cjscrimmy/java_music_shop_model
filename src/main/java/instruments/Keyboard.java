package instruments;

public class Keyboard extends Instrument{
    public Keyboard(String manufacturer, String material, int buyPrice, int sellPrice){
        super(manufacturer, material, buyPrice, sellPrice);
    }

    public String play(){
        return "plink plink plonk";
    }
}
