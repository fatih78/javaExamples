import ObjectOrientedProgramming.DecisionMaking.DecisionMakingIf;
import ObjectOrientedProgramming.Utils.CustomException;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class UnitTestDecisionMaking {
    DecisionMakingIf f = new DecisionMakingIf();

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

}
