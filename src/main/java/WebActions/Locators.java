package WebActions;

import Waits.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
    WebDriver driver;
    Wait waits;
    public Locators( WebDriver driver){
        this.driver=driver;
    }

    public WebElement chooseWebElement(String element, String locator) {
        switch(element)
        {
            case "ID":
                try {
                    return driver.findElement(By.id(locator));
                } catch (Exception e){
                    try {
                        return waits.chooseWaitConditionWebElements("PresenceOfElement", driver.findElement(By.id(locator)));
                    }catch (Exception e1) {
                        try {
                            return waits.chooseWaitConditionWebElements("VisibilityOfElement", driver.findElement(By.id(locator)));
                        }catch (Exception e2) {
                           return waits.chooseWaitConditionWebElements("ElementClickable", driver.findElement(By.id(locator)));
                        }
                    }
                }

            case "Class":
                try{
                return driver.findElement(By.className(locator));
        } catch (Exception e){
            try {
                return waits.chooseWaitConditionWebElements("PresenceOfElement", driver.findElement(By.className(locator)));
            }catch (Exception e1) {
                try {
                    return waits.chooseWaitConditionWebElements("VisibilityOfElement", driver.findElement(By.className(locator)));
                }catch (Exception e2) {
                    return waits.chooseWaitConditionWebElements("ElementClickable", driver.findElement(By.className(locator)));
                }
            }
        }
            case "CssSelector":
                try{
                return driver.findElement(By.cssSelector(locator));
        } catch (Exception e){
            try {
                return waits.chooseWaitConditionWebElements("PresenceOfElement", driver.findElement(By.cssSelector(locator)));
            }catch (Exception e1) {
                try {
                    return waits.chooseWaitConditionWebElements("VisibilityOfElement", driver.findElement(By.cssSelector(locator)));
                }catch (Exception e2) {
                    return waits.chooseWaitConditionWebElements("ElementClickable", driver.findElement(By.cssSelector(locator)));
                }
            }
        }
            case "LinkText":
                try{
                return driver.findElement(By.linkText(locator));
        } catch (Exception e){
            try {
                return waits.chooseWaitConditionWebElements("PresenceOfElement", driver.findElement(By.linkText(locator)));
            }catch (Exception e1) {
                try {
                    return waits.chooseWaitConditionWebElements("VisibilityOfElement", driver.findElement(By.linkText(locator)));
                }catch (Exception e2) {
                    return waits.chooseWaitConditionWebElements("ElementClickable", driver.findElement(By.linkText(locator)));
                }
            }
        }
            case "TagName":
                try{
                return driver.findElement(By.tagName(locator));
        } catch (Exception e){
            try {
                return waits.chooseWaitConditionWebElements("PresenceOfElement", driver.findElement(By.tagName(locator)));
            }catch (Exception e1) {
                try {
                    return waits.chooseWaitConditionWebElements("VisibilityOfElement", driver.findElement(By.tagName(locator)));
                }catch (Exception e2) {
                    return waits.chooseWaitConditionWebElements("ElementClickable", driver.findElement(By.tagName(locator)));
                }
            }
        }
            case "Xpath":
                try{
                return driver.findElement(By.xpath(locator));
        } catch (Exception e){
            try {
                return waits.chooseWaitConditionWebElements("PresenceOfElement", driver.findElement(By.xpath(locator)));
            }catch (Exception e1) {
                try {
                    return waits.chooseWaitConditionWebElements("VisibilityOfElement", driver.findElement(By.xpath(locator)));
                }catch (Exception e2) {
                    return waits.chooseWaitConditionWebElements("ElementClickable", driver.findElement(By.xpath(locator)));
                }
            }
        }
        }
        return null;
    }
}
