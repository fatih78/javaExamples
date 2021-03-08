import FatihObjectOrientedProgramming.Utils.CalculatorMultipleUtil;
import org.junit.Assert;
import org.junit.Test;

import static FatihObjectOrientedProgramming.JavaBestPractices.Primitives.transactionId;
import static FatihObjectOrientedProgramming.Utils.RandomNumbers.TRANSACTION_ID;

public class UnitTestPrimitives extends CalculatorMultipleUtil {

    @Test
    public void primitivesTest1() {
        Assert.assertEquals(transactionId, TRANSACTION_ID);
    }
}
