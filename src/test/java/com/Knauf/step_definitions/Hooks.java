package com.Knauf.step_definitions;

import com.Knauf.utilities.DB_Util;
import com.Knauf.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


   @After
    public void teardownScenario(Scenario scenario){

       if(scenario.isFailed()){
         byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
         scenario.attach(screenshot,"image/png",scenario.getName());
       }

       Driver.closeDriver();
   }

    @Before(value = "@db")
    public void setupDB(){
        DB_Util.createConnection();
        System.out.println("Connecting to database..");

    }

    @After(value = "@db")
    public void destroyDB(){
        DB_Util.destroy();
        System.out.println("closing connection to database..");

    }


}
