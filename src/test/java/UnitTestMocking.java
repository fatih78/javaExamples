import ObjectOrientedProgramming.MockingA;
import ObjectOrientedProgramming.MockingB;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class UnitTestMocking {

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
