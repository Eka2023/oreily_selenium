package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ExplicitWaitPageElements {

    public WebDriver driver;

    @FindBy(xpath = "//input[@name='lname']")
    public List<WebElement> list;
    @FindBy(xpath = "//input[@name='fname']")
    public WebElement firstName;

    @FindBy(xpath = "//button[@id='u_5_6']")
    public WebElement submitBtn;

    @FindBy(xpath = "//button[@id='u_5_7']")
    public WebElement goToNextBtn;

    public ExplicitWaitPageElements(WebDriver dr){
        this.driver = dr;
        PageFactory.initElements(dr, this);
    }


}
