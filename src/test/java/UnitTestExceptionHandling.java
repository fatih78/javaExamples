import ObjectOrientedProgramming.Exceptions;
import ObjectOrientedProgramming.Mocking.MockingA;
import ObjectOrientedProgramming.Mocking.MockingB;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UnitTestExceptionHandling {

    @Test

    public void testExceptionHandling() {
        Exceptions e = new Exceptions("src/main/resources/myProp.propertie");

    }
}
