import FatihObjectOrientedProgramming.Inheritance.MountainBike;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestInheritance {
    private String result;

    @Test
    public void mountainbikeUnitTest1(){
        MountainBike mb = new MountainBike(3, 100, 25);
        result = mb.toString();
        Assert.assertEquals(result,"No of gears are 3\n" +
                "speed of bicycle is 100\n" +
                "seat height is 25");
    }
}
