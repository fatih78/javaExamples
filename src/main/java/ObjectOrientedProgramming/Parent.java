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

import ObjectOrientedProgramming.Utils.Utils;

// Override method:
// Base class
public class Parent extends Utils {
    private final String message1 = prop.getProperty("message1");
    private final String message2 = prop.getProperty("message2");


    // Signature same as in the Child class
    public String show() {
        System.out.println(message1);
        return message1;
    }

    // To access private name variable in another class 'Child'java'
    public String message2() {
        return this.message2;
    }
}

