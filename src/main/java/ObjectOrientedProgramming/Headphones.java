package ObjectOrientedProgramming;

import java.io.IOException;
import java.util.Properties;

public class Headphones extends Utils{
    Properties prop = readPropertiesFile("src/main/resources/myProp.properties");

    public String charge = "Micro usb";
    public String [] controls = {"power", "volume", "play/pause"}; //ArrayList
    public String color = "Red/black";

    public Boolean powerOff = Boolean.valueOf(prop.getProperty("poweroff"));
    public Boolean powerOn = Boolean.valueOf(prop.getProperty("poweron"));
    public int volume = Integer.parseInt(prop.getProperty("volume"));

    public Headphones() throws IOException {
    }

    public Boolean powerOn(){
        return powerOn;
    }

    public Boolean powerOff(){
        return powerOff;
    }

    public int volumeUp(){
        return volume++;
    }

    public int volumeDown(){
        return volume--;
    }

    public String charge(){
        return charge;
    }

    public String color(){
        return color;
    }
}
