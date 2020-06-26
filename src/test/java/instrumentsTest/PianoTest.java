package instrumentsTest;

import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    private Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Steinway and Sons", "Maple", 500.00, 1100.00);
    }

    @Test
    public void canBePlayed(){
        assertEquals("plink plonk plink", piano.play());
    }

    @Test
    public void canGetManufacturer(){
        assertEquals("Steinway and Sons", piano.getManufacturer());
    }

    @Test
    public void canGetMaterialItIsMadeFrom(){
        assertEquals("Maple", piano.getMaterial());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(500.00, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(1100.00, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(600.00, piano.profitOnItem(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(55.0, piano.calculateMarkup(), 0.1);
    }

}
