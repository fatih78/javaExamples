import ObjectOrientedProgramming.Pen;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestPen {
    Pen p = new Pen();
    private final Boolean a = p.clicked;
    private final Boolean b = p.unclicked;

    @Test
    public void testPenClick() {
        p.click();
        System.out.println(a);
        Assert.assertEquals(a, Boolean.TRUE);

    }

    @Test
    public void testPenUnClick() {
        p.unclick();
        Assert.assertEquals(b,  Boolean.FALSE);
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
