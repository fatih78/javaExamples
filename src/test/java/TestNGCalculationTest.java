import FatihObjectOrientedProgramming.TestNG.Calculation;
import org.junit.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestNGCalculationTest extends Calculation {
    public TestNGCalculationTest(int x, int y, int objectID) {
        super(x, y, objectID);
    }

    @Test
    public void testmethod() {
        System.out.println(objectID + ":" + "" + "Result of the calculation =" + " " + result);
    }

    public static class TestNGFactory {
        @Factory
        public static Object[] calculation() {
            Object[] object = new Object[3];

            object[0] = new TestNGCalculationTest(1,1, 1);
            Assert.assertEquals(result, 1);
            object[1] = new TestNGCalculationTest(1, 2, 2);
            Assert.assertEquals(result, 2);
            object[2] = new TestNGCalculationTest(1, 3, 3);
            Assert.assertEquals(result, 3);

            return object;
        }
    }
}
