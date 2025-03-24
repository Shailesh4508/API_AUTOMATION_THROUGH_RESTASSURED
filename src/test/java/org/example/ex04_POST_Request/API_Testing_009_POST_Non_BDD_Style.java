package org.example.ex04_POST_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class API_Testing_009_POST_Non_BDD_Style {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Description ("TC #1 Verify the POST Req Positive")
    @Test
    public void test_POST_Non_BDD_Style_Create_Token(){
        // URL, Method, PayLoad, Body / Headers
        // Auth

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        // Part 1 -> Pre Condition - Preparing Request - URL, Header, Payload, Auth
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload);

        // Part 2  -> Making HTTP Request
        response = r.when().log().all().post();

        // Part 3 -> Validation

        vr = response.then().log().all().statusCode(200);
    }
}
