package accessoriesTest;

import accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    private GuitarStrings guitarStrings;

    @Before
    public void setUp(){
        guitarStrings = new GuitarStrings("Metal Guitar Strings", 2.00, 4.00);
    }

    @Test
    public void getDescription(){
        assertEquals("Metal Guitar Strings", guitarStrings.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(2.00, guitarStrings.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(4.00, guitarStrings.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(2.00, guitarStrings.profitOnItem(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(50.0, guitarStrings.calculateMarkup(), 0.01);
    }
}
