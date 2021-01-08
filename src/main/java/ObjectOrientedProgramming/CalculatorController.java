package ObjectOrientedProgramming;

import ObjectOrientedProgramming.Utils.CalculatorSumUtil;
import ObjectOrientedProgramming.Utils.CalculatorMultipleUtil;

public class CalculatorController {
    CalculatorMultipleUtil c = new CalculatorMultipleUtil();
    CalculatorSumUtil s = new CalculatorSumUtil();

    public void CalculatorMultiplicationTable(int number, int table, int i) {
        c.timeTable(number, table, i);
    }

    public void CalculatorSum(int number, int i) {
        s.sumTable(number, i);
    }
}

