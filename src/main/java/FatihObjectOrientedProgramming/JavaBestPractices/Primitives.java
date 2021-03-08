package FatihObjectOrientedProgramming.JavaBestPractices;

import FatihObjectOrientedProgramming.Utils.RandomNumbers;



public class Primitives  {
    public static int transactionId;

    RandomNumbers rn = new RandomNumbers();

    public Primitives() {
        transactionId = rn.randomize();
    }
}
