import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer1;
    private Printer printer2;

    @Before
    public void before(){
        printer1 = new Printer(100, 100);
        printer2 = new Printer(200, 40);
    }

    @Test
    public void hasPaper(){
        assertEquals(100,printer1.getPaperLeft());
    }

    @Test
    public void canPrint(){
        printer1.print(5, 10);
        assertEquals(50, printer1.getPaperLeft());
    }

    @Test
    public void wontPrint(){
        printer1.print(10, 12);
        assertEquals(100, printer1.getPaperLeft());
    }

    @Test
    public void canRefill(){
        printer1.refill(10);
        assertEquals(110, printer1.getPaperLeft());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer1.getToner());
    }

    @Test
    public void tonerVolumeReduces(){
        printer1.print(5, 10);
        assertEquals(50, printer1.getToner());
    }

    @Test
    public void tonerWontReduce(){
        printer2.print(5,50);
        assertEquals(40, printer2.getToner());
    }

}




//Printer
//        Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//        Create a method to refill the printer paper.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.