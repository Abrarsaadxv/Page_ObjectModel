package sda.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import sda.utilities.Driver;

public class FacebookLoginPage {

    public FacebookLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id ="email")
    public WebElement usernameFiled;
    @FindBy(id ="pass")

    public WebElement passFiled;

    @FindBy(name = "login")
    public WebElement loginbutton;

    @FindBy(partialLinkText = "Find your account and log in")
    public WebElement errorText;


    public void  Falerlass (){
        Faker faker = new Faker();
   usernameFiled.sendKeys(faker.internet().emailAddress());
   passFiled.sendKeys(faker.internet().password());
   loginbutton.click();
    }

    public void verfmessfay(){

       // Assert.assertTrue(errorText.isDisplayed());
    }




}
