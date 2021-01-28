import ObjectOrientedProgramming.CustomExceptionHandling.*;
import ObjectOrientedProgramming.Utils.CustomException;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class UnitTestExceptionHandling {

    LockDown ld = new LockDown();
    Student st = new Student();
    FileReader fr = new FileReader();
    Nephew nw = new Nephew();
    Sulo s = new Sulo();


    SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");

    public UnitTestExceptionHandling() throws ParseException {
    }

    //    throws customException "Avondklok not started yet"
    @Test
    public void testExceptionHandlingLockdown() throws CustomException, ParseException {
        Date dateException = sdformat.parse("2021-01-21");
        ld.find(dateException);
        assertThat(ld.exceptionMessage, is("Avondklok not started yet: Thu Jan 21 00:00:00 CET 2021"));

    }

    //    No Exception
    @Test
    public void noExceptionHandlingLockdown() throws CustomException, ParseException {
        Date dateNoException = sdformat.parse("2021-01-23");
        ld.find(dateNoException);

    }

    //    throws customException "Could not find studentID"
    @Test
    public void testExceptionHandlingStudent() throws CustomException {
        st.find("0000001");
        assertThat(st.exceptionMessage, is("Could not find student with ID 0000001"));
    }

    @Test
    public void noExceptionHandlingStudent() throws CustomException {
        st.find("123456");
    }

    //    throws customException "Could not find Nephew"
    @Test
    public void testExceptionHandlingNephew() throws CustomException {
        nw.find("blabla");
        assertThat(nw.exceptionMessage, is("Could not find nephew with name blabla"));
    }

    @Test
    public void noExceptionHandlingNephew() throws CustomException {
        nw.find("Suleyman");
    }

    //    throws customException "Could not find file blabla"
    @Test
    public void testExceptionHandlingFileReader() throws IOException, CustomException {
        fr.find("blabla");
        assertThat(fr.exceptionMessage, is("Could not find file blabla"));
    }

    @Test
    public void noExceptionHandlingFileReader() throws IOException, CustomException {
        fr.find("src/main/resources/myProp.properties");
    }

    @Test
    public  void UnitTestSulo1(){
        s.ifloop1(123, 123);
        Assert.assertEquals(s.result, "A is gelijk aan B");
    }

    @Test
    public  void UnitTestSuloException(){
        s.ifloop1(1, 2);
        assertThat(s.exceptionMessage, is("Could not match values"));
    }
}
