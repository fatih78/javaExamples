import ObjectOrientedProgramming.CustomExceptionHandling.FileReader;
import ObjectOrientedProgramming.CustomExceptionHandling.LockDown;
import ObjectOrientedProgramming.CustomExceptionHandling.Nephew;
import ObjectOrientedProgramming.CustomExceptionHandling.Student;
import ObjectOrientedProgramming.Utils.CustomException;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class UnitTestExceptionHandling {

    LockDown ld = new LockDown();
    Student st = new Student();
    FileReader fr = new FileReader();
    Nephew nw = new Nephew();


    SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");

    public UnitTestExceptionHandling() throws ParseException {
    }

    //    throws customException "Avondklok not started yet"
    @Test
    public void testExceptionHandlingLockdown() throws CustomException, ParseException {
        Date dateException = sdformat.parse("2021-01-21");
        try {
            ld.find(dateException);
        } catch (CustomException ex) {
            throw new CustomException("Avondklok not started yet" + "" + dateException);
        }
    }

    //    No Exception
    @Test
    public void noExceptionHandlingLockdown() throws CustomException, ParseException {
        Date dateNoException = sdformat.parse("2021-01-23");
        try {
            ld.find(dateNoException);
        } catch (CustomException | ParseException ex) {
            throw new CustomException("Avondklok not started yet" + dateNoException);
        }
    }

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

    //    throws customException "Could not find Nephew"
    @Test
    public void testExceptionHandlingNephew() throws CustomException {
        try {
            nw.find("blabla");
        } catch (CustomException ex) {
            throw new CustomException("Could not find Nephew");
//            System.err.print(ex);
        }
    }

    @Test
    public void noExceptionHandlingNephew() throws CustomException {
        try {
            nw.find("Suleyman");
        } catch (CustomException ex) {
            throw new CustomException("Could not find Nephew");
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
