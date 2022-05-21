package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public HomePage(String ClassName) {
        super(ClassName);
    }
    public void clickOnLoginBtn(){
        actions.clickBtn(By.id(""));
    }
}
