package org.example.ex03_GET_Request;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class API_Testing_006_BDD_Style {
    @Test
    public void test_BDD_GET(){
        String pincode = "560016";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }
}
