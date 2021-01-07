import ObjectOrientedProgramming.CalculatorController;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class UnitTestCalculator{
    CalculatorController c = new CalculatorController();

    public UnitTestCalculator() throws IOException {
    }

    @Test
    public void calculatorTest1(){
        c.CalculatorMultiplicationTable(2, 1);
        System.out.println(c.result);
        Assert.assertEquals(c.result, 2);
    }

    @Test
    public void calculatorTest2(){
        c.CalculatorMultiplicationTable(2, 2);
        System.out.println(c.result);
        Assert.assertEquals(c.result, 4);
    }

    @Test
    public void calculatorTest3(){
        c.CalculatorMultiplicationTable(2, 3);
        System.out.println(c.result);
        Assert.assertEquals(c.result, 6);
    }

    @Test
    public void calculatorTest4(){
        c.CalculatorMultiplicationTable(2, 4);
        System.out.println(c.result);
        Assert.assertEquals(c.result, 8);
    }

    @Test
    public void calculatorTest5(){
        c.CalculatorMultiplicationTable(2, 5);
        System.out.println(c.result);
        Assert.assertEquals(c.result, 10);
    }

    @Test
    public void calculatorTest6(){
        c.CalculatorMultiplicationTable(2, 6);
        System.out.println(c.result);
        Assert.assertEquals(c.result, 12);
    }

    @Test
    public void calculatorTest7(){
        c.CalculatorMultiplicationTable(2, 7);
        System.out.println(c.result);
        Assert.assertEquals(c.result, 14);
    }

    @Test
    public void calculatorTest8(){
        c.CalculatorMultiplicationTable(2, 8);
        System.out.println(c.result);
        Assert.assertEquals(c.result, 16);
    }

    @Test
    public void calculatorTest9(){
        c.CalculatorMultiplicationTable(2, 9);
        System.out.println(c.result);
        Assert.assertEquals(c.result, 18);
    }

    @Test
    public void calculatorTest10(){
        c.CalculatorMultiplicationTable(2, 10);
        System.out.println(c.result);
        Assert.assertEquals(c.result, 20);
    }
}
