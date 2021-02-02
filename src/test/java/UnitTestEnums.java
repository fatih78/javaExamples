import ObjectOrientedProgramming.Directions;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestEnums {

    Directions dir = Directions.EAST;
    Directions dir2 = Directions.WEST;
    Directions dir3 = Directions.NORTH;
    Directions dir4 = Directions.SOUTH;

    @Test
    public void direction1() {
        Assert.assertEquals(dir.getDirectionCode(), "E");
    }

    @Test
    public void direction2() {
        Assert.assertEquals(dir2.getDirectionCode(), "W");
    }

    @Test
    public void direction3() {
        Assert.assertEquals(dir3.getDirectionCode(), "N");
    }

    @Test
    public void direction4() {
        Assert.assertEquals(dir4.getDirectionCode(), "S");
    }

}
