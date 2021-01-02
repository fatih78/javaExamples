package ObjectOrientedProgramming;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest {
    @Test
    public void testPen(){
        Pen p = new Pen();
        p.click();
        Assert.assertTrue(p.clicked = true);

    }
}
