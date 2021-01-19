import ObjectOrientedProgramming.CustomExceptionHandling.FileReader;
import ObjectOrientedProgramming.CustomExceptionHandling.Student;
import ObjectOrientedProgramming.Utils.CustomException;
import java.io.IOException;
import org.junit.Test;

public class UnitTestExceptionHandling {
    Student st = new Student();
    FileReader fr = new FileReader();

//    throws customException "Could not find studentID"
    @Test
    public void testExceptionHandlingStudent() throws CustomException {
        try {
            st.find("0000001");
        } catch (CustomException ex) {
            throw new CustomException("Could not find studentID");
//            System.err.print(ex);
        }
    }

    @Test
    public void noExceptionHandlingStudent() throws CustomException {
        try {
            st.find("123456");
        } catch (CustomException ex) {
            throw new CustomException("Could not find studentID");
//            System.err.print(ex);
        }
    }

//    throws customException "Could not find file blabla"
    @Test
    public void testExceptionHandlingFileReader() throws IOException, CustomException {
        fr.find("blabla");
    }

    @Test
    public void noExceptionHandlingFileReader() throws IOException, CustomException {
        fr.find("src/main/resources/myProp.properties");
    }
}
