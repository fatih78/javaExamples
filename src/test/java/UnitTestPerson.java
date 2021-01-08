import ObjectOrientedProgramming.Person;
import org.junit.Assert;
import org.junit.Test;


public class UnitTestPerson extends Person {

    Person p = new Person();


    @Test
    public void testName() {
        p.getName("Fatih");
        Assert.assertEquals("Fatih", p.Name());
    }

    @Test
    public void testAge() {
        p.getAge(42);
        Assert.assertEquals(42, p.Age());
    }

    @Test
    public void testGender() {
        p.getGender("Men");
        Assert.assertEquals("Men", p.Gender());
    }

    @Test
    public void testAll() {
        p.getName("Fatih");
        p.getAge(42);
        p.getGender("Men");

        System.out.println("Personal info:" + " " + p.Name() + "-" + p.Gender() + "-" + p.Age());
    }
}
