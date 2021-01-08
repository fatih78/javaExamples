package ObjectOrientedProgramming.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {

    public static Properties prop;

    static {
        try {
            prop = readPropertiesFile("src/main/resources/myProp.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    };

    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            // create Properties class object
            prop = new Properties();
            // load properties file into it
            prop.load(fis);

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            fis.close();
        }

        return prop;
    }

}
