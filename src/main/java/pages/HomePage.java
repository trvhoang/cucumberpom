package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public void HomePage(WebDriver webDriver){
        this.webdriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }


}
