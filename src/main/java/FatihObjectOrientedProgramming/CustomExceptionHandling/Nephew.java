package FatihObjectOrientedProgramming.CustomExceptionHandling;

import FatihObjectOrientedProgramming.Utils.CustomException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Nephew {
    public static String exceptionMessage;


    public Object find(String nephewName) throws CustomException {
        try {
            if (nephewName.equals("Suleyman")) {
                return new Nephew();
            } else {
                throw new CustomException("Could not find nephew with name " + nephewName);
            }
        } catch (CustomException e) {
            assertThat(e.getMessage(), is("Could not find nephew with name blabla"));
            return exceptionMessage = e.getMessage();
        }
    }
}
