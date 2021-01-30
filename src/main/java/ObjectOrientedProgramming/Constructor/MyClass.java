package ObjectOrientedProgramming.Constructor;

import ObjectOrientedProgramming.Utils.Utils;

public class MyClass extends Utils {

//    data members of the class
    public long id;
    public int number;
    public int age;
    public String greeting;
    public String name;
    public String message;


    // constructor would initialize data members
    // with the values of passed arguments while
    // object of that class created

    public MyClass(int theNumber, String theGreeting){
        this.number = theNumber;
        this.greeting = theGreeting;
    }

    // constructor with one argument
    public MyClass (String theName) {
        this.name = theName;
        this.message = prop.getProperty("message1");
        System.out.println("Constructor with one " + "argument - String : " + name);
        System.out.println(message);

    }

    // constructor with two arguments
    public MyClass(String theName, int theAge) {
        this.name = theName;
        this.age = theAge;
        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);
    }

    // Constructor with one argument but with different
    // type than previous..
    public MyClass(long theId) {
        this.id = theId;
        System.out.println("Constructor with one argument : " + "Long : " + id);
    }

}
