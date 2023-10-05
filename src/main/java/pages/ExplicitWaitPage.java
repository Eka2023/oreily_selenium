package pages;

import elements.ExplicitWaitPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ExplicitWaitPage extends PageFactoryBase{
    WebDriver driver;
    ExplicitWaitPageElements pageElements;
    String explicitPageUrl = "https://www.dezlearn.com/explicit-wait-example/";
    public ExplicitWaitPage(WebDriver dr){
        this.driver=dr;
        pageElements = new ExplicitWaitPageElements(dr);
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
