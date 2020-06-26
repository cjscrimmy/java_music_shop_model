package instrumentsTest;

import instruments.Keytar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeytarTest {
    private Keytar keytar;

    @Before
    public void setUp(){
        keytar = new Keytar("Roland", "Plastic", 200.00, 300.00);
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
        assertEquals(200.00, keytar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(300.00, keytar.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(100.00, keytar.profitOnItem(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(33.0, keytar.calculateMarkup(), 0.1);
    }



}
