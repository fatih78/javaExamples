package FatihObjectOrientedProgramming.Utils;

import java.util.Random;

public class RandomNumbers {

    public int randomize(){
        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        //generate random values from 0-24
        int int_random = rand.nextInt(upperbound);
        return int_random;
//        double double_random=rand.nextDouble();
//        float float_random=rand.nextFloat();
    }

    public double randomizeDouble(){
        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        //generate random values from 0-24
        double double_random = rand.nextDouble();
        return double_random;

//        float float_random=rand.nextFloat();
    }
}
