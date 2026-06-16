package com.janoz.epic;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class EpicResourceTest {

    @Test
    void testHelloEndpoint() {
        given()
                .when().get("/epic")
                .then()
                .statusCode(200)
                .body(is("Epic \uD83E\uDD19"));
    }
}
