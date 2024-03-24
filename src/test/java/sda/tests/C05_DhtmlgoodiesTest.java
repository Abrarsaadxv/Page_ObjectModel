package sda.tests;

import org.testng.annotations.Test;
import sda.pages.DhtmlgoodiesPage;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

public class C05_DhtmlgoodiesTest {

    @Test
    public void  test(){

        DhtmlgoodiesPage dhtmlgoodiesPage = new DhtmlgoodiesPage();
        Driver.getDriver().get(ConfigReader.getProperty("dhtmlgoodiesurl"));
        dhtmlgoodiesPage.DragAndDro();
        //Driver.closeDriver();




    }

}
