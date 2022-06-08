package pages;

import WebActions.UIActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    public HomePage(String ClassName) {
        super(ClassName);
    }
    WebElement loginBtn;
    public void clickOnLoginBtn(){
        loginBtn=locator.chooseWebElement("ID","");
        actions.clickBtn(loginBtn);
        actions.doubleClickBtn(loginBtn);
    }
}
