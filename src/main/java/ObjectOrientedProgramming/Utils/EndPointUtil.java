package ObjectOrientedProgramming.Utils;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.given;


public class EndPointUtil {


    public static void doGetRequest(String endpoint, String JsonFile) {
        given().
                header("Accept", "application/json").
                when().
                get(endpoint).
                then().
                log().ifStatusCodeIsEqualTo(200).
                and().
                contentType(ContentType.JSON).
                assertThat().
                statusCode(200).
                body(JsonSchemaValidator.matchesJsonSchemaInClasspath(JsonFile));

    }
}
