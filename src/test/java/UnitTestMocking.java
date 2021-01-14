import ObjectOrientedProgramming.Mocking.MockingA;
import ObjectOrientedProgramming.Mocking.MockingB;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class UnitTestMocking {

    /*
    Mocking is primarily used in unit testing. An object under test may have dependencies on other (complex) objects.
    To isolate the behavior of the object you want to replace the other objects by mocks that simulate the behavior of the real objects.
    This is useful if the real objects are impractical to incorporate into the unit test.

     In short, mocking is creating objects that simulate the behavior of real objects.
     */

    @Test
    public void testMocking() {
        // you mock data in your test
        MockingA myA = new MockingA();
        MockingB myB = mock(MockingB.class);

        // replace B with mocked B
        when(myB.funcMultiple(anyInt())).thenReturn(60);
        myA.object = myB;
        int actual = myA.funcMultiple2();

        assertEquals(60, actual);
    }

    @Test
    public void testWithoutMocking() {
        // test without mock data in your test, calling the real function in class B
        MockingB myB = new MockingB();
        int actual = myB.funcMultiple(22);

        assertEquals(66, actual);
    }
}
