package ObjectOrientedProgramming.Interface;

import ObjectOrientedProgramming.Utils.MyInterface;

public class DemoInterface2 implements MyInterface {


    public String method1() {
        return "implementation of method1 in class DemoInterface2";
    }

    public String method2() {
        return "implementation of method2 in class DemoInterface2";
    }

    public int method3() {
        return 1 + 1;
    }

    @Override
    public int method4() {
        return 4 * 5;
    }
}
