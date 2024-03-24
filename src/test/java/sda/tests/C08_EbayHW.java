package sda.tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import sda.pages.Ebaypage;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

public class C08_EbayHW {
    //// Navigate to https://www.ebay.com/
    //// Perform a search after typing {search_keyword} in the search box
    //// Add the first product in the search results to the cart
    //// Go to the cart
    //// Increase the quantity of the purchased product to {quantity}
    //// Verify the total amount in the cart should be calculated as unit productPrice
    @Test
    public void test() throws InterruptedException {
        Ebaypage ebaypage = new Ebaypage();
        Driver.getDriver().get(ConfigReader.getProperty("ebayurl"));
        ebaypage.searchbox.sendKeys(ConfigReader.getProperty("searchword") + Keys.ENTER);
        Thread.sleep(1000);
        ebaypage.Firstelemnt.click();


//ebaypage.addToCart.click();
//  ebaypage.Cart.click();


    }
}
