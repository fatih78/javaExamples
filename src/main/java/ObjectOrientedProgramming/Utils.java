package ObjectOrientedProgramming;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Utils {
//    method to load properties
    public boolean load(){
        Properties prop = new Properties();
        try(InputStream fis = new FileInputStream("myProp.properties")) {
            prop.load(fis);
        }
        catch(Exception e) {
            System.out.println("Unable to find the specified properties file");
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
