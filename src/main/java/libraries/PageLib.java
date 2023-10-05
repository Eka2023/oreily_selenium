package libraries;

import org.openqa.selenium.WebDriver;
import pages.ExplicitWaitPage;
import pages.ImplicitWaitPage;

public class PageLib {

    private WebDriver driver;
    private ExplicitWaitPage explicitWaitPage;
    private ImplicitWaitPage implicitWaitPage;


    public PageLib(WebDriver dr){
        this.driver = dr;
        explicitWaitPage = new ExplicitWaitPage(dr);
        implicitWaitPage = new ImplicitWaitPage(dr);
    }

    public ExplicitWaitPage openExplicitPage(){
        return explicitWaitPage;
    }

    public ImplicitWaitPage openImplicitPage(){
        return implicitWaitPage;
    }

}
