package FatihObjectOrientedProgramming.LambdaExpressions;

public interface LambdaInterface {
    @FunctionalInterface

    interface MyGreeting {
        String processName(String str);
    }

    interface MyFunctionalInterface {

        //A method with single parameter
        public int incrementByFive(int a);
    }

    interface MyHelloInterface {
        String hello(String str);
    }

    // this is functional interface
    interface MyInterface{

        // abstract method
        double getPiValue();
    }

    interface Comparison1{
        // abstract method
        double getWight1();
    }

    interface Comparison2{
        // abstract method
        double getWight2();
    }

    interface Color{
        // abstract method
        String getColor();
    }
}
