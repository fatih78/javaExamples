import ObjectOrientedProgramming.CalculatorController;
import ObjectOrientedProgramming.Utils.CalculatorSumUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class UnitTestCalculatorSum extends CalculatorSumUtil {
    CalculatorController s = new CalculatorController();

    public UnitTestCalculatorSum() throws IOException {
    }

    @Test
    public void calculatorTest1() {
        s.CalculatorSum(1, 1);
        System.out.println(result);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void calculatorTest2() {
        s.CalculatorSum(2, 2);
        System.out.println(result);
        Assert.assertEquals(result, 4);
    }

    @Test
    public void calculatorTest3() {
        s.CalculatorSum(3, 3);
        System.out.println(result);
        Assert.assertEquals(result, 6);
    }

    @Test
    public void calculatorTest4() {
        s.CalculatorSum(4, 4);
        System.out.println(result);
        Assert.assertEquals(result, 6);
    }
}
