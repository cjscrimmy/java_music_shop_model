package instrumentsTest;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    private Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Fender", "Rosewood", 300.00, 450.00);
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
        assertEquals(300.00, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(450.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(150.00, guitar.profitOnItem(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(33.0, guitar.calculateMarkup(), 0.01);
    }
}
