import WebActions.BrowserActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;

public class BaseTest {
    BrowserActions bAction;
    HomePage home;

    @Parameters({"browser"})
    @BeforeTest
    public void setUp(String browser)
    {
        bAction= new BrowserActions(browser,"BaseTest");
        bAction.navigate("https://www.google.com/","BaseTest");
    }

    @Test
    public void testClick()
    {
        home = new HomePage("BaseTest");
    }

    @AfterTest
    public void tearDown()
    {
        bAction.tear("BaseTest");
    }
}
