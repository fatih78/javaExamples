package ObjectOrientedProgramming;

public class Headphones {

    String charge = "Micro usb";
    String [] controls = {"power", "volume", "play/pause"}; //ArrayList
    String color = "Red/black";

    boolean power = false;
    static int volume = 0;

    public void powerOn(){
        power = true;
    }

    public void powerOff(){
        power = false;
    }

    public  void volumeUp(){
        volume++;
    }

    public static void volumeDown(){
        volume--;
    }
}
