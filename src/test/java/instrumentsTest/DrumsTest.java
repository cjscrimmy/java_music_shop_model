package instrumentsTest;

import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {
    private Drums drums;

    @Before
    public void setUp(){
        drums = new Drums("Yamaha", "Maple", 250.00, 400.00);
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Yamaha", drums.getManufacturer());
    }

    @Test
    public void hasMaterialItsMadeFrom(){
        assertEquals("Maple", drums.getMaterial());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(250.00, drums.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(400.00, drums.getSellPrice(), 0.01);
    }

    @Test
    public void canBePlayed(){
        assertEquals("boom boom tish", drums.play());
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(150.00, drums.profitOnItem(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(38.0, drums.calculateMarkup(), 0.01);
    }

}
