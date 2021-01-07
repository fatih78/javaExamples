import ObjectOrientedProgramming.Utils.EndPointUtil;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static ObjectOrientedProgramming.Utils.EndPointUtil.doGetRequest;

public class UnitTestEndPoint extends EndPointUtil {
    @Test
    public void testGetEndPoint() {
        doGetRequest("http://ergast.com/api/f1/2017/circuits.json", "result.json");
    }
}
