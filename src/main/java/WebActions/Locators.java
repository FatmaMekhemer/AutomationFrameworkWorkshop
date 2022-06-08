package WebActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
    WebDriver driver;
    public Locators( WebDriver driver){
        this.driver=driver;
    }
    public WebElement chooseWebElement(String element, String locator) {
        switch(element)
        {
            case "ID":
                return driver.findElement(By.id(locator));
            case "Class":
                return driver.findElement(By.className(locator));
            case "CssSelector":
                return driver.findElement(By.cssSelector(locator));
            case "LinkText":
                return driver.findElement(By.linkText(locator));
            case "TagName":
                return driver.findElement(By.tagName(locator));
            case "Xpath":
                return driver.findElement(By.xpath(locator));
        }
        return null;
    }
}
