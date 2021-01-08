package ObjectOrientedProgramming;

import ObjectOrientedProgramming.Utils.Utils;

import java.io.IOException;
import java.util.Properties;

public class Headphones extends Utils {

    private final String controls = prop.getProperty("controls");
    private final String charge = prop.getProperty("charge");
    private final String color = prop.getProperty("colorheadphone");
    private final Boolean powerOff = Boolean.valueOf(prop.getProperty("poweroff"));
    private final Boolean powerOn = Boolean.valueOf(prop.getProperty("poweron"));
    private int volumeUp = Integer.parseInt(prop.getProperty("volume"));
    private int volumeDown = Integer.parseInt(prop.getProperty("volume"));

    public Headphones() throws IOException {
    }

    public String getControls() {
        return controls;
    }

    public String getCharge() {
        return charge;
    }

    public String getColor() {
        return color;
    }

    public Boolean getPowerOff() {
        return powerOff;
    }

    public Boolean getPowerOn() {
        return powerOn;
    }

    public int getVolumeUp() {
        return volumeUp++;
    }

    public int getVolumeDown() {
        return volumeDown++;
    }


    public Boolean powerOn() {
        return getPowerOn();
    }

    public Boolean powerOff() {
        return getPowerOff();
    }

    public int volumeUp() {
        return getVolumeUp();
    }

    public int volumeDown() {
        return getVolumeDown();
    }

    public String charge() {
        return getCharge();
    }

    public String color() {
        return getColor();
    }

    public String controls() {
        return getControls();
    }
}
