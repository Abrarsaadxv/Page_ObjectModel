package sda.tests;

import org.testng.annotations.Test;
import sda.pages.FacebookLoginPage;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

public class C06_FacebookNegativeLoginTestHW {
    @Test
    public void test1() throws InterruptedException {
        FacebookLoginPage FacebookLoginPage = new FacebookLoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("facebookurl"));
       Thread.sleep(2000);
        FacebookLoginPage.Falerlass();
        FacebookLoginPage.verfmessfay();
        Driver.closeDriver();




    }
}
