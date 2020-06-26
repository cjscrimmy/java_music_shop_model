package accessoriesTest;

import accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {
    private DrumSticks drumSticks;

    @Before
    public void setUp(){
        drumSticks = new DrumSticks("Wooden Drum Sticks");
    }

    @Test
    public void getDescription(){
        assertEquals("Wooden Drum Sticks", drumSticks.getDescription());
    }
}
