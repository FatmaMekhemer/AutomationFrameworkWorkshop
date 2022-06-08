package pages;

import Waits.Wait;
import WebActions.BrowserActions;
import WebActions.Locators;
import WebActions.UIActions;
import org.openqa.selenium.WebDriver;

public class BasePage {
    UIActions actions;
   Locators locator;
   WebDriver driver;
   Wait waits;
    public BasePage( String ClassName){
        driver= BrowserActions.drivers.get("BaseTest");
        actions = new UIActions(ClassName);
        locator=new Locators(driver);
        waits=new Wait(driver);


    }
}
