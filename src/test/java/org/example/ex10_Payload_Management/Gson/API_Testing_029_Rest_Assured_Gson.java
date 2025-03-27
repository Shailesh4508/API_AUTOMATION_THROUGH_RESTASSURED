package org.example.ex10_Payload_Management.Gson;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class API_Testing_029_Rest_Assured_Gson {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Test
    public void test_create_booking_positive(){

        Booking booking = new Booking();
        booking.setFirstname("Samar");
        booking.setLastname("Singh");
        booking.setTotalprice(2000);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-08");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Lunch");


        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        System.out.println(jsonStringBooking);

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonStringBooking).log().all();

        Response response = requestSpecification.when().post();
        String jsonResponseString  = response.asString();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        // Case1 - extract() - Direct Extraction
       String firstname = response.then().extract().path("booking.firstname");
       String lastname = response.then().extract().path("booking.lastname");
        System.out.println(firstname);
        System.out.println(lastname);

        Assert.assertEquals(firstname,"Samar");
        Assert.assertEquals(lastname,"Singh");


        // Case 2 - jsonPath.getString("")  JSON Path Extraction
        JsonPath jsonPath = new JsonPath(response.asString());
        String bookingId  = jsonPath.getString("bookingid");
        String firstname1 = jsonPath.getString("booking.firstname");
        String checkin = jsonPath.getString("booking.bookingdates.checkin");
        System.out.println(bookingId);
        System.out.println(firstname);
        System.out.println(checkin);



        // Server - JSONString> Java Object( BookingResponse) - getter to verify

        // Case 3 - DeSer - Extraction  -----Most Used------
        //  Response - De Ser another Response Class

        System.out.println("-------------------------------------------");

        String jsonResponseString1 = response.asString();
        BookingResponse bookingResponse = gson.fromJson(jsonResponseString1,BookingResponse.class);
        System.out.println(bookingResponse.getBooking().getFirstname());
        System.out.println(bookingResponse.getBooking().getLastname());
        System.out.println(bookingResponse.getBooking().getDepositpaid());
        System.out.println(bookingResponse.getBooking().getTotalprice());
        System.out.println(bookingResponse.getBooking().getDepositpaid());
        System.out.println(bookingResponse.getBooking().getBookingdates().getCheckin());
        System.out.println(bookingResponse.getBooking().getBookingdates().getCheckout());
        System.out.println(bookingResponse.getBooking().getAdditionalneeds());


        assertThat(bookingId).isNotNull().isNotEmpty().isNotBlank();
        assertThat(bookingResponse.getBooking().getFirstname()).isEqualTo("Samar").isNotBlank().isNotEmpty();




    }
}
