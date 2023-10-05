package tests.test_synchronization_waits.factory;

import elements.ExplicitWaitPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ExplicitWaitPage;

import java.time.Duration;
import java.util.List;

public class ExplicitWaitViaPageFactory {
    WebDriver driver;
    ExplicitWaitPage explicitWaitPage;
    ExplicitWaitPageElements pageElements;

    @BeforeMethod
    public void openDriver(){
        System.setProperty("webdriver.chrome.driver", "//Users/ekaterinabolotova/Downloads/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/explicit-wait-example/");
        explicitWaitPage = new ExplicitWaitPage(driver);
        pageElements = new ExplicitWaitPageElements(driver);
    }

    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }

    @Test
    public void test_sync() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List<WebElement> list = explicitWaitPage.getList();
        explicitWaitPage.enterFirstName("katya");
        list.get(0).sendKeys("bolotova");
        list.get(1).sendKeys("bolotova.katya@gmail.com");
        explicitWaitPage.clickSubmitBtn();

        wait.until(ExpectedConditions.elementToBeClickable(pageElements.goToNextBtn));
        String text = explicitWaitPage.getGoNextBtnText();
        Assert.assertEquals(text, "GO TO NEXT PAGE");

        explicitWaitPage.clickGoNextBtn();
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL, "https://www.dezlearn.com/");

    }


}
