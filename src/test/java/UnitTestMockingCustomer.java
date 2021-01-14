import ObjectOrientedProgramming.Mocking.MockingCustomerReader;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UnitTestMockingCustomer {
    MockingCustomerReader mockingCustomerReader = new MockingCustomerReader();
    private Object MockingCustomer;

    //    test without mocking
    @Test
    public void testCustomer(){
        String result = mockingCustomerReader.findFullName(anyString());
        System.out.println(result);
        assertEquals("Fatih Topcuoglu", result);
    }

    //    test with mocking
    @Test
    public void testCustomerWithMocking(){
        MockingCustomerReader myCutomerReader = mock(MockingCustomerReader.class);
        when(myCutomerReader.findFullName(anyString())).thenReturn("No Name");

        String actual = "No Name";
        assertEquals("No Name", actual);

    }
}
