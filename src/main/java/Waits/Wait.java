package Waits;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Wait {

    WebDriver driver;

    public Wait(WebDriver driver){
        this.driver=driver;
    }
    public WebElement chooseWaitConditionWebElements(String element,WebElement locator){
        org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(40L))
                .pollingEvery(Duration.ofSeconds(4L))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(ElementClickInterceptedException.class);
        switch (element){

            case "ElementClickable":
                return wait.until(ExpectedConditions.elementToBeClickable(locator));
            case "PresenceOfElement":
                return wait.until(ExpectedConditions.presenceOfElementLocated((By) locator));
            case "VisibilityOfElement":
                return wait.until(ExpectedConditions.visibilityOfElementLocated((By) locator));



        }
        return  null;
    }
    public Boolean chooseWaitConditionBoolean(String element,WebElement locator,String content){
        org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(40L))
                .pollingEvery(Duration.ofSeconds(4L))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(ElementClickInterceptedException.class);
        switch (element){

            case "ElementSelected":
                return wait.until(ExpectedConditions.elementToBeSelected(locator));
            case "TitleContains":
                return wait.until(ExpectedConditions.titleContains(content));
            case "URL":
                return wait.until(ExpectedConditions.urlToBe(content));
            case "Title":
                return wait.until(ExpectedConditions.titleIs(content));


        }

        return  null;
    }
}
