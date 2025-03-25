package org.example.ex08_TestNG_Example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class API_Testing_015 {

    @Test (priority = 1)
    public void getToken(){
        System.out.println("1");

    }

    @Test (priority = 3)
    public void getBookingID(){
        System.out.println("3");
    }

    @Test (priority = 4)
    public void test_PUT(){
        System.out.println("2");
    }

    @Test (priority = 2)
    public void closeAllThings(){
        System.out.println("4");
    }
}
