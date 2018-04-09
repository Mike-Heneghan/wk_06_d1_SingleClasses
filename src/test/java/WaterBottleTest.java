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

    @Test
    public void canDrink(){
        assertEquals(90, bottle1.drink());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, bottle1.empty());
    }

    @Test
    public void canFill(){
        assertEquals(100, bottle1.fill());
    }

















}
