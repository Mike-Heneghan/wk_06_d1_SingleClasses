
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator Calculator;

    @Before
    public void before(){
        Calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(12, Calculator.add(2, 10));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, Calculator.subtract(10, 5));
    }

    @Test
    public void canMultiply(){
        assertEquals(55, Calculator.multiply(5, 11));
    }

    @Test
    public void canDivide(){
        assertEquals(100, Calculator.divide(1000, 10));
    }
}
