package FatihObjectOrientedProgramming.Utils;

import static FatihObjectOrientedProgramming.JavaBestPractices.Primitives.transactionId;

public class RandomValues {
    public static int TRANSACTION_ID;

    public RandomValues() {
        this.TRANSACTION_ID = transactionId;
    }
}
