package sda.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sda.utilities.Driver;

public class accountpage2 {
    public accountpage2() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Bank Manager Login']")
    public WebElement BankManagerLogin;

@FindBy(xpath = "//*[@ng-class='btnClass1']")
    public WebElement AddCustomer;

@FindBy(xpath = "//*[@placeholder='First Name']")
    public WebElement Fname;

    @FindBy(xpath = "//*[@placeholder='Last Name']")
    public WebElement Lname;
    @FindBy(xpath = "//*[@placeholder='Post Code']")
    public WebElement PostCode;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitButton;


public void sendKeys() throws InterruptedException {

    Fname.sendKeys("Abrar");
    Lname.sendKeys("Althiabi");
    Thread.sleep(2000);
    PostCode.sendKeys("221133"+Keys.ENTER);
//    submitButton.click();
    Thread.sleep(1000);
}



//public void  alertAccept() throws InterruptedException {
//    Thread.sleep(1000);
//
//    Alert alert =Driver.getDriver().switchTo().alert();
//    alert.accept();
//    Thread.sleep(1000);

//}

    public void handleAlert() {
        try {
            Alert alert = Driver.getDriver().switchTo().alert();
            if (alert != null) {
                alert.accept(); // Accept the alert
            }
        } catch (Exception e) {
            System.out.println("An error occurred while handling the alert: " + e.getMessage());
        }
    }

    // Method to add a customer
    public void addCustomer(String firstName, String lastName, String postalCode) throws InterruptedException {
        Fname.sendKeys(firstName);
        Lname.sendKeys(lastName);
        PostCode.sendKeys(postalCode);
        submitButton.click();
        Thread.sleep(2000);


        // Handle alert if present
        handleAlert();
    }



    }
