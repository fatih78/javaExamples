import ObjectOrientedProgramming.CalculatorController;
import ObjectOrientedProgramming.Utils.CalculatorMultipleUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class UnitTestCalculatorMultiplification extends CalculatorMultipleUtil {
    CalculatorController x = new CalculatorController();

    public UnitTestCalculatorMultiplification() throws IOException {
    }

    @Test
    public void calculatorTest1() {
        x.CalculatorMultiplicationTable(2, 1);
        System.out.println(result);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void calculatorTest2() {
        x.CalculatorMultiplicationTable(2, 2);
        System.out.println(result);
        Assert.assertEquals(result, 4);
    }

    @Test
    public void calculatorTest3() {
        x.CalculatorMultiplicationTable(2, 3);
        System.out.println(result);
        Assert.assertEquals(result, 6);
    }

    @Test
    public void calculatorTest4() {
        x.CalculatorMultiplicationTable(2, 4);
        System.out.println(result);
        Assert.assertEquals(result, 8);
    }

    @Test
    public void calculatorTest5() {
        x.CalculatorMultiplicationTable(2, 5);
        System.out.println(result);
        Assert.assertEquals(result, 10);
    }

    @Test
    public void calculatorTest6() {
        x.CalculatorMultiplicationTable(2, 6);
        System.out.println(result);
        Assert.assertEquals(result, 12);
    }

    @Test
    public void calculatorTest7() {
        x.CalculatorMultiplicationTable(2, 7);
        System.out.println(result);
        Assert.assertEquals(result, 14);
    }

    @Test
    public void calculatorTest8() {
        x.CalculatorMultiplicationTable(2, 8);
        System.out.println(result);
        Assert.assertEquals(result, 16);
    }

    @Test
    public void calculatorTest9() {
        x.CalculatorMultiplicationTable(2, 9);
        System.out.println(result);
        Assert.assertEquals(result, 18);
    }

    @Test
    public void calculatorTest10() {
        x.CalculatorMultiplicationTable(2, 10);
        System.out.println(result);
        Assert.assertEquals(result, 20);
    }
}
