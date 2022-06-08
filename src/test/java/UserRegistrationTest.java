import com.github.javafaker.Faker;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserRegisterationPage;

import java.io.IOException;

public class UserRegistrationTest extends BaseTest{

    HomePage homeObj;
    UserRegisterationPage registerObj;

    Faker fakeData=new Faker();
    String firstname=fakeData.name().firstName();
    String lastname=fakeData.name().lastName();
    String email=fakeData.internet().emailAddress();
    String password=fakeData.number().digits(8);
    @Test(priority = 1, alwaysRun = true)
    public void userCanRegisterSuccessfully() throws IOException, ParseException {
        homeObj = new HomePage("UserRegistrationTest");
        homeObj.clickOnRegisterBtn();
        registerObj = new UserRegisterationPage("UserRegistrationTest");
        registerObj.filluserRegisterationForm(firstname,lastname,email, password);
        Assert.assertEquals(registerObj.getSuccessMsg(),"Your registration completed");
        registerObj.userLogOut();

    }
}
