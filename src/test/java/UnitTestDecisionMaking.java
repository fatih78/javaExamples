import ObjectOrientedProgramming.DecisionMaking.DecisionMakingIf;
import ObjectOrientedProgramming.DecisionMaking.DecisionMakingSwitch;
import ObjectOrientedProgramming.Utils.CustomException;
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

}
