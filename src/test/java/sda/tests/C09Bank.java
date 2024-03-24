package sda.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sda.pages.Bank_AccountP;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

public class C09Bank {
    //    //Open 5 new  Accounts, deposit 100 USD and withdraw 100 USD
    //    from any account and delete all accounts you created.
    // /*
    //Given
    //    Go to url https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
    //When
    //    Click on "Bank Manager Login" button
    @Test
    public void test() throws InterruptedException {


        Bank_AccountP bankAccountP = new Bank_AccountP();
        Driver.getDriver().get(ConfigReader.getProperty("globalsqaurl"));

        bankAccountP.BankManagerLogin.click();

        //And
        //    Click on "Add Customer" button
        //    Fill inputs and click on "Add Customer" submit button

        bankAccountP.AddCustomer.click();
        bankAccountP.sendKeys();

        //And
        //    Add 4 more customers
        //And
        bankAccountP.Fakerclass();
        //    Click on "Open Account"  button

        bankAccountP.OpenAccount.click();

        //    Click on "Customer" dropdown
        bankAccountP.Customerdropdown.click();
        //And
        //    Select customer name
        //And
        //    Click on "Currency" dropdown
        //And
        //    Select "Dollar"
        bankAccountP.selectMethode();
//        bankAccountP.currency.click();
        bankAccountP.selectMethode2();


        //    Click on "Process" button

        //    Accept alert
        bankAccountP.submit1button.click();

        Driver.getDriver().switchTo().alert().accept();
        //    Open 4 more accounts
        bankAccountP.addFourAccounts();


        //    Click on "Customers" button
        bankAccountP.Customers.click();
        //****************************** somthing is wrong to be seen later
        //    Count table row numbers

//        int numberOfRows = bankAccountP.countTableRows();
//        System.out.println("Number of rows in the table: " + numberOfRows);

//        int rowCount = bankAccountP.table1.findElements(By.tagName("tr")).size();

//        //    Assert that you created 5 customers

        //When


        //    Click on "Home" button

        bankAccountP.homeButtone.click();

        //    Click on "Customer Login" button
        bankAccountP.customerLogin.click();
        //    Click on "Your Name" dropdown

//bankAccountP.Name.click();
        //    Select the any name you created
        Select selectName =  new Select(bankAccountP.Name);
        selectName.selectByIndex(2);

        //    Click on "Login" button
bankAccountP.Loginbutton1.click();


        //    Click on "Deposit" button

        bankAccountP.Deposit.click();
        //    Type 100 into "Amount to be Deposited" input
        //    Click on "Deposit"(Submit) button

        bankAccountP.amountDeposited.sendKeys("100"+ Keys.ENTER);
        //    Assert that "Deposit Successful" is displayed
        bankAccountP.SuccessfulDeposit();

        //    Click on "Withdrawal" button
        bankAccountP.Withdrawl.click();

    //    Type 100 into "Amount to be Withdrawn" input

        //    Click on "Withdraw"(Submit) button

      bankAccountP.SuccessfSWithdrawl();
        //    Assert that "Transaction  Successful" is displayed
        //When
        //    Click on "Logout" button


        //    Click on "Home" button


        //    Click on "Bank Manager Login" button


        //    Click on "Customers" button

        //    Click on each "Delete" button

        //    Count table row numbers
        //Then

    }}