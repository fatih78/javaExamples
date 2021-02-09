package FatihObjectOrientedProgramming.LambdaExpressions;

public class Greetings {
    String result;

    public interface MyGreeting {
        String processName(String str);
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
}
