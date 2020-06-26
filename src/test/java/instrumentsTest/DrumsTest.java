package instrumentsTest;

import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {
    private Drums drums;

    @Before
    public void setUp(){
        drums = new Drums("Yamaha", "Maple");
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Yamaha", drums.getManufacturer());
    }

    @Test
    public void hasMaterialItsMadeFrom(){
        assertEquals("Maple", drums.getMaterial());
    }

}
