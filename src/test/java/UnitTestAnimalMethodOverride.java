import FatihObjectOrientedProgramming.Overriding.Animal;
import FatihObjectOrientedProgramming.Overriding.Cat;
import FatihObjectOrientedProgramming.Overriding.Dog;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestAnimalMethodOverride {

    Animal obj1 = new Animal();
    Animal obj2 = new Dog();
    Animal obj3 = new Cat();

    @Test
    public void communicateAnimal(){
        Assert.assertEquals(obj1.communicate(), "Hi, I'am an Animal!");
    }

    @Test
    public void communicateDog(){
        Assert.assertEquals(obj2.communicate(), "Hi, I'am a Dog, Woef woef!");
    }
    
    @Test
    public void communicateCat(){
        Assert.assertEquals(obj3.communicate(), "Hi, I'am a Cat, Miauwww Miauwww!");
    }
}
