package ObjectOrientedProgramming.CustomExceptionHandling;

import ObjectOrientedProgramming.Utils.CustomException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReader {

    public void find(String fileName) throws CustomException, IOException {
        FileInputStream fis = null;
        Properties prop = null;
        if (fileName != null) {
            try {
                fis = new FileInputStream(fileName);
                prop = new Properties();
                prop.load(fis);

            } catch (IOException e) {
                throw new CustomException("Could not find file " + fileName);
            }
        }
    }
}
