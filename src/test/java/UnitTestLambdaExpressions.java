import FatihObjectOrientedProgramming.LambdaExpressions.Numbers;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestLambdaExpressions {
    Numbers n = new Numbers();


    @Test
    public void testNumbers(){
        n.numbers().forEach((n) -> {System.out.println(n);});
        Assert.assertTrue(n.numbers.size() == 4);
    }
}
