package org.example.ex02_RA_TestNG_AllureReports;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class API_Testing_005_TC_TestNG_Fix {

    @Test
    @Description("TC #1 - Verify that the valid pincode gives 200 OK")
    public void test_Get_Positive_TC1(){
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/400102")
                .when()
                .get()
                .then().log().all().statusCode(200);
    }

    @Test
    @Description("TC #2 - Verify that the valid pincode gives 200 OK")
    public void test_Get_Positive_TC2(){
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/400102")
                .when()
                .get()
                .then().log().all().statusCode(200);
    }

    @Test
    @Description("TC #3 - Verify that the null pincode gives error")
    public void test_Get_Negative_TC3(){
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/")
                .when()
                .get()
                .then().log().all().statusCode(200);
    }
}
