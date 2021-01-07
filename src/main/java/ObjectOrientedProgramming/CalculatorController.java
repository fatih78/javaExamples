package ObjectOrientedProgramming;

import ObjectOrientedProgramming.Utils.CalculatorSumUtil;
import ObjectOrientedProgramming.Utils.CalculatorMultipleUtil;

public class CalculatorController {
    CalculatorMultipleUtil c = new CalculatorMultipleUtil();
    CalculatorSumUtil s = new CalculatorSumUtil();

    public void CalculatorMultiplicationTable(int number, int table) {
        c.timeTable(number, table);
    }

    public void CalculatorSum(int number) {
        s.sumTable(number);
    }
}

