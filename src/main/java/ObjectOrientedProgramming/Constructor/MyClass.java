package ObjectOrientedProgramming.Constructor;

public class MyClass {

//    data members of the class
    public long id;
    public int number;
    public int age;
    public String greeting;
    public String name;

    // constructor would initialize data members
    // with the values of passed arguments while
    // object of that class created

    public MyClass(int number, String greeting){
        this.number = number;
        this.greeting = greeting;
    }

    // constructor with one argument
    public MyClass (String name) {
        this.name = name;
        System.out.println("Constructor with one " +
                "argument - String : " + name);
    }

    // constructor with two arguments
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);
    }

    // Constructor with one argument but with different
    // type than previous..
    public MyClass(long id) {
        this.id = id;
        System.out.println("Constructor with one argument : " +
                "Long : " + id);
    }
}
