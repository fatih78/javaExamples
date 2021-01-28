package ObjectOrientedProgramming.CustomExceptionHandling;

import ObjectOrientedProgramming.Utils.CustomException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LockDown {
    SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
    public static String exceptionMessage;

    public LockDown() throws ParseException {
    }

    public Object find(Date date) throws CustomException, ParseException {
        Date d2 = sdformat.parse("2021-01-22");
        try {
            if (date.compareTo(d2) >= 0) {
                return new LockDown();
            } else {
                throw new CustomException("Avondklok not started yet: " + date);
            }
        } catch (CustomException e) {
            return exceptionMessage = e.getMessage();
        }
    }
}
