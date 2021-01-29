package ObjectOrientedProgramming.CustomExceptionHandling;

import ObjectOrientedProgramming.Utils.CustomException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Sulo {
    public static String result;
    public static String exceptionMessage;

    public String ifloop1(int a, int b) {
        try {
            if (a == b) {
                System.out.println(result = "A is gelijk aan B");
            } else {
                throw new CustomException("Could not match values");
            }
        } catch (CustomException e){
            assertThat(e.getMessage(), is("Could not match values"));
            return exceptionMessage = e.getMessage();
        }
        return result;
    }
}
