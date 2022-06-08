package WebActions;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static WebActions.BrowserActions.drivers;
import WebActions.BrowserActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UIActions {
     WebDriver driver;
     Actions action;
     Select option;
     JavascriptExecutor js;
    public UIActions(String ClassName){
        driver=drivers.get(ClassName);

    }
    public void clickBtn(WebElement e){
        e.click();
    }
    public void sendData(WebElement e, String value){
        e.sendKeys(value);
    }
    public void doubleClickBtn(WebElement e){
        action=new Actions(driver);
        action.doubleClick().perform();
    }
    public void clearTxt(WebElement e){
       e.clear();
    }

    public void submitBtn(WebElement e){
        e.submit();
    }
    public void dragAndDrop(WebElement source,WebElement target){
        action=new Actions(driver);
        action.dragAndDrop(source,target).perform();
    }
    public void dropDownListByIndex(WebElement optionList,int index){
        option=new Select(optionList);
        option.selectByIndex(index);

    }
    public void dropDownListByValue(WebElement optionList,String value){
      option=new Select(optionList);
      option.selectByValue(value);
    }
    public void dropDownListByVisibleTxt(WebElement optionList,String txt){
        option=new Select(optionList);
        option.selectByVisibleText(txt);

    }
    public void scrollDown(){
        js.executeScript("scrollBy(0,2500)");
    }



}

