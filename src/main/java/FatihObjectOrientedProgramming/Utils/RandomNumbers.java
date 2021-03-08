package FatihObjectOrientedProgramming.Utils;

import java.util.Random;

public class RandomNumbers {

    protected int TRANSACTION_ID;
    protected double DOUBLE_ID;
    protected float FLOAT_ID;

    public RandomNumbers() {
        this.TRANSACTION_ID = randomize();
        this.DOUBLE_ID = randomizeDouble();
        this.FLOAT_ID = randomizeFloat();
    }

    int upperbound = 25;

    public int randomize(){
        Random rand = new Random(); //instance of random class
        //generate random values from 0-24
       return rand.nextInt(upperbound);
    }

    public double randomizeDouble(){
        Random rand = new Random(); //instance of random class
        //generate random values from 0-24
        return rand.nextDouble();
    }

    public float randomizeFloat(){
        Random rand = new Random(); //instance of random class
        //generate random values from 0-24
        return rand.nextFloat();
    }
}
