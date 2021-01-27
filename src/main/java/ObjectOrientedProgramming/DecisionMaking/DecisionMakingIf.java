package ObjectOrientedProgramming.DecisionMaking;

import ObjectOrientedProgramming.Utils.CustomException;

public class DecisionMakingIf {
    public static int result;

    public int simpleIfStatement(int x) throws CustomException {
        if (x == 0) {
            throw new CustomException("Value can't be nul");
        } else {
            return result = x;
        }
    }
}
