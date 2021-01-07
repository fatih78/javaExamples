package ObjectOrientedProgramming.Utils;

public class CalculatorSumUtil {
    public static int result;

    public int sumTable(int number) {
        int i = 0;
        if (number == 1) {
            while (i <= 1) {
                result = number + i;
                System.out.println(number + " * " + i + " = " + result);
                i++;
            }
        } else if (number == 2) {
            while (i <= 2) {
                result = number + i;
                System.out.println(number + " + " + i + " = " + result);
                i++;
            }
        } else if (number == 3) {
            while (i <= 3) {
                result = number + i;
                System.out.println(number + " + " + i + " = " + result);
                i++;
            }
        } else {
            System.out.println("Number is not defined");
        }
        return result;
    }
}
