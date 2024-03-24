package sda.pages.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import sda.utilities.Driver;

public class InventoryPage {
    public InventoryPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(tagName = "select")
    public WebElement dropDown;


    @FindBy(xpath = "//span[@class='active_option']")
    public WebElement selectedOption;
    public void selectByindix(int index){
        Select selct = new Select(dropDown);
        selct.selectByIndex(index);

    }
    public void selectByVisibleText(String text){
        Select selct = new Select(dropDown);
        selct.selectByVisibleText(text);

    }
    public String getTestOfSelectedOption(){
        return selectedOption.getText();

    }




}
