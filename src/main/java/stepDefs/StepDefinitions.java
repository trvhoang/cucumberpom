package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class StepDefinitions {
    WebDriver webDriver;
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("^User is on LoginPage \"([^\"]*)\"$")
    public void user_is_on_LoginPage(String arg1) throws Throwable {
        loginPage.LoginPage(webDriver);
        loginPage.PageNavigation(arg1);
    }

    @When("^User click Signup button$")
    public void user_click_Signup_button() throws Throwable {
        loginPage.LoginPage(webDriver);
        loginPage.clickSignUpbtn();

    }

    @When("^User input email \"([^\"]*)\"$")
    public void user_input_email(String arg1) throws Throwable {
        loginPage.LoginPage(webDriver);
        loginPage.inputEmail(arg1);

    }

    @When("^User input password \"([^\"]*)\"$")
    public void user_input_password(String arg1) throws Throwable {
        loginPage.LoginPage(webDriver);
        loginPage.inputPwd(arg1);

    }

    @When("^User input confirm password \"([^\"]*)\"$")
    public void user_input_confirm_password(String arg1) throws Throwable {
        loginPage.LoginPage(webDriver);
        loginPage.inputCfmPwd(arg1);

    }

    @When("^User select country \"([^\"]*)\"$")
    public void user_select_country(String arg1) throws Throwable {
        loginPage.LoginPage(webDriver);
        loginPage.selectCountry(arg1);

    }

    @When("^User select checkbox Terms and Conditions$")
    public void user_select_checkbox_Terms_and_Conditions() throws Throwable {
        loginPage.LoginPage(webDriver);
        loginPage.clickTC();

    }

    @Then("^User click Create button$")
    public void user_click_Create_button() throws Throwable {
        loginPage.LoginPage(webDriver);
        loginPage.clickCreatebtn();
        Assert.assertTrue(loginPage.checkVerifyEmail());
    }

    @When("^User input login email \"([^\"]*)\"$")
    public void user_input_login_email(String arg1) throws Throwable {
        loginPage.LoginPage(webDriver);
        loginPage.inputLoginEmail(arg1);
    }

    @When("^User input login password \"([^\"]*)\"$")
    public void user_input_login_pwd(String arg1) throws Throwable{
        loginPage.LoginPage(webDriver);
        loginPage.inputLoginPwd(arg1);
    }

    @When("^User click Login button$")
    public void user_click_Login_btn(){
        loginPage.LoginPage(webDriver);
        loginPage.clickLoginbtn();
        loginPage.waitPageLoaded();
        homePage.HomePage(webDriver);
    }

    @Then("^User is on HomePage \"([^\"]*)\"$")
    public void user_is_on_HomePage(String arg1) throws Throwable {
        homePage.HomePage(webDriver);
        Assert.assertEquals(homePage.pageCurrentURL().toLowerCase(),("EQUOS").toLowerCase());

    }

}
