package FatihObjectOrientedProgramming.Constructor;

public class BasicClass {

    public int x;
    public int modelYear;
    public String modelName;
    public int result;

    public BasicClass(int x, int modelYear, String modelName) {
        this.x = x;
        this.modelYear = modelYear;
        this.modelName = modelName;
        result = calculate();
    }

    public int calculate (){
        return x * 2;
    }
}
