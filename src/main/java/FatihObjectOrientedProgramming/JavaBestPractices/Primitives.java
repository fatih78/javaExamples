package FatihObjectOrientedProgramming.JavaBestPractices;

import FatihObjectOrientedProgramming.Utils.RandomNumbers;



public class Primitives  {
    public static int transactionId;
    public static double doubleId;

    RandomNumbers rn = new RandomNumbers();

    public Primitives() {
        transactionId = rn.randomize();
        doubleId = rn.randomizeDouble();
    }
}
