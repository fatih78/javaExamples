package FatihObjectOrientedProgramming.LambdaExpressions;

public class LambdaExamples {
    String result;

    public interface MyGreeting {
        String processName(String str);
    }

    interface MyFunctionalInterface {

        //A method with single parameter
        public int incrementByFive(int a);
    }

    public String morningGreeting() {
        MyGreeting morningGreeting = (str) -> "Good Morning " + str + "!";
        System.out.println(morningGreeting.processName("Fatih"));
        return result = morningGreeting.processName("Fatih");
    }

    public String  eveningGreeting(){
        MyGreeting eveningGreeting = (str) -> "Good Evening " + str + "!";
        System.out.println(eveningGreeting.processName("Fatih"));
        return result = eveningGreeting.processName("Fatih");
    }

    public int increment(){
        MyFunctionalInterface f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));
        return f.incrementByFive(22);
    }
}
