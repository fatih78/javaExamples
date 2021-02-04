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

    @Test
    public void mountainbikeUnitTest2(){
        MountainBike mb = new MountainBike(3, 100, 25);
        mb.applyBrake(1);
        result = mb.toString();
        Assert.assertEquals(result,"No of gears are 3\n" +
                "speed of bicycle is 99\n" +
                "seat height is 25");
    }

    @Test
    public void mountainbikeUnitTest3(){
        MountainBike mb = new MountainBike(3, 100, 25);
        mb.speedUp(1);
        result = mb.toString();
        Assert.assertEquals(result,"No of gears are 3\n" +
                "speed of bicycle is 101\n" +
                "seat height is 25");
    }

    @Test
    public void mountainbikeUnitTest4(){
        MountainBike mb = new MountainBike(3, 100, 25);
        mb.setHeight(1);
        result = mb.toString();
        Assert.assertEquals(result,"No of gears are 3\n" +
                "speed of bicycle is 100\n" +
                "seat height is 26");
    }
}
