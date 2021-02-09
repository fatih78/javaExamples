import FatihObjectOrientedProgramming.LambdaExpressions.Greetings;
import FatihObjectOrientedProgramming.LambdaExpressions.Numbers;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestLambdaExpressions {
    Numbers n = new Numbers();
    Greetings g = new Greetings();


    @Test
    public void testNumbers() {
        n.numbers().forEach((n) -> { System.out.println(n);});
        Assert.assertTrue(n.numbers.size() == 4);
    }

    @Test
    public void greetings() {
        Assert.assertEquals(g.morningGreeting(), "Good Morning Fatih!");
    }

    @Test
    public void greetings2() {
        Assert.assertEquals(g.eveningGreeting(), "Good Evening Fatih!");
    }
}
