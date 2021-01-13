import ObjectOrientedProgramming.MockingA;
import ObjectOrientedProgramming.MockingB;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class UnitTestMocking {

    @Test
    public void test() {
        MockingA myA = new MockingA();
        MockingB myB = mock(MockingB.class);

//        // dummy function
        when(myB.funcMultiple(anyInt())).thenReturn(60);

        // replace B with mocked B
        myA.object= myB;
        int actual = myA.funcMultiple2();

        assertEquals(60, actual);
    }
}
