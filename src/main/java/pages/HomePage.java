package pages;

import WebActions.UIActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    public HomePage(String ClassName) {
        super(ClassName);
    }
    WebElement loginBtn;
    WebElement registerButton;
    public void clickOnLoginBtn(){

        loginBtn=locator.chooseWebElement("LinkText","Log in");
        actions.clickBtn(loginBtn);
    }
    public void clickOnRegisterBtn(){
        registerButton=locator.chooseWebElement("LinkText","Register");
        actions.clickBtn(registerButton);

    }
}
