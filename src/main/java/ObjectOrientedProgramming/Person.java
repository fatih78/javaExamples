package ObjectOrientedProgramming;

/* Use of:
    Getters & Setters
        in this class */

import ObjectOrientedProgramming.Utils.Utils;

public class Person extends Utils {
    private String name;
    private int age = 0;
    private String gender;


    // Name
    // Getter
    public void getName(String name) {
        if (this.name == null) {
            setName(name);
        }
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // To access private name variable in another class 'UnitTestPerson'java'
    public String Name() {
        return this.name;
    }

    // Age
    // Getter
    public void getAge(int age) {
        if (this.age == 0) {
            setAge(age);
        }
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    //    To access private name variable in another class 'UnitTestPerson'java'
    public int Age() {
        return this.age;
    }

    //    Gender
    //    Getter
    public void getGender(String gender) {
        if (this.gender == null) {
            setGender(gender);
        }
    }

    //    Setter
    public void setGender(String gender) {
        this.gender = gender;
    }

    //    To access private name variable in another class 'UnitTestPerson'java'
    public String Gender() {
        return this.gender;
    }

}
