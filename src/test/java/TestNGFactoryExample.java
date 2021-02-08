import FatihObjectOrientedProgramming.TestNGFactory.TestData;
import org.junit.Assert;
import org.testng.annotations.Factory;

public class TestNGFactoryExample extends TestData {

    public TestNGFactoryExample(int objectID, String testdata) {
        super(objectID, testdata);
    }

    @org.testng.annotations.Test
    public void testmethod() {
        System.out.println(objectID + ":" + "" + "This is test method, testdata is  :" + testdata);
    }

    public static class TestNGFactory {
        @Factory
        public static Object[] testData() {
            Object[] object = new Object[3];

            object[0] = new TestNGFactoryExample(1, "testdata1");
            Assert.assertEquals(testdata, "testdata1");
            object[1] = new TestNGFactoryExample(2, "testdata2");
            Assert.assertEquals(testdata, "testdata2");
            object[2] = new TestNGFactoryExample(3, "testdata3");
            Assert.assertEquals(testdata, "testdata3");

            return object;
        }
    }

}