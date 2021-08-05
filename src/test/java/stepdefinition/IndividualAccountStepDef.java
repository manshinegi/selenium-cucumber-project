package stepdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import pageObjects.IndividualAccountPageObj;
import resources.Base;
import resources.Utility;

import java.util.concurrent.TimeUnit;

import static resources.Base.closeBrowser;
import static resources.Base.initialisation;

public class IndividualAccountStepDef extends Base {


    IndividualAccountPageObj individualAccountPageObj;
    Faker faker;

    public IndividualAccountStepDef() {
        individualAccountPageObj = new IndividualAccountPageObj();
        faker = new Faker();
    }

    @Given("User is on select Account type page")
    public void user_is_on_select_account_type_page() {
        Assert.assertTrue(individualAccountPageObj.verifySelectAccountPage());

    }

    @When("User select individual account type")
    public void User_select_individual_account_type() {
        individualAccountPageObj.selectIndividualAccount();
    }

    @And("clicks on next button")
    public void clicks_on_next_button() {
        individualAccountPageObj.clickOnNextBtn();
    }

    @Then("reminder page is populated")
    public void reminder_page_is_populated() {
        Assert.assertTrue(individualAccountPageObj.verifyReminderPage());
    }

    @Then("user detail page is populated")
    public void user_detail_page_is_populated() {
        individualAccountPageObj.verifyUserDetailPage();
    }

    @When("User enter its detail")
    public void user_enter_its_detail() {
        individualAccountPageObj.enterFirstName(faker.address().firstName());
        individualAccountPageObj.enterMiddelName(faker.name().firstName());
        individualAccountPageObj.enterLastName(faker.name().lastName());
    }

    @Then("User date of birth page is populated")
    public void user_date_of_birth_page_is_populated() {
        Assert.assertTrue(individualAccountPageObj.verifyUserDOBPage());
    }

    @When("user enters its DOB")
    public void user_enters_its_dob() {
        individualAccountPageObj.enterDOB("12121998");
    }

    @Then("User's Address page is Populated")
    public void user_s_address_page_is_populated() {
        individualAccountPageObj.verifyUserAddressPage();
    }

    @When("User chosse entering address manually")
    public void user_chosse_entering_address_manually() {
        individualAccountPageObj.clickOnEnterAddressManuallyLink();
    }

    @When("User enters address detail")
    public void user_enters_address_detail() {
        individualAccountPageObj.enterUserAdrress();
    }

    @Then("Id type for verification is populated")
    public void id_type_for_verification_is_populated() {
        Assert.assertTrue(individualAccountPageObj.verifyIdTypeforVerificationPage());
    }

    @When("click on licence id option")
    public void click_on_licence_id_option() {
        individualAccountPageObj.clickOnDriverLicenceOption();
    }

    @Then("User licence detail page is populated")
    public void user_licence_detail_page_is_populated() {
        Assert.assertTrue(individualAccountPageObj.verifyUserLicenceDetailPage());
    }

    @When("User choose state and enters licence id no")
    public void user_choose_state_and_enters_licence_id_no() {
        individualAccountPageObj.enterState();
        individualAccountPageObj.enterDriverLicenceNo("12345678");
    }

    @Then("take your photo of your id page is populated")
    public void take_your_photo_of_your_id_page_is_populated() {
        Assert.assertTrue(individualAccountPageObj.verifytakeYourPhotoIdPage());
    }

    @When("user attach its id photo")
    public void user_attach_its_id_photo() {
        individualAccountPageObj.uploadFile();
    }

    @Then("enter your tax file number page is populated")
    public void enter_your_tax_file_number_page_is_populated() {
        Assert.assertTrue(individualAccountPageObj.verifyTaxFileNoPage());

    }

    @When("user enters TFN")
    public void user_enters_tfn() {
        individualAccountPageObj.enterTFN();
    }

    @Then("tax obligation outside australia page is populated")
    public void tax_obligation_outside_australia_page_is_populated() {
        Assert.assertTrue(individualAccountPageObj.verifyTaxObligationOutsidePage());

    }

    @When("user chooses No option")
    public void user_chooses_no_option() {
        individualAccountPageObj.chooseOptionFalse();
    }

    @Then("politicaly exposed page is populated")
    public void politicaly_exposed_page_is_populated() {
        Assert.assertTrue(individualAccountPageObj.verifyPoliticalyExposedPage());


    }
    @When("user clicks on No")
    public void user_clicks_on_no() {
       individualAccountPageObj.clickOnNoOption();
    }

    @Then("verify your detail page is populated")
    public void verify_your_detail_page_is_populated() {
        Assert.assertTrue(individualAccountPageObj.verifVerifyUserDetailPage());

    }

    @When("user clicks on confirm checkbox")
    public void user_clicks_on_confirm_checkbox() {
        individualAccountPageObj.clickOnConfirmCheckbox();
    }

    @When("user clicks on verify button")
    public void user_clicks_on_verify_button() {
        individualAccountPageObj.clickOnVerifyBtn();
    }

    @When("user details do not pass verification then user Recheck its details")
    public void user_details_do_not_pass_verification_then_user_recheck_its_details() {
        Assert.assertTrue(individualAccountPageObj.verifAlertOfVerifiaction());
        individualAccountPageObj.clickOnRececkDetails();
    }
    @Then("unverified page is populated")
    public void unverified_page_is_populated() {
        Assert.assertTrue(individualAccountPageObj.verifAlertOfVerifiaction());
    }
    @When("user clicks on skip")
    public void user_clicks_on_skip() {
      individualAccountPageObj.clickOnSkipBtn();
    }

    @Then("choose term page is populated")
    public void choose_term_page_is_populated() {
        Assert.assertTrue(individualAccountPageObj.verifyTermTypePage());

    }
    @When("user chooses three month")
    public void user_chooses_three_month() {
       individualAccountPageObj.clickOnThreeMonthPlan();
    }
    @Then("enter investment amount page is populated")
    public void enter_investment_amount_page_is_populated() {
        Assert.assertTrue(individualAccountPageObj.verifyEnterInvestmentMoneyPage());

    }
    @When("user enter amount")
    public void user_enter_amount() {
       individualAccountPageObj.enterInvestmentMoney();
    }

    @Then("do you have bonus code page is populated")
    public void do_you_have_bonus_code_page_is_populated() {
        Assert.assertTrue(individualAccountPageObj.verifyEnterBonusCodePage());
   individualAccountPageObj.clicknext();
    }

    @Then("user bank account detail page is populated")
    public void user_bank_account_detail_page_is_populated() {
        Assert.assertTrue(individualAccountPageObj.verifyBankDetailPage());
    }
    @When("user enter its bank detail")
    public void user_enter_its_bank_detail() {
       individualAccountPageObj.enterBankDetail();
    }
    @Then("user account is created and user lands on dashboard")
    public void user_account_is_created_and_user_lands_on_dashboard() {

    }

}
