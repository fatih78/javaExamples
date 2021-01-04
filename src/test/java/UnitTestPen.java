import ObjectOrientedProgramming.Pen;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestPen {
    Pen p = new Pen();
    private final boolean a = p.clicked;
    private final boolean b = p.unclicked;

    @Test
    public void testPenClick() {
        p.click();
        Assert.assertEquals(a, true);
        System.out.println(a);

    }

    @Test
    public void testPenUnClick() {
        p.unclick();
        Assert.assertEquals(b, false);
        System.out.println(b);
    }

    @Test
    public void testGetColorPen() {
        Assert.assertEquals("blue", p.color());

    }

    @Test
    public void testGetTypePen() {
        Assert.assertEquals("gel", p.type());

    }

    @Test
    public void testGetPointPen() {
        Assert.assertEquals(10, p.point());

    }
}
