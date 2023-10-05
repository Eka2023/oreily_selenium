package tests.test_synchronization_waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class ExplicitWait {

    @Test
    public void test_sync() {
        System.setProperty("webdriver.chrome.driver", "//Users/ekaterinabolotova/Downloads/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/explicit-wait-example/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List<WebElement> list = driver.findElements(By.xpath("//input[@name='lname']"));

        driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("katya");
        list.get(0).sendKeys("bolotova");
        list.get(1).sendKeys("bolotova.katya@gmail.com");
        driver.findElement(By.xpath("//button[@id='u_5_6']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='u_5_7']")));
        String text = driver.findElement(By.xpath("//button[@id='u_5_7']")).getText();
        Assert.assertEquals(text, "GO TO NEXT PAGE");
        System.out.println(text);
        driver.findElement(By.xpath("//button[@id='u_5_7']")).click();
        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }
}

