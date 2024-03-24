package sda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sda.utilities.Driver;

public class DhtmlgoodiesPage {

    public DhtmlgoodiesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "box1")
    public WebElement Oslo;

    @FindBy(id = "box101")
    public WebElement Norway;

    @FindBy(id = "box2")
    public WebElement Stockholm;
    @FindBy(id = "box102")
    public WebElement Sweden;
    @FindBy(id = "box3")
    public WebElement Washington;
    @FindBy(id = "box103")
    public WebElement UnitedStates;

    //***************
    @FindBy(id = "box4")
    public WebElement Copenhagen;
    @FindBy(id = "box104")
    public WebElement Denmark;

    @FindBy(id = "box5")
    public WebElement Seoul;
    @FindBy(id = "box105")
    public WebElement SouthKorea;

    @FindBy(id = "box6")
    public WebElement Rome;
    @FindBy(id = "box106")
    public WebElement Italy;

    @FindBy(id = "box7")
    public WebElement Madrid;

    @FindBy(id = "box107")

    public WebElement Spain;

    public void DragAndDro(){

       Actions actions = new Actions(Driver.getDriver());


        actions

                .dragAndDrop(Oslo,Norway)
                .dragAndDrop(Stockholm,Sweden)

                .dragAndDrop(Washington,UnitedStates)

                .dragAndDrop(Copenhagen,Denmark)
                .dragAndDrop(Seoul,SouthKorea)
                .dragAndDrop(Rome,Italy)
                .dragAndDrop(Madrid,Spain)

                .perform();

    }


}
