package FatihObjectOrientedProgramming.TestNG;

public class Calculation {
    public static int result;

    public static int objectID;
    public static int y;
    public static int x;

    public Calculation(int x, int y, int objectID){
        Calculation.x = x;
        Calculation.y = y;
        Calculation.objectID = objectID;
        multiple();
    }

    public int multiple(){
        result = x * y;
        return result;
    }
}
