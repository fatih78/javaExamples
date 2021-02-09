import FatihObjectOrientedProgramming.LambdaExpressions.LambdaExamples;
import FatihObjectOrientedProgramming.LambdaExpressions.Numbers;
import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertEquals(l.morningGreeting(), "Good Morning Fatih!");
    }

    @Test
    public void unitTestgreetings2() {
        Assert.assertEquals(l.eveningGreeting(), "Good Evening Fatih!");
    }

    @Test
    public void unitTestIncrement() {
        Assert.assertEquals(l.increment(), 27);
    }
}
