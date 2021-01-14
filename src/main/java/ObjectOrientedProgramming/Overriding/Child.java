/*
Information about @Override methods:

    In any object-oriented programming language,
    Overriding is a feature that allows a subclass or
    child class to provide a specific implementation of a method that is already provided
    by one of its super-classes or parent classes.

    When a method in a subclass has the same name,
    same parameters or signature, and same return type(or sub-type) as a method in its super-class,
    then the method in the subclass is said to override the method in the super-class.
  */

package ObjectOrientedProgramming.Overriding;

// Inherited Class
public class Child extends Parent {

/*
@Override @Override annotation informs the compiler that the element is meant to override an element declared in a superclass.
This method overrides show() of Parent
Signature same as in the Parent class
 */

    @Override
    public String show() {
//        super.show();
        System.out.println(message2());
        return message2();
    }

    @Override
    public String talk() {
//        super.show();
        System.out.println(message4());
        return message4();
    }
}
