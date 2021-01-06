import ObjectOrientedProgramming.Headphones;
import ObjectOrientedProgramming.Utils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class UnitTestHeadPhones extends Utils {

    Headphones h = new Headphones();


    public UnitTestHeadPhones() throws IOException {
    }

    @Test
    public void headPrhonePowerOn() {
        h.powerOn();
        System.out.println(h.powerOn);
        Assert.assertEquals(h.powerOn, Boolean.TRUE);
    }

    @Test
    public void headPhonePowerOff() {
        h.powerOff();
        System.out.println(h.powerOff);
        Assert.assertEquals(h.powerOff, Boolean.FALSE);
    }

    @Test
    public void headPhoneVolumeUp() {
        h.volumeUp();
        h.volumeUp();
        System.out.println(h.volume);
        Assert.assertEquals(h.volume, 2);
    }

    @Test
    public void headPhoneVolumeDown() {
        h.volumeUp();
        h.volumeDown();
        System.out.println(h.volume);
        Assert.assertEquals(h.volume, 0);
    }

    @Test
    public void headPhoneSpecificationOne() {
        h.charge();
        System.out.println(h.charge);
        Assert.assertEquals(h.charge, "Micro usb");
    }

    @Test
    public void headPhoneSpecificationTwo() {
        h.color();
        System.out.println(h.color);
        Assert.assertEquals(h.color, "Red/black");
    }

    @Test
    public void headPhoneSpecificationThree() {
        h.controls();
        System.out.println(h.controls);
        Assert.assertEquals(h.controls, "power, volume, play/pause");
    }
}
