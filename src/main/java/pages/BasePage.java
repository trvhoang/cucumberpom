package pages;
import data.pagesData.PagesData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {
    WebDriver webdriver;

    public String pageTitle(){
        return webdriver.getTitle();
    }

    public String pageCurrentURL(){
        System.out.println(webdriver.getCurrentUrl());
        return webdriver.getCurrentUrl();
    }

    public void waitForDisplayed(WebElement we){
        WebDriverWait wait = new WebDriverWait(webdriver , 10);
        wait.until(ExpectedConditions.visibilityOf(we));
    };

    public void waitForClick(WebElement we){
        WebDriverWait wait = new WebDriverWait(webdriver , 3);
        wait.until(ExpectedConditions.elementToBeClickable(we));
    };

    public void waitAndClick(By by){
        int attempts = 0;
        while(attempts < 2) {
            try {
                webdriver.findElement(by).click();
                break;
            } catch(StaleElementReferenceException e) {
            }
            attempts++;
        }
    };

    public void waitPageLoaded(){
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(webdriver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println("Timeout waiting for Page Load Request to complete.");
        }
    }

    public void PageNavigation(String pagename){
        PagesData pagePagesData = new PagesData();
        String pageURL= pagePagesData.pageURL(pagename);;

        webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.navigate().to(pageURL);

        waitPageLoaded();

    };

}
