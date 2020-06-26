package instruments;

public class Keytar extends Instrument{
    public Keytar(String manufacturer, String material, double buyPrice, double sellPrice){
        super(manufacturer, material, buyPrice, sellPrice);
    }

    public String play(){
        return "wah wah wummm";
    }
}
