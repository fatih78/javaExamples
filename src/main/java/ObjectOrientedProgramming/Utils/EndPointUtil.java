package ObjectOrientedProgramming.Utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;


public class EndPointUtil {


    public static void doGetRequest(String endpoint) {
        RestAssured.defaultParser = Parser.JSON;
        given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                when().
                get(endpoint).
                then().
                assertThat().
                statusCode(200).
                body(matchesJsonSchemaInClasspath("result.json")).
                body("season", contains("2017"));

    }
}
