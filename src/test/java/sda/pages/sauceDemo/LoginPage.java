package sda.pages.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sda.utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id ="user-name")
    public WebElement usernameFiled;
    @FindBy(id ="password")

    public WebElement passFiled;

    @FindBy(id ="login-button")

    public WebElement loginbutton;
    public void Lpgin(String name ,String password){
        passFiled.sendKeys(name);
        passFiled.sendKeys(password);
        loginbutton.click();
    }


    //Navigate to https://www.saucedemo.com/
    //Enter the user name as standard_user
    //Enter the password as secret_sauce
    //Click on login button.
    //- Choose price low to high with soft Assert.
    //- Verify item prices are sorted from low to high with hard Assert.


}
