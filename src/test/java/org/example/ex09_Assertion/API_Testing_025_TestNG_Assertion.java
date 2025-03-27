package org.example.ex09_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class API_Testing_025_TestNG_Assertion {

    @Test
    public void test_hardAssertExample() {
        System.out.println("Start of the program");
        Boolean is_neeru_male = false;
        Assert.assertEquals("shailesh", "Shailesh");
        System.out.println("End of the program");

    }



    // Software Assertion

    @Test
    public void test_softAssertExample() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Start of a program");
        softAssert.assertEquals("shailesh", "Shailesh");
        System.out.println("End of the program");
        softAssert.assertAll();



    }

}
