package ObjectOrientedProgramming;

import org.junit.Test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pen p = new Pen();
        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);

        System.out.println(p.clicked); // returns false
        p.click(); // virtual click
        System.out.println(p.clicked); // returns true after click


        Headphones h = new Headphones();
        System.out.println(h.charge);
        System.out.println(h.color);
        System.out.println(Arrays.toString(h.controls));

        System.out.println(h.power); // returns false
        h.powerOn(); // virtual powerOn
        System.out.println(h.power); // returns true
        h.powerOff(); // virtual powerOff
        System.out.println(h.power); //returns powerOff after click on powerOff

//        static int volume = 0;
//        volume++; && volume--;
        System.out.println(Headphones.volume); // returns false
        h.volumeUp(); // virtual volumeUp
        System.out.println(Headphones.volume); // returns 1 after virtual click on volumeUp
        h.volumeUp(); // virtual volumeUp
        System.out.println(Headphones.volume); // returns 2 after virtual click on volumeUp

    }

}
