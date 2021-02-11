import FatihObjectOrientedProgramming.LambdaExpressions.LambdaExamples;
import FatihObjectOrientedProgramming.LambdaExpressions.Numbers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

public class UnitTestLambdaExpressions {
    Numbers n = new Numbers();
    LambdaExamples l = new LambdaExamples();


    @Test
    public void unitTestNumbers() {
        n.numbers().forEach((n) -> { System.out.println(n);});
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
}
