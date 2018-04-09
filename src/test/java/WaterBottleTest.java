import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle bottle1;

    @Before
    public void before() {
        bottle1 = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle1.getVolume());
    }



















}
