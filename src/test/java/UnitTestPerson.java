import ObjectOrientedProgramming.JavaBestPractices.Person;
import org.junit.Assert;
import org.junit.Test;


public class UnitTestPerson extends Person {

    Person p = new Person();

    @Test
    public void testName() throws Exception {
        p.getName(p.Name());
        Assert.assertEquals("Fatih", p.Name());
    }

    @Test
    public void testAge() throws Exception {
        p.getAge(p.Age());
        Assert.assertEquals(42, p.Age());
    }

    @Test
    public void testGender() throws Exception {
        p.getGender(p.Gender());
        Assert.assertEquals("Men", p.Gender());
    }

    @Test
    public void testAll() throws Exception {
        p.getName("Fatih");
        p.getAge(42);
        p.getGender("Men");

        System.out.println("Personal info:" + " " + p.Name() + "-" + p.Gender() + "-" + p.Age());
    }
}
