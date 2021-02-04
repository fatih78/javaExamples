package ObjectOrientedProgramming.JavaBestPractices;


import ObjectOrientedProgramming.Utils.Utils;

import java.io.IOException;

public class Pen extends Utils {

    private final String type = prop.getProperty("type");
    private final String color = prop.getProperty("color");
    private final int point = Integer.parseInt(prop.getProperty("point"));
    private final Boolean clicked = Boolean.valueOf(prop.getProperty("clicked"));
    private final Boolean unclicked = Boolean.valueOf(prop.getProperty("unclicked"));

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
    private Boolean getClicked() {
        return clicked;
    }

    private Boolean getUnClicked() {
        return unclicked;
    }

    public Boolean click() {
        return getClicked();
    }

    public Boolean unclick() {
        return getUnClicked();
    }

}
