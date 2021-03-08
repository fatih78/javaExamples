package FatihObjectOrientedProgramming.Utils;

import static FatihObjectOrientedProgramming.JavaBestPractices.Primitives.doubleId;
import static FatihObjectOrientedProgramming.JavaBestPractices.Primitives.transactionId;

public class RandomValues {
    public static int TRANSACTION_ID;
    public static double DOUBLE_ID;

    public RandomValues() {
        this.TRANSACTION_ID = transactionId;
        this.DOUBLE_ID = doubleId;
    }
}
