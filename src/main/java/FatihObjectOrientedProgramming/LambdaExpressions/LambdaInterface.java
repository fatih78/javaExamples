package FatihObjectOrientedProgramming.LambdaExpressions;

public interface LambdaInterface {

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
    @FunctionalInterface
    interface MyInterface{

        // abstract method
        double getPiValue();
    }
}
