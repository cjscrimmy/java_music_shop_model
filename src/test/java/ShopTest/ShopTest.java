package ShopTest;

import accessories.GuitarStrings;
import instruments.Drums;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop shop;

    private Guitar guitar;
    private Drums drums;
    private GuitarStrings strings;

    @Before
    public void setUp(){
        guitar = new Guitar("Gibson", "Maple", 300.00, 600.00);
        drums = new Drums("Pearl", "Poplar", 150.00, 250.00);
        strings = new GuitarStrings("Metal Guitar Strings", 2.00, 6.00);
        shop = new Shop("Ray's Music");
    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music", shop.getName());
    }
}
