package FatihObjectOrientedProgramming.Utils;

import FatihObjectOrientedProgramming.JavaBestPractices.Primitives;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utils extends Primitives{

    public static Properties prop;


    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            // create Properties class object
            prop = new Properties();
            // load properties file into it
            prop.load(fis);

        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            assert fis != null;
            fis.close();
        }

        return prop;
    }

    static {
        try {
            prop = readPropertiesFile("src/main/resources/myProp.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    };

}
