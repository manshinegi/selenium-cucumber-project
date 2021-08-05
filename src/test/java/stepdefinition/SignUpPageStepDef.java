package stepdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.SignUpPageObj;
import resources.Base;


public class SignUpPageStepDef extends Base {

    Faker faker;
    SignUpPageObj landingPageObj;


    public SignUpPageStepDef() {
        System.out.println("constructor");
        landingPageObj = new SignUpPageObj();
        faker = new Faker();
    }


    @Given("user is on sign up page")
    public void user_is_on_sign_up_page() {
        Assert.assertTrue(landingPageObj.verifyLandingPage()); }

    @When("User registers using email id")
    public void user_registers_using_email_id() {
        landingPageObj.enterEmailId(faker.internet().emailAddress()); }

    @And("clicks on continue")
    public void clicks_on_continue() {
        landingPageObj.clickOnContinueBtn(); }

    @Then("create password page is populated")
    public void create_password_page_is_populated() throws InterruptedException {
        Assert.assertTrue(landingPageObj.verifyCreatePasswordPage()); }

    @When("User creates password")
    public void user_creates_password() {
        landingPageObj.enterpassword();
        landingPageObj.enterConfirmPassword(); }

    @Then("register mobile page is populated")
    public void register_mobile_page_is_populated() {
        Assert.assertTrue(landingPageObj.verifyRegisterMobilePage()); }

    @When("user select country code and enter mobile no")
    public void user_select_country_code_and_enter_mobile_no() {
        landingPageObj.clickOnDropDown();
        landingPageObj.selectCountryCode();
        landingPageObj.enterMobileNo(); }

    @Then("verify mobile number page is populated")
    public void verify_mobile_number_page_is_populated() {
        Assert.assertTrue(landingPageObj.verifyOtpPage()); }

    @When("user enter otp")
    public void user_enter_otp() {
        landingPageObj.enterOtp();
    }

    @Then("terms and condition page is populated")
    public void terms_and_condition_page_is_populated() {
        Assert.assertTrue(landingPageObj.verifyTermAndConditionPage()); }

    @When("user accept terms and condition")
    public void user_accept_terms_and_condition() {
        landingPageObj.ClickOntermsConditionCheckbox();
    }

    @Then("select account type page is populated.")
    public void select_account_type_page_is_populated() {
        Assert.assertTrue(landingPageObj.verifySelectAccountPage());
    }


}
