package FatihObjectOrientedProgramming.CustomExceptionHandling;

import FatihObjectOrientedProgramming.Utils.CustomException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Student {
    public static String exceptionMessage;

    public Object find(String studentID) throws CustomException {
        try {
            if (studentID.equals("123456")) {
                return new Student();
            } else {
                throw new CustomException("Could not find student with ID " + studentID);
            }
        } catch (CustomException e) {
            assertThat(e.getMessage(), is("Could not find student with ID 0000001"));
            return exceptionMessage = e.getMessage();
        }

    }
}

