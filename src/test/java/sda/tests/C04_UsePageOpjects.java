package sda.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.pages.sauceDemo.InventoryPage;
import sda.pages.sauceDemo.LoginPage;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

public class C04_UsePageOpjects {

    @Test
    public void pageObjectTest(){
        LoginPage loginpage = new LoginPage();
        InventoryPage  inventoryPage = new InventoryPage();

        Driver.getDriver().get(ConfigReader.getProperty("sauceDemoUrl"));
        loginpage.usernameFiled.sendKeys(ConfigReader.getProperty("Susername"));
        loginpage.passFiled.sendKeys(ConfigReader.getProperty("Spassword"));
        loginpage.loginbutton.click();


        inventoryPage.selectByindix(2);
       String optionText =  inventoryPage.getTestOfSelectedOption();
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(optionText.contains("low to high"));
        softAssert.assertAll();


        //hard Assert
        Assert.assertTrue(optionText.contains("low to high"));
        Driver.closeDriver();
    }


}
