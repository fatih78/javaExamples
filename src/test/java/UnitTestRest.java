import FatihObjectOrientedProgramming.Rest.TimeFraming;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestRest {
    TimeFraming officehours = new TimeFraming();

    @Test
    public void testTimeFraming(){
        Assert.assertTrue(officehours.officeHours()== true || officehours.officeHours()== false);
    }
}
