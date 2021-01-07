import ObjectOrientedProgramming.Utils.EndPointUtil;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static ObjectOrientedProgramming.Utils.EndPointUtil.doGetRequest;

public class UnitTestEndPoint extends EndPointUtil {
    @Test
    public void testGetPointPen() {
        Response response = doGetRequest("https://jsonplaceholder.typicode.com/users/");
        Map<String, String> company = response.jsonPath().getMap("company[0]");
        System.out.println(company);

    }
}
