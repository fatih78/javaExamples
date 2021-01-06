import ObjectOrientedProgramming.Pen;
import ObjectOrientedProgramming.Utils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class UnitTestPen extends Utils {

    Pen p = new Pen();
    private final Boolean a = p.clicked;
    private final Boolean b = p.unclicked;

    public UnitTestPen() throws IOException {
    }

    @Test
    public void testPenClick() {
        p.click();
        System.out.println(a);
        Assert.assertEquals(a, Boolean.TRUE);

    }

    @Test
    public void testPenUnClick() {
        p.unclick();
        Assert.assertEquals(b, Boolean.FALSE);
        System.out.println(b);
    }

    @Test
    public void testGetColorPen() {
        Assert.assertEquals("blue", p.color());
        System.out.println(p.color());

    }

    @Test
    public void testGetTypePen() {
        Assert.assertEquals("gel", p.type());
        System.out.println(p.type());
    }

    @Test
    public void testGetPointPen() {
        Assert.assertEquals(10, p.point());
        System.out.println(p.point());
    }
}
