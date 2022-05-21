package WebActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class BrowserActions {
    public static Map<String, WebDriver> drivers = new HashMap<>();
    public BrowserActions (String browser,String ClassName){
        if (browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            drivers.put(ClassName, new ChromeDriver());
        }
    }

    public void navigate(String url, String ClassName){
        drivers.get(ClassName).get(url);
        drivers.get(ClassName).manage().window().maximize();
    }

    public void tear(String ClassName){
        drivers.get(ClassName).quit();

    }

}
