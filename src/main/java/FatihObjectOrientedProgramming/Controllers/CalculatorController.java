package FatihObjectOrientedProgramming.Controllers;

import FatihObjectOrientedProgramming.Utils.CalculatorSumUtil;
import FatihObjectOrientedProgramming.Utils.CalculatorMultipleUtil;

public class CalculatorController {
    CalculatorMultipleUtil c = new CalculatorMultipleUtil();
    CalculatorSumUtil s = new CalculatorSumUtil();

    public int CalculatorMultiplicationTable(int number, int table, int i) {
        return c.timeTable(number, table, i);

    }

    public void CalculatorSum(int number, int i) {
        s.sumTable(number, i);
    }

    public void CalculatorSumDouble(double number, double i) {
        s.sumTableDouble(number, i);
    }
}

