package instrumentsTest;

import instruments.Keytar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeytarTest {
    private Keytar keytar;

    @Before
    public void setUp(){
        keytar = new Keytar("Roland", "Plastic", 200, 300);
    }

    @Test
    public void canBePlayed(){
        assertEquals("wah wah wummm", keytar.play());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Roland", keytar.getManufacturer());
    }

    @Test
    public void hasMaterialItIsMadeFrom(){
        assertEquals("Plastic", keytar.getMaterial());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(200, keytar.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(300, keytar.getSellPrice());
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(100, keytar.profitOnItem());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(33, keytar.calculateMarkup());
    }



}
