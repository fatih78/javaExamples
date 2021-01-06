package ObjectOrientedProgramming;

import ObjectOrientedProgramming.Utils.Utils;

import java.io.IOException;
import java.util.Properties;

public class Calculator extends Utils {
    Properties prop = readPropertiesFile("src/main/resources/myProp.properties");
    public int result;
    public int number1 = Integer.parseInt(prop.getProperty("number1"));
    public int number2 = Integer.parseInt(prop.getProperty("number2"));

    public Calculator() throws IOException {
    }

    public int timesTableNumber1() {
        for (int i = 0; i <= 10; i++) {
            result = number1 * i;
            System.out.println(number1+" * "+i+" = "+number1*i);
        }
        return result;
    }

    public int timesTableNumber2() {
        for (int i = 0; i <= 10; i++) {
            result = number2 * i;
            System.out.println(number2+" * "+i+" = "+number2*i);
        }
        return result;
    }
}
