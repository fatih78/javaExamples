import ObjectOrientedProgramming.CustomExceptionHandling.Student;
import ObjectOrientedProgramming.Utils.CustomException;
import org.junit.Test;

public class UnitTestExceptionHandling {
    Student st = new Student();

    @Test
    public void testExceptionHandling() throws CustomException {

        try {
            Student student = st.find("0000001");

        } catch (CustomException ex) {
            throw new CustomException("Could not find studentID");
//            System.err.print(ex);
        }
    }

    @Test
    public void noExceptionHandling() throws CustomException {

        try {
            Student student = st.find("123456");

        } catch (CustomException ex) {
            throw new CustomException("Could not find studentID");
//            System.err.print(ex);
        }
    }
}
