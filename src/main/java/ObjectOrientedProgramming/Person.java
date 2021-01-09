package ObjectOrientedProgramming;

/* Use of:
    Getters & Setters
        in this class */

import ObjectOrientedProgramming.Utils.Utils;

public class Person extends Utils {

    private String name = prop.getProperty("name");
    private int age = Integer.parseInt(prop.getProperty("age"));
    private String gender = prop.getProperty("gender");


    // Name
    // Getter
    public void getName(String name) throws Exception {
        if (name.equals("")) {
            throw new Exception("Name is not provided");
        } else {
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
    public void getAge(int age) throws Exception {
        if (age == 0) {
            throw new Exception("Age is not provided");
        } else {
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
    public void getGender(String gender) throws Exception {
        if (gender.equals("")) {
            throw new Exception("Gender is not provided");
        } else {
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
