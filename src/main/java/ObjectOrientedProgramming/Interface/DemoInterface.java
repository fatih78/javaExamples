package ObjectOrientedProgramming.Interface;

import ObjectOrientedProgramming.Utils.MyInterface;

public class DemoInterface implements MyInterface {
    public String method1() {
        return "implementation of method1 in class DemoInterface";
    }

    public String method2() {
        return "implementation of method2 in class DemoInterface";
    }

    public int method3() {
        return 8 * 9;
    }
}
