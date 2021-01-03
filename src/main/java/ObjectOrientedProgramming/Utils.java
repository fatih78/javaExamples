package ObjectOrientedProgramming;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Utils {
    static boolean clickedfinal;
    static int pointfinal;
    static String colorfinal;
    static String typefinal;


    Properties prop = new Properties();

    //    method to load properties
    public boolean loadBoolean(){
        try(InputStream fis = new FileInputStream("src/main/resources/myProp.properties")) {
            prop.load(fis);
            clickedfinal = Boolean.parseBoolean(prop.getProperty("clicked"));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return clickedfinal;
    }

    public int loadInt(){
        try(InputStream fis = new FileInputStream("src/main/resources/myProp.properties")) {
            prop.load(fis);
            pointfinal = Integer.parseInt((prop.getProperty("point")));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return pointfinal;
    }

    public String loadStringColor(){

        try(InputStream fis = new FileInputStream("src/main/resources/myProp.properties")) {
            prop.load(fis);
            colorfinal = prop.getProperty("color");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return colorfinal;
    }

    public String loadStringType(){

        try(InputStream fis = new FileInputStream("src/main/resources/myProp.properties")) {
            prop.load(fis);
            typefinal = prop.getProperty("type");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return typefinal;
    }
}
