import FatihObjectOrientedProgramming.DecisionMaking.DecisionMakingIf;
import FatihObjectOrientedProgramming.DecisionMaking.DecisionMakingSwitch;
import FatihObjectOrientedProgramming.Utils.CustomException;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class UnitTestDecisionMaking {
    DecisionMakingIf f = new DecisionMakingIf();
    DecisionMakingSwitch s = new DecisionMakingSwitch();

    @Test
    public void simpleIfStatementWithException() throws CustomException {
        f.simpleIfStatement(0);
        assertThat(f.exceptionMessage, is("Value can't be nul"));

    }

    @Test
    public void simpleIfStatementWithoutException() throws CustomException {
        f.simpleIfStatement(1);
        Assert.assertEquals(f.result, 1);
    }

    @Test
    public void simpleSwitchStatementWithoutException() throws CustomException {
        s.simpleSwitchStatement(1);
        Assert.assertEquals(s.dayString, "Monday");
    }

    @Test
    public void simpleSwitchStatementWithException() throws CustomException {
        s.simpleSwitchStatement(0);
        assertThat(s.exceptionMessage, is("Invalid Day"));
    }

    @Test
    public void simpleSwitchStatementWithoutException2() throws CustomException {
        s.simpleSwitchStatement(2);
        Assert.assertEquals(s.dayString, "Tuesday");
    }

    @Test
    public void simpleSwitchStatementWithoutException3() throws CustomException {
        s.simpleSwitchStatement(3);
        Assert.assertEquals(s.dayString, "Wednesday");
    }

    @Test
    public void simpleSwitchStatementWithoutException4() throws CustomException {
        s.simpleSwitchStatement(4);
        Assert.assertEquals(s.dayString, "Thursday");
    }

    @Test
    public void simpleSwitchStatementWithoutException5() throws CustomException {
        s.simpleSwitchStatement(5);
        Assert.assertEquals(s.dayString, "Friday");
    }

    @Test
    public void simpleSwitchStatementWithoutException6() throws CustomException {
        s.simpleSwitchStatement(6);
        Assert.assertEquals(s.dayString, "Saturday");
    }

    @Test
    public void simpleSwitchStatementWithoutException7() throws CustomException {
        s.simpleSwitchStatement(7);
        Assert.assertEquals(s.dayString, "Sunday");
    }
}
