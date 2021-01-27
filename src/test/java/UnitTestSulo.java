import ObjectOrientedProgramming.Sulo;
import org.junit.Assert;
import org.junit.Test;


public class UnitTestSulo extends Sulo {

    Sulo s = new Sulo();

    @Test
    public  void UnitTestSulo1(){
        s.ifloop1(123, 123, 100);
        System.out.println(result);
        Assert.assertEquals(result, "A is niet gelijk aan B");
    }
}
