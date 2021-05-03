import FatihObjectOrientedProgramming.Utils.EndPointUtil;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

public class APITestingSubscription extends EndPointUtil {

    Properties prop = readPropertiesFile("src/main/resources/myProp.properties");

    private final String endpointSubscription = prop.getProperty("subscriptionEndpoint");

    public APITestingSubscription() throws IOException {
    }

    @Test
    public void testGetSubscriptionByEmail() {
        doGetRequestSubscription(endpointSubscription + "?email=KRISTOF.CAUTAERTS@PERSGROEP.BE", "subscriptionByEmail.json");
    }

    @Test
    public void testGetSubscriptionByAccount() {
        doGetRequestSubscription(endpointSubscription + "?account=25a3a6bde73749b8a53c0a3072bf5bc6", "subscriptionByAccount.json");
    }

    @Test
    public void testGetSubscriptionByBrandLegacyCodeAndId() {
        doGetRequestSubscription(endpointSubscription + "/hln/324711", "subscriptionByBrandLegacyCodeAndId.json");
    }

    @Test
    public void testGetSubscriptionByBrandKeyAndId() {
        doGetRequestSubscription(endpointSubscription + "/dm/483986/accounts", "subscriptionByBrandKeyAndId.json");
    }
}
