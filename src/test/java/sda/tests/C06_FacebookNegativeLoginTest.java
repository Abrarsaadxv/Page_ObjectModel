package sda.tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.pages.FacebookLoginPage;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

public class C06_FacebookNegativeLoginTest {
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
