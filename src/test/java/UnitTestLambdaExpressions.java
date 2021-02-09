import FatihObjectOrientedProgramming.LambdaExpressions.Greetings;
import FatihObjectOrientedProgramming.LambdaExpressions.Numbers;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestLambdaExpressions {
    Numbers n = new Numbers();
    Greetings g = new Greetings();
    String result;


    @Test
    public void testNumbers(){
        n.numbers().forEach((n) -> {System.out.println(n);});
        Assert.assertTrue(n.numbers.size() == 4);
    }

    @Test
    public void greetings() {
        Greetings.MyGreeting morningGreeting = (str) -> "Good Morning " + str + "!";
        System.out.println(morningGreeting.processName("Fatih"));
        result = morningGreeting.processName("Fatih");
        Assert.assertEquals(result, "Good Morning Fatih!");
    }

    @Test
    public void greetings2() {
        Greetings.MyGreeting morningGreeting = (str) -> "Good Evening " + str + "!";
        System.out.println(morningGreeting.processName("Fatih"));
        result = morningGreeting.processName("Fatih");
        Assert.assertEquals(result, "Good Evening Fatih!");
    }
}
