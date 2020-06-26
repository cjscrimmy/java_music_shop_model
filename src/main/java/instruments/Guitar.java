package instruments;

public class Guitar extends Instrument{
    public Guitar(String manufacturer, String material, int buyPrice, int sellPrice){
        super(manufacturer, material, buyPrice, sellPrice);
    }

    public String play(){
        return "strum strum";
    }
}
