package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends  BasePage{
    public UserRegisterationPage(String className){
        super(className);

    }

    WebElement radioBtn;
    WebElement fnTxtBox;
    WebElement lnTxtBox;
    WebElement emailTxtBox;
    WebElement passwordTxtBox;
    WebElement confirmPasswordTxtBox;
    WebElement registerButton;
    public WebElement sucessMessage;
   public WebElement logoutbtn;

   public void filluserRegisterationForm(String firstName,String lastName,String email,String password){
       radioBtn=locator.chooseWebElement("ID","gender-male");
        actions.clickBtn(radioBtn);

        fnTxtBox=locator.chooseWebElement("ID","FirstName");
        actions.sendData(fnTxtBox,firstName);

       lnTxtBox=locator.chooseWebElement("ID","LastName");
        actions.sendData(lnTxtBox,lastName);

       emailTxtBox=locator.chooseWebElement("ID","Email");
        actions.sendData(emailTxtBox,email);

       passwordTxtBox=locator.chooseWebElement("ID","Password");
       actions.sendData(passwordTxtBox,password);

       confirmPasswordTxtBox=locator.chooseWebElement("ID","ConfirmPassword");
        actions.sendData(confirmPasswordTxtBox,password);

       registerButton=locator.chooseWebElement("ID","register-button");
       actions.clickBtn(registerButton);
   }
   public void userLogOut(){
       logoutbtn=locator.chooseWebElement("CssSelector","a.ico-logout");
       actions.clickBtn(logoutbtn);
   }
  public String getSuccessMsg(){
       sucessMessage=locator.chooseWebElement("CssSelector","div.result");
       return sucessMessage.getText();
  }



}
