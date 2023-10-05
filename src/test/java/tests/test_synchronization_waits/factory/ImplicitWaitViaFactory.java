package tests.test_synchronization_waits.factory;

import elements.ExplicitWaitPageElements;
import elements.ImplicitWaitPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ExplicitWaitPage;
import pages.ImplicitWaitPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplicitWaitViaFactory extends BaseTest{

 //   WebDriver driver;
//    ImplicitWaitPage implicitWaitPage;
//    ImplicitWaitPageElements pageElements;

//    @BeforeMethod
//    public void openDriver(){
//        System.setProperty("webdriver.chrome.driver", "//Users/ekaterinabolotova/Downloads/drivers/chromedriver");
//        driver = new ChromeDriver();
//        driver.get("https://www.dezlearn.com/test-sync-example/");
//        implicitWaitPage = new ImplicitWaitPage(driver);
//
//        imPageElements = new ImplicitWaitPageElements(driver);
//        exPageElements = new ExplicitWaitPageElements(driver);
//    }

//    @AfterMethod
//    public void closeDriver(){
//        driver.quit();
//    }

    @Test
    public void test_sync() {

        List<WebElement> list = implicitWaitPage.getList();
        implicitWaitPage.enterFirstName("katya");
        list.get(0).sendKeys("bolotova");
        list.get(1).sendKeys("bolotova.katya@gmail.com");

        implicitWaitPage.clickSubmitBtn();
        Assert.assertEquals(implicitWaitPage.getGoNextBtnText(), "Go to Next Page");

        implicitWaitPage.clickGoNextBtn();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.dezlearn.com/");

    }



}
