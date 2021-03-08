package FatihObjectOrientedProgramming.Utils;

import java.util.Random;

import static FatihObjectOrientedProgramming.JavaBestPractices.Primitives.transactionId;

public class RandomNumbers {
    public static int TRANSACTION_ID;

    public RandomNumbers() {
        this.TRANSACTION_ID = transactionId;
    }

    public int randomize(){
        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        //generate random values from 0-24
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }
}
