import FatihObjectOrientedProgramming.Utils.CalculatorMultipleUtil;
import org.junit.Assert;
import org.junit.Test;

import static FatihObjectOrientedProgramming.JavaBestPractices.Primitives.doubleId;
import static FatihObjectOrientedProgramming.JavaBestPractices.Primitives.transactionId;
import static FatihObjectOrientedProgramming.Utils.RandomValues.DOUBLE_ID;
import static FatihObjectOrientedProgramming.Utils.RandomValues.TRANSACTION_ID;

public class UnitTestPrimitives extends CalculatorMultipleUtil {

    @Test
    public void primitivesTest1() {
        Assert.assertEquals(transactionId, TRANSACTION_ID);
    }

    @Test
    public void primitivesTest2() {
        Assert.assertEquals(doubleId, DOUBLE_ID, 0.001);
    }
}
