package org.example.ex08_TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class API_Testing_020_TestNG_DependsOnMethod {


    @Test
    public void Browser(){
        System.out.println("I will run First");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "Browser")
    public void method1(){
        System.out.println("Method1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "Browser")
    public void method2(){
        System.out.println("Method2");
        Assert.assertTrue(true);
    }

}
