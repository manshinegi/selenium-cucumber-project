package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import pageObjects.LoginPageObj;
import resources.Base;

public class LoginStepDef extends Base {
    LoginPageObj loginPageObj ;
    public  static Logger log = LogManager.getLogger(JoinAccountStepDef.class.getName());
    public LoginStepDef() {
     loginPageObj = new LoginPageObj();
    }

    @When("user clicks on login link")
    public void user_clicks_on_login_link() {
        loginPageObj.clickOnLoginLink();
        log.debug("user clicks on login");
        log.error("error message is displayed");
    }
    @Then("login page is populated")
    public void login_page_is_populated() {
        Assert.assertTrue(loginPageObj.verifyLoginPage());
    }

    @When("user enter valid email id and vaild password")
    public void user_enter_valid_email_id_and_valid_password() {
      loginPageObj.enterEmailId(prop.getProperty("emailId"));
      loginPageObj.enterPassword(prop.getProperty("pswd"));
    }
    @When("click on login button")
    public void click_on_login_button() {
loginPageObj.clickLoginBtn();
    }
    @Then("user should logged in")
    public void user_should_logged_in() {
       // Assert.assertTrue(loginPageObj.dashboardPage());
      //  loginPageObj.clickOnClose();
    }

    @When("user enter invalid email id or invalid password")
    public void user_enter_invalid_email_id_or_invalid_password() {
        loginPageObj.enterEmailId("abhghc@gmail.com");
        loginPageObj.enterPassword("QWERTghchgcY123q");
    }
    @Then("error msg flashes")
    public void error_msg_flashes() {
        Assert.assertTrue(loginPageObj.verifyErrorMsg());
    }
}
