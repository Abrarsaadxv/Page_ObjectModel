package sda.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import sda.utilities.Driver;

public class C02_UseDriverClass {


    @Test
    public void driverClassTest(){

        ////Go to URL: https://opensource-demo.orangehrmlive.com/
        ////Verify title contains OrangeHRM.
        ////Use Driver Class.
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("OrangeHRM"));

    }
}
