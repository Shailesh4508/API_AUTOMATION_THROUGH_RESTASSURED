package org.example.ex03_GET_Request;


import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API_Testing_008_Non_BDD_Style {

   RequestSpecification r;
   Response response;
   ValidatableResponse vr;

@Description ("TC #1 Verify the Get Req Positive")
    @Test
    public void test_NonBDD_Style_GET_positive(){
    String pincode = "400106";

    r = RestAssured.given();
    r.baseUri("https://api.zippopotam.us");
    r.basePath("/IN/" + pincode);

    response = r.when().log().all().get();

    vr = response.then().log().all().statusCode(200);
}

    @Description ("TC #2 Verify the Get Req Negative")
    @Test
    public void test_NonBDD_Style_GET_negative(){
        String pincode = "-1";

        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        response = r.when().log().all().get();

        vr = response.then().log().all().statusCode(404);
    }
}
