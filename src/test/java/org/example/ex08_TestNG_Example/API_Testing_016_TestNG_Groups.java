package org.example.ex08_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class API_Testing_016_TestNG_Groups {

    @Test(groups = {"Sanity","Regression"}, priority = 2)
    public void test_SanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);

    }

    @Test(groups = {"P1","Regression"},priority = -1)
    public void test_RegressionRun(){
        System.out.println("Regression");

        Assert.assertTrue(false);

    }

    @Test(groups = {"P1","Regression"},priority = 1)
    public void test_SmokeRun(){
        System.out.println("Smoke");
        Assert.assertTrue(false);

    }
}
