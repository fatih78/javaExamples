import ObjectOrientedProgramming.CalculatorController;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class UnitTestCalculatorSum {
    CalculatorController c = new CalculatorController();

    public UnitTestCalculatorSum() throws IOException {
    }

    @Test
    public void calculatorTest1(){
        c.sumTable( 1);
        System.out.println(c.result);
        Assert.assertEquals(c.result, 2);
    }

    @Test
    public void calculatorTest2(){
        c.sumTable( 2);
        System.out.println(c.result);
        Assert.assertEquals(c.result, 4);
    }

    @Test
    public void calculatorTest3(){
        c.sumTable( 3);
        System.out.println(c.result);
        Assert.assertEquals(c.result, 6);
    }

    @Test
    public void calculatorTest4(){
        c.sumTable( 5);
        System.out.println(c.result);
        Assert.assertEquals(c.result, 8);
    }
}
