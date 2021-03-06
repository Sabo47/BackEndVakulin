package VakulinGetComplexSearch;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class Test2Pizza {

    private final String apiKey = "31db9b7011e14c63a1645083058e2bf8";

    @Test
    void getBurgerTest() {
        given()
                .queryParam("apiKey", apiKey)
                .queryParam("pizza")
                .when()
                .get("https://api.spoonacular.com/recipes/716429/information")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(5000L))
                .statusLine("HTTP/1.1 200 OK");
    }
}

