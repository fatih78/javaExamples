import ObjectOrientedProgramming.Overriding.Child;
import ObjectOrientedProgramming.Overriding.Parent;
import org.junit.Assert;
import org.junit.Test;

/*         If a Parent type reference refers
         to a Parent object, then Parent's
         show is called
*/

/*         If a Parent type reference refers
         to a Child object Child's show()
         is called. This is called RUN TIME
         POLYMORPHISM.
*/

/*
Instance methods can be overridden only if they are inherited by the subclass.
A method declared final cannot be overridden.
A method declared static cannot be overridden but can be re-declared.
 */

public class UnitTestParentChildMethodOverride {
//    POLYMORPHISM!
    Parent obj1 = new Parent();
    Parent obj2 = new Child(); // Child reference but Parent object

    @Test
    public void methodShown() {
        Assert.assertEquals(obj1.show(), "Parent is shown");
        Assert.assertEquals(obj2.show(), "Child is shown");  // runs the method in Child class

    }

    @Test
    public void methodTalk() {
        Assert.assertEquals(obj1.talk(), "Parent is talking");
        Assert.assertEquals(obj2.talk(), "Child is talking");

    }
}
