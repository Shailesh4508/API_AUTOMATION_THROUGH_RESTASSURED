package org.example.ex01_RA_Basics;

import io.restassured.RestAssured;

public class API_Testing_001 {
    public static void main(String[] args) {


        // Gherkins Syntax
// Given() -> Pre Req. - URL, Headers, Auth, Body....
// When() -> HTTP method? - GET/POST/PUT/PATCH, DELETE...
// Then() -> Validation -> 200 oK, firstname == SHAILESH

//        Full url --- https://api.zippopotam.us/IN/560016
//        Base url --- https://api.zippopotam.us
//        bath Path --- /IN/400101

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560016")
                .when()
                .get()
                .then().log().all().statusCode(200);
    }
}
