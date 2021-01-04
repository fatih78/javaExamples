package ObjectOrientedProgramming;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Utils {
    static boolean clickedfinal1;
    static boolean clickedfinal2;
    static int pointfinal;
    static String colorfinal;
    static String typefinal;


    Properties prop = new Properties();

    //    method to load boolean values from properties file
    public List<Boolean> loadBooleanA() {
        List<Boolean> booleans = new ArrayList<Boolean>(Arrays.asList(new Boolean[0]));

        try (InputStream fis = new FileInputStream("src/main/resources/myProp.properties")) {
            prop.load(fis);
            Utils.clickedfinal1 = booleans.add(Boolean.parseBoolean(prop.getProperty("clicked")));
            Utils.clickedfinal2 = booleans.add(Boolean.parseBoolean(prop.getProperty("unclicked")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return booleans;
    }

    public int loadInt() {
        try (InputStream fis = new FileInputStream("src/main/resources/myProp.properties")) {
            prop.load(fis);
            pointfinal = Integer.parseInt((prop.getProperty("point")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pointfinal;
    }

    public List<String> loadString() {
        List<String> strings = new ArrayList<String>(Arrays.asList(new String[4]));
        try (InputStream fis = new FileInputStream("src/main/resources/myProp.properties")) {
            prop.load(fis);
            colorfinal = String.valueOf(strings.add(prop.getProperty("color")));
            typefinal = String.valueOf(strings.add(prop.getProperty("type")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strings;
    }

}
