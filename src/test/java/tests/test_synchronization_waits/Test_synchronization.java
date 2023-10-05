package tests.test_synchronization_waits;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Test_synchronization {

    @Test
    public void test_sync() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users/ekaterinabolotova/Downloads/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/test-sync-example/");

        List<WebElement> list = driver.findElements(By.xpath("//input[@name='lname']"));

        driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("katya");
        list.get(0).sendKeys("bolotova");
        list.get(1).sendKeys("bolotova.katya@gmail.com");
        driver.findElement(By.xpath("//button[@id='u_5_6']")).click();
        Thread.sleep(10000);

        String text = driver.findElement(By.xpath("//a[@id='nav']")).getText();
        Assert.assertEquals(text, "Go to Next Page");
        driver.findElement(By.linkText("Go to Next Page")).click();

        driver.quit();
    }

}
