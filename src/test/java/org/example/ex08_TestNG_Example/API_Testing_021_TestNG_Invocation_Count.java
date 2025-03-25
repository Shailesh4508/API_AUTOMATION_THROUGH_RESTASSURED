package org.example.ex08_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class API_Testing_021_TestNG_Invocation_Count {

    @Test(invocationCount = 100)
    public void test(){
        System.out.println("I will run First");
        Assert.assertTrue(true);
    }
}
