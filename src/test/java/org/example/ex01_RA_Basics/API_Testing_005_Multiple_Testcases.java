package org.example.ex01_RA_Basics;

import io.restassured.RestAssured;

public class API_Testing_005_Multiple_Testcases {
    public static void main(String[] args) {

        String Pincode = "400101";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+Pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);

        Pincode = "400101";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+Pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);

        Pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/USA/"+Pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);

        Pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+Pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);
    }
}
