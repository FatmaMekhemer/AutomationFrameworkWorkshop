package pages;

import WebActions.Locators;
import WebActions.UIActions;
import org.openqa.selenium.WebDriver;

public class BasePage {
    UIActions actions;
   Locators locator;
   WebDriver driver;
    public BasePage( String ClassName){

        actions = new UIActions(ClassName);
        locator=new Locators(driver);

    }
}
