import ObjectOrientedProgramming.Pen;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestPen {
    Pen p = new Pen();

    @Test
    public void testPenClick() {
        p.click();
        Assert.assertTrue(p.clicked = true);

    }

    @Test
    public void testPenUnClick() {
        p.unclick();
        Assert.assertTrue(p.clicked = true);

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
