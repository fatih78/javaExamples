import ObjectOrientedProgramming.Mapping.Mapping;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestMapping extends Mapping{

    Mapping m = new Mapping();

    @Test
    public void mapping1() {
        Assert.assertEquals(m.Mapping().get("Fatih"), "Topcuoglu");
    }

    @Test
    public void mapping2() {
        Assert.assertEquals(m.Mapping().get("Rola"), "Al-Farhan");
    }

    @Test
    public void mapping3() {
        Assert.assertEquals(m.Mapping().get("Yusuf"), "Topcuoglu");
    }

    @Test
    public void mapping4() {
        Assert.assertEquals(m.Mapping().get("Elanur"), "Topcuoglu");
    }

    @Test
    public void mapping5() {
        Assert.assertEquals(m.Mapping().get("Harun"), "Topcuoglu");
    }

    @Test
    public void mapping6() {
        m.Mapping().put("Volvo", "V60");
//        Assert.assertEquals(m.Mapping().get("Volvo"), "V60");
    }

}
