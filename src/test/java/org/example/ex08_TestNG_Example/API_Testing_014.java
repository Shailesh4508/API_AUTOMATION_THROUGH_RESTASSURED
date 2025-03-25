package org.example.ex08_TestNG_Example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class API_Testing_014 {

    //PUT Request
    //1. get Token
    //2. getBookingID
    //3. test_Put (which will use the above two methods)
    //4. closeAllTings

    @BeforeTest ()
    public void getToken(){
        System.out.println("1");

    }

    @BeforeTest ()
    public void getBookingID(){
        System.out.println("3");
    }

    @Test ()
    public void test_PUT(){
        System.out.println("2");
    }

    @AfterTest()
    public void closeAllThings(){
        System.out.println("4");
    }
}
