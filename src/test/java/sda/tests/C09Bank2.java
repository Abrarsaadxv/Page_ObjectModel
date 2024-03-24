package sda.tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import sda.pages.Bank_AccountP;
import sda.pages.accountpage2;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

public class C09Bank2 {
    //    //Open 5 new  Accounts, deposit 100 USD and withdraw 100 USD
    //    from any account and delete all accounts you created.
    // /*
    //Given
    //    Go to url https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
    //When
    //    Click on "Bank Manager Login" button
    @Test
    public void test() throws InterruptedException {

        accountpage2 accountpage2= new accountpage2();
        Driver.getDriver().get(ConfigReader.getProperty("globalsqaurl"));

        Driver.getDriver().get(ConfigReader.getProperty("globalsqaurl"));

        accountpage2.BankManagerLogin.click();

        //And
        //    Click on "Add Customer" button
        accountpage2.AddCustomer.click();
        accountpage2.sendKeys();

        Thread.sleep(2000);
        Alert alert = Driver.getDriver().switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
       // Alert alert = Driver.getDriver().switchTo().alert();
//        String alertText = alert.getText();
//        System.out.println("Alert Text: " + alertText);
//
//        // Accept the alert
//        Driver.getDriver().switchTo().alert().accept();

        //******************
        //    Accept alert
//        bankAccountP.alertAccept();
        //***********************

        //And
        //    Add 4 more customers
        //And
        // bankAccountP.Fakerclass();
        //    Click on "Open Account"  button
        //And
        //    Click on "Customer" dropdown
        //And
        //    Select customer name
        //And
        //    Click on "Currency" dropdown
        //And
        //    Select "Dollar"
        //And
        //    Click on "Process" button
        //And
        //    Accept alert
        //And
        //    Open 4 more accounts
        //And
        //    Click on "Customers" button
        //And
        //    Count table row numbers
        //Then
        //    Assert that you created 5 customers
        //When
        //    Click on "Home" button
        //And
        //    Click on "Customer Login" button
        //And
        //    Click on "Your Name" dropdown
        //And
        //    Select the any name you created
        //And
        //    Click on "Login" button
        //And
        //    Click on "Deposit" button
        //And
        //    Type 100 into "Amount to be Deposited" input
        //And
        //    Click on "Deposit"(Submit) button
        //Then
        //    Assert that "Deposit Successful" is displayed
        //And
        //    Click on "Withdrawal" button
        //And
        //    Type 100 into "Amount to be Withdrawn" input
        //And
        //    Click on "Withdraw"(Submit) button
        //Then
        //    Assert that "Transaction  Successful" is displayed
        //When
        //    Click on "Logout" button
        //And
        //    Click on "Home" button
        //And
        //    Click on "Bank Manager Login" button
        //And
        //    Click on "Customers" button
        //And
        //    Click on each "Delete" button
        //And
        //    Count table row numbers
        //Then
        //    Assert that number of customers is 0
        //
        // */


    }
}
