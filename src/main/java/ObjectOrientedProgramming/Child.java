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

package ObjectOrientedProgramming;

// Inherited Class
public class Child extends Parent {

    // This method overrides show() of Parent
//  signature same as in the Parent class

    @Override
    public String show() {
        System.out.println(message2());
        return message2();
    }
}
