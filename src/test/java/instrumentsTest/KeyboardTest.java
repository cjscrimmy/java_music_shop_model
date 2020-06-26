package instrumentsTest;

import instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {
    private Keyboard keyboard;

    @Before
    public void setUp(){
        keyboard = new Keyboard("Yamaha", "Plastic", 110.00, 200.00);
    }

    @Test
    public void canBePlayed(){
        assertEquals("plink plink plonk", keyboard.play());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Yamaha", keyboard.getManufacturer());
    }

    @Test
    public void hasMaterialItIsMadeFrom(){
        assertEquals("Plastic", keyboard.getMaterial());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(110.00, keyboard.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(200.00, keyboard.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(90.00, keyboard.profitOnItem(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(45.0, keyboard.calculateMarkup(), 0.1);
    }
}
