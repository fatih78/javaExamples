import FatihObjectOrientedProgramming.Controllers.CalculatorController;
import FatihObjectOrientedProgramming.Utils.RandomNumbers;
import org.junit.Assert;
import org.junit.Test;

import static FatihObjectOrientedProgramming.Utils.CalculatorSumUtil.result2;
import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

public class UnitTestPrimitives extends RandomNumbers {
    CalculatorController s = new CalculatorController();

    @Test
    public void primitivesTest1() {
        s.CalculatorSum(TRANSACTION_ID, 2);
        assertThat(TRANSACTION_ID, instanceOf(Integer.class));
        System.out.println(TRANSACTION_ID);
    }

    @Test
    public void primitivesTest2() {
        s.CalculatorSumDouble(DOUBLE_ID, 2.2);
        assertThat(DOUBLE_ID, instanceOf(Double.class));
        System.out.println(DOUBLE_ID);
    }

    @Test
    public void primitivesTest3() {

    }
}
