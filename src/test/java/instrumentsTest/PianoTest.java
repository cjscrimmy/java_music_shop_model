package instrumentsTest;

import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    private Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Steinway and Sons", "Maple", 500, 1100);
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
        assertEquals(500, piano.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(1100, piano.getSellPrice());
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(600, piano.profitOnItem());
    }

}
