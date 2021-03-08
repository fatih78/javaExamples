import FatihObjectOrientedProgramming.Utils.CalculatorMultipleUtil;
import org.junit.Assert;
import org.junit.Test;

import static FatihObjectOrientedProgramming.JavaBestPractices.Primitives.*;
import static FatihObjectOrientedProgramming.Utils.RandomValues.*;

public class UnitTestPrimitives extends CalculatorMultipleUtil {

    @Test
    public void primitivesTest1() {
        Assert.assertEquals(transactionId, TRANSACTION_ID);
    }

    @Test
    public void primitivesTest2() {
        Assert.assertEquals(doubleId, DOUBLE_ID, 0.001);
    }

    @Test
    public void primitivesTest3() {
        Assert.assertEquals(floatId, FLOAT_ID, 0.001);
    }
}
