package sda.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import sda.utilities.Driver;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Bank_AccountP {
    public Bank_AccountP() {
        PageFactory.initElements(Driver.getDriver(), this);
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
    @FindBy(xpath = "//*[@class='btn btn-lg tab'][1]")
    public WebElement OpenAccount;

    @FindBy(id = "userSelect")
    public WebElement Customerdropdown;
    @FindBy(id = "currency")
    public WebElement currency;

    @FindBy(xpath = "//*[text()='Process']")
    public WebElement submit1button;
    @FindBy(xpath = "//*[@class='btn btn-lg tab'][2]")

    public WebElement Customers;


    public void sendKeys() throws InterruptedException {

        Fname.sendKeys("Abrar");
        Lname.sendKeys("Althiabi");
        Thread.sleep(2000);
        PostCode.sendKeys("221133");
        submitButton.click();
        Thread.sleep(1000);
        Driver.getDriver().switchTo().alert().accept();
    }

    public void Fakerclass() throws InterruptedException {
        Faker faker = new Faker();
        for (int i = 0; i < 4; i++) {
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            String postalCode = faker.address().zipCode();

            Fname.sendKeys(firstName);
            Lname.sendKeys(lastName);
            PostCode.sendKeys(postalCode);
            submitButton.click();


            Thread.sleep(2000);
            Driver.getDriver().switchTo().alert().accept();


        }
    }

    public void selectMethode() {
        Select select = new Select(Customerdropdown);
        select.selectByIndex(3);
    }

    public void selectMethode2() {
        Select select2 = new Select(currency);
        select2.selectByValue("Dollar");

    }

    public void addFourAccounts() throws InterruptedException {
        for (int i = 0; i < 4; i++) {
            selectMethode();
            selectMethode2();
            submit1button.click();
            Driver.getDriver().switchTo().alert().accept();
        }
    }

   @FindBy(xpath = "//*[@class='table table-bordered table-striped']")
   // @FindBy(xpath = "//table//tbody//tr")
    public WebElement table1;

    public void countTableRows() {
        // Assuming rows are represented by <tr> tags within the table

    }

    @FindBy(xpath = "//*[@class='btn home']")
    public WebElement homeButtone;

    @FindBy(xpath = "//*[@ng-click='customer()']")
    public WebElement customerLogin;
    @FindBy(id="userSelect")
    public WebElement Name;

    @FindBy(xpath="//*[@type='submit']")
    public WebElement Loginbutton1;

    @FindBy(xpath = "//*[@class='btn btn-lg tab'][2]")
    public WebElement Deposit;

    @FindBy(xpath ="//*[@placeholder='amount']")
    public WebElement amountDeposited;


    @FindBy(xpath = "//*[@ng-show='message']")
    public WebElement  Successful;

    public void  SuccessfulDeposit() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(Successful.isDisplayed());

    }
    @FindBy(xpath = "//*[@ng-class='btnClass3']")
    public WebElement Withdrawl;

@FindBy(xpath = "//*[@placeholder='amount']")
   // @FindBy(xpath = "//*[@placeholder='amount']")
    public WebElement withdrawamount;

    @FindBy(xpath = "//*[@ng-show='message']")
    public WebElement SWithdrawl;

@FindBy (xpath = "//*[@type='submit']")
public WebElement Withdrawbutton;
    public void  SuccessfSWithdrawl() throws InterruptedException {
        withdrawamount.sendKeys("100");
       // Withdrawbutton.click();
        Thread.sleep(1000);
       // Assert.assertTrue(SWithdrawl.isDisplayed());

    }
    @FindBy(xpath = "//*[@ng-show='logout']")
    public WebElement logouttebutton2;






}














