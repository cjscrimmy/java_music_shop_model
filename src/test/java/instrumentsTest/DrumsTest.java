package instrumentsTest;

import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {
    private Drums drums;

    @Before
    public void setUp(){
        drums = new Drums("Yamaha", "Maple", 250, 400);
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
        assertEquals(250, drums.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(400, drums.getSellPrice());
    }

    @Test
    public void canBePlayed(){
        assertEquals("boom boom tish", drums.play());
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(150, drums.profitOnItem());
    }

}
