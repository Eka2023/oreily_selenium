package pages;

import elements.ExplicitWaitPageElements;
import elements.ImplicitWaitPageElements;
import libraries.AppLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplicitWaitPage extends PageFactoryBase{

    String implicitPageURL= "https://www.dezlearn.com/test-sync-example/";

    WebDriver driver;
    ImplicitWaitPageElements pageElements;

    public ImplicitWaitPage(WebDriver dr){
        this.driver=dr;
        pageElements = new ImplicitWaitPageElements(dr);
    }


    public List<WebElement> getList(){
        List<WebElement> list = pageElements.list;
        return list;
    }

    public void enterFirstName(String value){
        pageElements.firstName.sendKeys(value);
    }
    public void clickSubmitBtn(){
        pageElements.submitBtn.click();
    }

    public String getGoNextBtnText(){
        String text = pageElements.goToNextBtn.getText();
        return text;
    }
    public void clickGoNextBtn(){
        pageElements.goToNextBtn.click();
    }



}
