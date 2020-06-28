package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(how = How.XPATH, using = "//button[text()='Sign Up']")
    private WebElement signUpbtn;

    @FindBy(how = How.XPATH, using = "//*[@id='email-title']")
    private WebElement emailtxt;

    @FindBy(how = How.XPATH, using = "//*[@id='password-title']")
    private WebElement pwdtxt;

    @FindBy(how = How.XPATH, using = "//*[@id='confirmPassword-title']")
    private WebElement confirmPwdtxt;

    @FindBy(how = How.XPATH, using = "//*[@id='country-select-title']/div")
    private WebElement countrydpbox;

    @FindBy(how = How.XPATH, using = "//div[@data-test='termsAndCondition-checkbox']")
    private WebElement tcckbox;

    @FindBy(how = How.XPATH, using = "//div[text()='CREATE MY EQUOS ACCOUNT']")
    private WebElement createbtn;

    @FindBy(how = How.XPATH, using = "//*[@id='login']")
    private WebElement loginEmail;

    @FindBy(how = How.XPATH, using = "//*[@id='password']")
    private WebElement loginPwd;

    @FindBy(how = How.XPATH, using = "//button[text()='Log In']")
    private WebElement loginbtn;

    @FindBy(how = How.XPATH, using = "//div[text()='Verify Your Email']")
    private WebElement verifyEmail;

    public void LoginPage(WebDriver webDriver){
        this.webdriver = webdriver;
        PageFactory.initElements(webdriver,this);
    }

    public void clickSignUpbtn(){
        signUpbtn.click();
    }

    public void inputEmail(String email){
        emailtxt.sendKeys(email);
    }

    public void inputPwd(String pwd){
        pwdtxt.sendKeys(pwd);
    }

    public void inputCfmPwd(String cfmPwd){
        confirmPwdtxt.sendKeys(cfmPwd);
    }

    public void selectCountry(String country){
        countrydpbox.click();
        countrydpbox = webdriver.switchTo().activeElement();
        countrydpbox.sendKeys(country);
        countrydpbox.sendKeys(Keys.ENTER);
        webdriver.switchTo().defaultContent();
    }

    public void clickTC(){
        tcckbox.click();
    }

    public void clickCreatebtn(){
        createbtn.submit();
    }

    public void inputLoginEmail(String lgEmail){
        loginEmail.sendKeys(lgEmail);
    }

    public void inputLoginPwd(String lgPwd){
        loginPwd.sendKeys(lgPwd);
    }

    public void clickLoginbtn(){
        loginbtn.click();
    }

    public boolean checkVerifyEmail(){
        waitForDisplayed(verifyEmail);
        if (!verifyEmail.isDisplayed()){
            return false;
        } else return true;
    }


}
