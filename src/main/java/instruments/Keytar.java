package instruments;

public class Keytar extends Instrument{
    public Keytar(String manufacturer, String material, int buyPrice, int sellPrice){
        super(manufacturer, material, buyPrice, sellPrice);
    }

    public String play(){
        return "wah wah wummm";
    }
}
