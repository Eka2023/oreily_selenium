package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplicitWaitPageElements {
    public WebDriver driver;

    @FindBy(xpath = "//input[@name='lname']")
    public List<WebElement> list;
    @FindBy(xpath = "//input[@name='fname']")
    public WebElement firstName;

    @FindBy(xpath = "//button[@id='u_5_6']")
    public WebElement submitBtn;

    @FindBy(linkText = "Go to Next Page")
    public WebElement goToNextBtn;

    public ImplicitWaitPageElements(WebDriver dr){
        this.driver = dr;
        PageFactory.initElements(dr, this);
    }


}
