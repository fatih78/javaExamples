import ObjectOrientedProgramming.Calculator;
import ObjectOrientedProgramming.Utils.Utils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class UnitTestCalculator extends Utils {
    Calculator c = new Calculator();

    public UnitTestCalculator() throws IOException {
    }

    @Test
    public void calculatorNumber1(){
        c.timesTableNumber1();
        System.out.println(c.result);
        Assert.assertEquals(c.result, 20);
    }

    @Test
    public void calculatorNumber2(){
        c.timesTableNumber2();
        System.out.println(c.result);
        Assert.assertEquals(c.result, 30);
    }

    @Test
    public void calculatorNumber3(){
        c.timeTable3();
        System.out.println(c.result);
        Assert.assertEquals(c.result, 40);
    }
}
