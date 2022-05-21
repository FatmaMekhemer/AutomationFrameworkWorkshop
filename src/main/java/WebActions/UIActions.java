package WebActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static WebActions.BrowserActions.drivers;
import WebActions.BrowserActions;

public class UIActions {
     WebDriver driver;
    public UIActions(String ClassName){
        driver=drivers.get(ClassName);

    }
    public void clickBtn(By by){
        driver.findElement(by).click();
    }
    public void sendK(By by){
        driver.findElement(by).sendKeys("");
    }
}
