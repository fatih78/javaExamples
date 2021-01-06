package ObjectOrientedProgramming;


import ObjectOrientedProgramming.Utils.Utils;

import java.io.IOException;
import java.util.Properties;

public class Pen extends Utils {

    Properties prop = readPropertiesFile("src/main/resources/myProp.properties");

    private final String type = prop.getProperty("type");
    private final String color = prop.getProperty("color");
    private final int point = Integer.parseInt(prop.getProperty("point"));
    public Boolean clicked = Boolean.valueOf(prop.getProperty("clicked"));
    public Boolean unclicked = Boolean.valueOf(prop.getProperty("unclicked"));

    public Pen() throws IOException {
    }

    // Getters
    private String getType() {
        return type;
    }

    private String getColor() {
        return color;
    }

    private int getPoint() {
        return point;
    }

    public String type() {
        return getType();
    }

    public String color() {
        return getColor();
    }

    public int point() {
        return getPoint();
    }

    //    methods
    public Boolean click() {
        return clicked;
    }

    public Boolean unclick() {
        return unclicked;
    }

//    protected static int a;
//    public static void main (String[] args) {
//        if (a == 1 ) {
//            System.out.println("a is zero!");
//        } else {
//            System.out.println("a is NOT zero!");
//        }
//    }
}
