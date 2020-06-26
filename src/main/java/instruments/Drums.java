package instruments;

public class Drums extends Instrument{
    public Drums(String manufacturer, String material, double buyPrice, double sellPrice){
        super(manufacturer, material, buyPrice, sellPrice);
    }

    public String play(){
        return "boom boom tish";
    }


}
