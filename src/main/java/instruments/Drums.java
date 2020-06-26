package instruments;

public class Drums extends Instrument{
    public Drums(String manufacturer, String material, int buyPrice, int sellPrice){
        super(manufacturer, material, buyPrice, sellPrice);
    }

    public String play(){
        return "boom boom tish";
    }


}
