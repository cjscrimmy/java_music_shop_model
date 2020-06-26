package accessoriesTest;

import accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {
    private DrumSticks drumSticks;

    @Before
    public void setUp(){
        drumSticks = new DrumSticks("Wooden Drum Sticks", 1.00, 3.00);
    }

    @Test
    public void getDescription(){
        assertEquals("Wooden Drum Sticks", drumSticks.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(1.00, drumSticks.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(3.00, drumSticks.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(2.00, drumSticks.profitOnItem(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(67.0, drumSticks.calculateMarkup(), 0.01);
    }
}
