import FatihObjectOrientedProgramming.Interface.DemoInterface;
import FatihObjectOrientedProgramming.Interface.DemoInterface2;
import FatihObjectOrientedProgramming.Interface.DemoInterface3;
import FatihObjectOrientedProgramming.Utils.MyInterface;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestDemoInterface {
    MyInterface obj = new DemoInterface();
    MyInterface obj2 = new DemoInterface2();
    MyInterface obj3 = new DemoInterface3();


    @Test
    public void testInterface1() {
        String resut = obj.method1();
        Assert.assertEquals(resut, "implementation of method1 in class DemoInterface");
    }

    @Test
    public void testInterface2() {
        String resut = obj.method2();
        Assert.assertEquals(resut, "implementation of method2 in class DemoInterface");
    }

    @Test
    public void testInterface3() {
        int resut = obj.method3();
        Assert.assertEquals(resut, 72);
    }

    @Test
    public void testInterface4() {
        int resut = obj.method4();
        Assert.assertEquals(resut, 15);
    }

    @Test
    public void testInterface5() {
        String resut = obj2.method1();
        Assert.assertEquals(resut, "implementation of method1 in class DemoInterface2");
    }

    @Test
    public void testInterface6() {
        String resut = obj2.method2();
        Assert.assertEquals(resut, "implementation of method2 in class DemoInterface2");
    }

    @Test
    public void testInterface7() {
        int resut = obj2.method3();
        Assert.assertEquals(resut, 2);
    }

    @Test
    public void testInterface8() {
        int resut = obj2.method4();
        Assert.assertEquals(resut, 20);
    }

    @Test
    public void testInterface9() {
        String resut = obj3.method1();
        Assert.assertEquals(resut, "implementation of method1 in class DemoInterface3");
    }

    @Test
    public void testInterface10() {
        String resut = obj3.method2();
        Assert.assertEquals(resut, "implementation of method2 in class DemoInterface3");
    }

    @Test
    public void testInterface11() {
        int resut = obj3.method3();
        Assert.assertEquals(resut, 4);
    }

    @Test
    public void testInterface12() {
        int resut = obj3.method4();
        Assert.assertEquals(resut, 25);
    }

}
