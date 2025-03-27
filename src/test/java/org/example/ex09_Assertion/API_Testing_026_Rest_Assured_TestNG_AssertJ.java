package org.example.ex09_Assertion;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.assertj.core.api.Assertions.*;

public class API_Testing_026_Rest_Assured_TestNG_AssertJ {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    String token;
    String bookingid;
    String payload = "{\n" +
            "    \"firstname\" : \"Shailesh\",\n" +
            "    \"lastname\" : \"Singh\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2025-01-01\",\n" +
            "        \"checkout\" : \"2025-02-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";


    @Test
    public void test(){

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload).log().all();

        response = requestSpecification.when().post();

        validatableResponse = response.then().log().all();

        // Rest Assured Assertions//
        validatableResponse.statusCode(200);
        validatableResponse.body("booking.firstname",Matchers.equalTo("Shailesh"));
        validatableResponse.body("booking.lastname",Matchers.equalTo("Singh"));
        validatableResponse.body("bookingid",Matchers.notNullValue());
        validatableResponse.body("booking.depositpaid",Matchers.equalTo(true));

        // TestNG Assertion -  Soft and Hard Assertion - first extract bookingid, firstname and lastname from response
        bookingid = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        //Hard Assertion
        Assert.assertNotNull(bookingid);
        Assert.assertEquals(firstname,"Shaiilesh");
        Assert.assertEquals(lastname,"Singh");

        //Soft Assertion
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(firstname,"Shaiilesh");
        softAssert.assertEquals(lastname,"Singh");

        // AssertJ (3rd Library to Assertion)
        assertThat(bookingid).isNotNull().isNotEmpty();
        assertThat(firstname).isEqualTo("Shailesh").isNotEmpty().isNotBlank().isNotNull();
    }
}
