package instruments;

public class Guitar extends Instrument{
    public Guitar(String manufacturer, String material, double buyPrice, double sellPrice){
        super(manufacturer, material, buyPrice, sellPrice);
    }

    public String play(){
        return "strum strum";
    }
}
