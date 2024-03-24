package sda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

public class Ebaypage {
    public Ebaypage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='gh-ac' and @name='_nkw']")
    public WebElement searchbox;


    @FindBy(id = "gh-btn'")
    public WebElement serchbuttone;
    //@FindBy(xpath = "(//li[contains(@class, 's-item')])[2]")
    @FindBy(xpath = "//*[@id='srp-river-results']/ul/li[1]")
    public WebElement Firstelemnt;

    @FindBy(id ="gh-minicart-hover")
   public WebElement Cart ;
   @FindBy(partialLinkText = "Add to cart")
   public WebElement addToCart ;



//   @FindBy(xpath = "//*[@class='s-item s-item__pl-on-bottom'][2]")
//   public WebElement Secoundelemnt;


//    public void clickFirstElement() {
//        Firstelemnt.click();
//    }



//    public void clickFirstElement() {
//        if (Firstelemnt.getText().contains(" Cloth Myth Golden Saint")) {
//            Firstelemnt.click();
//        }
//        else {
//            Secoundelemnt.click();
//        }
//    }
}



