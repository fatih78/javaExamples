import FatihObjectOrientedProgramming.Controllers.CalculatorController;
import FatihObjectOrientedProgramming.Utils.RandomNumbers;
import org.junit.Assert;
import org.junit.Test;

import static FatihObjectOrientedProgramming.Utils.CalculatorSumUtil.result2;

public class UnitTestPrimitives extends RandomNumbers {
    CalculatorController s = new CalculatorController();

    @Test
    public void primitivesTest1() {
        s.CalculatorSum(TRANSACTION_ID, 2);
        System.out.println(TRANSACTION_ID);
    }

    @Test
    public void primitivesTest2() {
        s.CalculatorSumDouble(DOUBLE_ID, 2.2);
//        Assert.assertEquals(result2,);
        System.out.println(DOUBLE_ID);
    }

//    @Test
//    public void primitivesTest3() {
//        Assert.assertEquals(floatId, FLOAT_ID, 0.001);
//    }
}
