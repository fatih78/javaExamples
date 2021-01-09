import ObjectOrientedProgramming.Person;
import org.junit.Assert;
import org.junit.Test;


public class UnitTestPerson extends Person {
    private final String name = prop.getProperty("name");
    private final int age = Integer.parseInt(prop.getProperty("age"));
    private final String gender = prop.getProperty("gender");

    Person p = new Person();


    @Test
    public void testName() throws Exception {
        if (name.equals("")) {
            throw new Exception("Name is not provided");
        } else {
            p.getName(name);
            Assert.assertEquals(name, p.Name());
        }
    }

    @Test
    public void testAge() throws Exception {
        if (age == 0) {
            throw new Exception("Age is not provided");
        } else {
            p.getAge(age);
            Assert.assertEquals(age, p.Age());
        }
    }

    @Test
    public void testGender() throws Exception {
        if (gender.equals("")) {
            System.out.println("Gender is not provided");
            throw new Exception("Gender is not provided");
        } else {
            p.getGender(gender);
            Assert.assertEquals(gender, p.Gender());
        }
    }

    @Test
    public void testAll() {
        p.getName("Fatih");
        p.getAge(42);
        p.getGender("Men");

        System.out.println("Personal info:" + " " + p.Name() + "-" + p.Gender() + "-" + p.Age());
    }
}
