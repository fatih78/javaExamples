package FatihObjectOrientedProgramming.Utils;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.given;


public class EndPointUtil extends Utils{


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

    public static void doGetRequestSubscription(String endpoint, String JsonFile) {
        given().
                contentType(ContentType.JSON).
                header("x-api-key","nGmgv3Yp2G8ppk8fo8z27852NQlufnqE42lJeD76").
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
