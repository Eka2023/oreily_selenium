package libraries;

import org.openqa.selenium.WebDriver;

public class AppLib {

    private WebDriver driver;
    private PageLib pageLib;

    public AppLib(WebDriver dr){
        this.driver = dr;
        pageLib = new PageLib(dr);
    }

    public PageLib AllPages(){
        return pageLib;
    }
}
