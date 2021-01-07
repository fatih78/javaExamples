package ObjectOrientedProgramming.Utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;

import static io.restassured.RestAssured.given;

public class EndPointUtil {


        public static void doGetRequest(String endpoint) {
            RestAssured.defaultParser = Parser.JSON;
            given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                    when().get(endpoint).
                    then().contentType(ContentType.JSON).extract().response();

    }

}
