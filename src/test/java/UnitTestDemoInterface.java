import ObjectOrientedProgramming.Utils.MyInterface;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestDemoInterface {
    MyInterface obj = new DemoInterface();

    @Test
    public void testInterface1() {
        String resut = obj.method1();
        Assert.assertEquals(resut, "implementation of method1");
    }

    @Test
    public void testInterface2() {
        String resut = obj.method2();
        Assert.assertEquals(resut, "implementation of method2");
    }

    @Test
    public void testInterface3() {
        int resut = obj.method3();
        Assert.assertEquals(resut, 72);
    }

}
