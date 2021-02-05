import FatihObjectOrientedProgramming.Constructor.BasicClass;
import FatihObjectOrientedProgramming.Constructor.MyClass;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestConstructor {
    private Object MyClass;
    private Object BasicClass;

    @Test
    public void parameterizedConstructorTest(){
        MyClass myClass = new MyClass(1, "Hello");
        Assert.assertEquals(myClass.number, 1);
        Assert.assertEquals(myClass.greeting, "Hello");
    }

    @Test
    public void oneArgumentedConstructorTest(){
        MyClass myClass = new MyClass("Fatih");
        Assert.assertEquals(myClass.name, "Fatih");
        Assert.assertEquals(myClass.message, "Parent is shown");
    }

    @Test
    public void twoArgumentedConstructorTest(){
        MyClass myClass = new MyClass("Fatih", 42);
        Assert.assertEquals(myClass.name, "Fatih");
        Assert.assertEquals(myClass.age, 42);
    }

    @Test
    public void difTypeArgumentedConstructorTest(){
        MyClass myClass = new MyClass('1');
        Assert.assertEquals(myClass.id, '1');
    }

    @Test
    public void basicClassConst(){
        BasicClass basicClass = new BasicClass(1, 1978, "Mustang");
        Assert.assertEquals(basicClass.x, 1);
        Assert.assertEquals(basicClass.modelYear, 1978);
        Assert.assertEquals(basicClass.modelName, "Mustang");
        Assert.assertEquals(basicClass.result, 2);
    }
}
