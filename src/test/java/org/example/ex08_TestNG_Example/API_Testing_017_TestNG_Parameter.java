package org.example.ex08_TestNG_Example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class API_Testing_017_TestNG_Parameter {


  @Parameters("browser")
    @Test
    public void Method1(String value){
      System.out.println("Demo Tc# 1");

      if (value.equalsIgnoreCase("Chrome")){
          System.out.println("Start the Chrome Browser");
      }
      if (value.equalsIgnoreCase("Firefox")){
          System.out.println("Start the Firefox Browser");
      }
  }

}
