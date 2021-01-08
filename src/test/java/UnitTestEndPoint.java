import ObjectOrientedProgramming.Utils.EndPointUtil;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static ObjectOrientedProgramming.Utils.EndPointUtil.doGetRequest;

public class UnitTestEndPoint extends EndPointUtil {
    Properties prop = readPropertiesFile("src/main/resources/myProp.properties");

    public UnitTestEndPoint() throws IOException {
        this.prop = prop;
    }

    private final String endpoint1 = prop.getProperty("endpoint1");
    private final String endpoint2 = prop.getProperty("endpoint2");

    @Test
    public void testGetEndPointOne() {
        doGetRequest(endpoint1, "result.json");
    }

    @Test
    public void testGetEndPointTwo() {
        doGetRequest(endpoint2, "result2.json");
    }
}
