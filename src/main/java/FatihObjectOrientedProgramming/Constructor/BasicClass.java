package FatihObjectOrientedProgramming.Constructor;

import FatihObjectOrientedProgramming.Controllers.CalculatorController;

public class BasicClass extends CalculatorController {

    public int x;
    public int modelYear;
    public String modelName;
    public int result;

    public BasicClass(int x, int modelYear, String modelName) {
        this.x = x;
        this.modelYear = modelYear;
        this.modelName = modelName;
        calculate();
    }

    public void calculate (){
        result = CalculatorMultiplicationTable(2, 2, 2);
    }
}
