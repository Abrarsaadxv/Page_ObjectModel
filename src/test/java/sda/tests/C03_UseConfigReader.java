package sda.tests;

import org.testng.annotations.Test;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

public class C03_UseConfigReader {

//
    @Test
    public void ConfigreaderTest() throws InterruptedException {
// Go to Amazon
        Driver.getDriver().get(ConfigReader.getProperty("amazonleUrl"));
        Thread.sleep(2000);
// Go to google

        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        Thread.sleep(2000);
// Use configReader class
        //close driver
        Driver.closeDriver();

    }
}

