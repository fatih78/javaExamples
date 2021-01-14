package ObjectOrientedProgramming.Mocking;

public class MockingCustomerReader extends MockingCustomer{
    MockingCustomer mockingCustomer = new MockingCustomer();


    public String findFullName(String s){
        return mockingCustomer.firstName +" "+ mockingCustomer.lastName;
    }

}