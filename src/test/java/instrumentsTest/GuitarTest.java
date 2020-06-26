package instrumentsTest;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    private Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Fender", "Rosewood", 300, 450);
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Fender", guitar.getManufacturer());
    }

    @Test
    public void canBePlayed(){
        assertEquals("strum strum", guitar.play());
    }

    @Test
    public void hasMaterialItIsMadeFrom(){
        assertEquals("Rosewood", guitar.getMaterial());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(300, guitar.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(450, guitar.getSellPrice());
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(150, guitar.profitOnItem());
    }
}
