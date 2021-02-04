package FatihObjectOrientedProgramming.Interface;

import FatihObjectOrientedProgramming.Utils.MyInterface;

public class DemoInterface3 implements MyInterface {

    public String method1() {
        return "implementation of method1 in class DemoInterface3";
    }

    public String method2() {
        return "implementation of method2 in class DemoInterface3";
    }

    public int method3() {
        return 2 + 2;
    }

    @Override
    public int method4() {
        return 5 * 5;
    }
}
