package FatihObjectOrientedProgramming.JavaBestPractices;

import FatihObjectOrientedProgramming.Utils.RandomNumbers;



public class Primitives  {
    public static int transactionId;
    public static double doubleId;
    public static float floatId;

    RandomNumbers rn = new RandomNumbers();

    public Primitives() {
        transactionId = rn.randomize();
        doubleId = rn.randomizeDouble();
        floatId = rn.randomizeFloat();
    }
}
