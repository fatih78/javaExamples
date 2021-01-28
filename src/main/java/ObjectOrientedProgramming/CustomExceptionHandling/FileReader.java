package ObjectOrientedProgramming.CustomExceptionHandling;

import ObjectOrientedProgramming.Utils.CustomException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FileReader {
    public static String exceptionMessage;

    public String find(String fileName) throws CustomException, IOException {
        try {
            if (fileName != null) {
                try {
                    FileInputStream fis = new FileInputStream(fileName);
                    Properties prop = new Properties();
                    prop.load(fis);

                } catch (IOException e) {
                    throw new CustomException("Could not find file " + fileName);
                }
            }
        } catch (CustomException e) {
            assertThat(e.getMessage(), is("Could not find file blabla"));
            return exceptionMessage = e.getMessage();
        }
        return fileName;
    }
}
