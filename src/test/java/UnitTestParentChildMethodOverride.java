import ObjectOrientedProgramming.Child;
import ObjectOrientedProgramming.Parent;
import org.junit.Assert;
import org.junit.Test;

public class UnitTestParentChildMethodOverride {
    Parent obj1 = new Parent();
    Parent obj2 = new Child();

    @Test
    public void methodOverride() {
/*         If a Parent type reference refers
         to a Parent object, then Parent's
         show is called
*/
        obj1.show();
        String message1 = obj1.show();
        Assert.assertEquals(message1, "Parent's show()");

/*         If a Parent type reference refers
         to a Child object Child's show()
         is called. This is called RUN TIME
         POLYMORPHISM.
*/
        String message2 = obj2.show();
        Assert.assertEquals(message2, "Childs's shown()");

    }
}
