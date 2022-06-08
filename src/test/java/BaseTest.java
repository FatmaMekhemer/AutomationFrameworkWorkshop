import Waits.Wait;
import WebActions.BrowserActions;
import org.testng.annotations.*;
import pages.HomePage;

public class BaseTest {
    BrowserActions bAction;
    HomePage home;
     Wait waits;

    @Parameters({"browser"})
    @BeforeTest
    public void setUp(@Optional("Chrome") String browser)
    {
        bAction= new BrowserActions(browser,"BaseTest");
        bAction.navigate("https://demo.nopcommerce.com/","BaseTest");
    }



    @AfterTest
    public void tearDown()
    {
        bAction.tear("BaseTest");
    }
}
