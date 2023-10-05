package tests.test_synchronization_waits.factory;

import elements.ExplicitWaitPageElements;
import elements.ImplicitWaitPageElements;
import libraries.AppLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ExplicitWaitPage;
import pages.ImplicitWaitPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    private AppLib app;
    ExplicitWaitPage explicitWaitPage;
    ExplicitWaitPageElements exPageElements;
    ImplicitWaitPage implicitWaitPage;
    ImplicitWaitPageElements imPageElements;

    @BeforeMethod
    public void openDriver(){
        System.setProperty("webdriver.chrome.driver", "//Users/ekaterinabolotova/Downloads/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/test-sync-example/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        implicitWaitPage = new ImplicitWaitPage(driver);
        //app = new AppLib(driver);
    }

    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }

    public AppLib App(){
        return app;
    }

}
