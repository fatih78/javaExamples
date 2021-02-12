import FatihObjectOrientedProgramming.LambdaExpressions.Apple;
import FatihObjectOrientedProgramming.LambdaExpressions.LambdaExamples;
import FatihObjectOrientedProgramming.LambdaExpressions.Numbers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

import java.util.Comparator;

public class UnitTestLambdaExpressions {
    Numbers n = new Numbers();
    LambdaExamples l = new LambdaExamples();


    @Test
    public void unitTestNumbers() {
        n.numbers().forEach((n) -> {
            System.out.println(n);
        });
        Assert.assertTrue(n.numbers.size() == 4);
    }

    @Test
    public void unitTestgreetings() {
        assertEquals(l.morningGreeting(), "Good Morning Fatih!");
    }

    @Test
    public void unitTestgreetings2() {
        assertEquals(l.eveningGreeting(), "Good Evening Fatih!");
    }

    @Test
    public void unitTestIncrement() {
        assertEquals(l.increment(), 27);
    }

    @Test
    public void unitTestDouble() {
        assertEquals(l.getPiValue(), 3.1415, 1);
    }

    @Test
    public void unitTestHello() {
        assertThat(l.getHello(), containsString("Hello"));
    }

    @Test
    public void unitTestHello2() {
        assertThat(l.getHello2(), containsString("Hello"));
    }

    @Test
    public void unitTestHello3() {
        String result = l.getHello3("Hello3 Wihtout Lambda");
        assertEquals(result, "Hello3 Wihtout Lambda");
    }

    @Test
    public void unitTestHello3Lambda() {
        assertThat(l.getHello3Lambda(), containsString("Fatih with Lambda"));
    }

    @Test
    public void unitTestAppleWeightComparison() {
        Apple a = new Apple();
        a.setWeight1(1.0);
        a.setWeight2(2.0);
        double result = a.compare1(a.getWeight2(), a.getWeight1());
        System.out.println(result);
        Assert.assertEquals(result, -1.0, 0.1);


    }

    @Test
    public void unitTestAppleWeightComparisonLambda() {
        Apple a = new Apple();
        double result = a.compare(1.5, 2.5);
        System.out.println(result);
        Assert.assertEquals(result, -1.0, 0.1);
    }

}
