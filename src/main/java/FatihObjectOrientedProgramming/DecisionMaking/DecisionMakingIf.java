package FatihObjectOrientedProgramming.DecisionMaking;

import FatihObjectOrientedProgramming.Utils.CustomException;

import java.io.Serializable;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DecisionMakingIf {
    public static int result;
    public static String exceptionMessage;


    public Serializable simpleIfStatement(int x) throws CustomException {
        try {
            if (x == 0) {
                throw new CustomException("Value can't be nul");
            }
        } catch (CustomException e) {
            assertThat(e.getMessage(), is("Value can't be nul"));
            return exceptionMessage = e.getMessage();
        }
        return result = x;
    }

}
