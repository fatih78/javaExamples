import org.junit.Test;

import static ObjectOrientedProgramming.Utils.EndPointUtil.doGetRequest;

public class UnitTestEndPoint {
    @Test
    public void testGetPointPen() {
        doGetRequest("http://ergast.com/api/f1/2017/circuits.json");
    }
}
