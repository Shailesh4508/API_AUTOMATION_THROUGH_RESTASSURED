package org.example.ex08_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class API_Testing_019_TestNG_AlwaysRun {

    @Test(alwaysRun = true)
    public void test1(){
        System.out.println("Test 1");
        Assert.assertTrue(true);
    }

    @Test(enabled = false)
    public void test2(){
        System.out.println("Test 2");
        Assert.assertTrue(true);
    }

    @Test
    public void test3(){
        System.out.println("Test 3");
        Assert.assertTrue(true);
    }
}
