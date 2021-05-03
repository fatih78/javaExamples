import FatihObjectOrientedProgramming.Utils.EndPointUtil;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

public class UnitTestEndPoint extends EndPointUtil {
    Properties prop = readPropertiesFile("src/main/resources/myProp.properties");

    public UnitTestEndPoint() throws IOException {
        this.prop = prop;
    }

    private final String endpoint1 = prop.getProperty("endpoint1");
    private final String endpoint2 = prop.getProperty("endpoint2");
    private final String endpointSubscription = prop.getProperty("subscriptionEndpoint");

    @Test
    public void testGetEndPointOne() {
        doGetRequest(endpoint1, "result.json");
    }

    @Test
    public void testGetEndPointTwo() {
        doGetRequest(endpoint2, "result2.json");
    }

}

