package tests.test_synchronization_waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    //Implicit wait applys to DRIVER

    @Test
    public void test_sync() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users/ekaterinabolotova/Downloads/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.dezlearn.com/test-sync-example/");

        List<WebElement> list = driver.findElements(By.xpath("//input[@name='lname']"));

        driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("katya");
        list.get(0).sendKeys("bolotova");
        list.get(1).sendKeys("bolotova.katya@gmail.com");
        driver.findElement(By.xpath("//button[@id='u_5_6']")).click();

        driver.findElement(By.linkText("Go to Next Page")).click();

        driver.quit();
    }

}
