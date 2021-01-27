import ObjectOrientedProgramming.DecisionMaking.DecisionMakingIf;
import ObjectOrientedProgramming.Utils.CustomException;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class UnitTestDecisionMaking {
    DecisionMakingIf f = new DecisionMakingIf();

    @Test
    public void simpleIfStatementWithException() {
        try {
            f.simpleIfStatement(0);
            fail("Expected an Exception not to be thrown");
        } catch (CustomException e) {
            assertThat(e.getMessage(), is("Value can't be nul"));
        }
    }

    @Test
    public void simpleIfStatementWithoutException() throws CustomException {
        f.simpleIfStatement(1);
        Assert.assertEquals(f.result, 1);
    }

}
