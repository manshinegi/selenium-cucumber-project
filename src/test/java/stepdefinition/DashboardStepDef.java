package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.DashboardPageObj;
import resources.Base;

public class DashboardStepDef extends Base {
    DashboardPageObj dashboardPageObj;
    public DashboardStepDef() {
        dashboardPageObj = new DashboardPageObj();
    }


    @When("user is on dashboard")
    public void user_is_on_dashboard() {
        Assert.assertTrue(dashboardPageObj.verifyDashboardPage());
    }
    @Then("user should able to see correct data of its account on dashborad")
    public void user_should_able_to_see_correct_data_of_its_account_on_dashborad() {
        Assert.assertTrue(dashboardPageObj.verifyUserDetailOnDashboard());
    }

    @When("user click on navigation button")
    public void user_click_on_navigation_button() {
dashboardPageObj.clickOnNavigationBtn();
    }
    @Then("user should be able to see account summary")
    public void user_should_be_able_to_see_account_summary() {;
        Assert.assertTrue(dashboardPageObj.verifyEarnrSummryPage());
    }

    @When("user click on logout button")
    public void user_click_on_logout_button() {
        dashboardPageObj.clickOnLogoutBtn();
    }
    @Then("user should be logged out")
    public void user_should_be_logged_out() {
        Assert.assertTrue( dashboardPageObj.verifyUserIsLogout());
    }
    @When("user click on profile button")
    public void user_click_on_profile_button() {
dashboardPageObj.clickOnProfileBtn();
    }
    @Then("user should able to see its profile")
    public void user_should_able_to_see_its_profile() {
        Assert.assertTrue( dashboardPageObj.verifyUserProfilepage());
    }

    @Then("user should be able to its earnr balance and returns")
    public void user_should_be_able_to_its_earnr_balance_and_returns() {
    }
    @Then("should be able to see bank account returns")
    public void should_be_able_to_see_bank_account_returns() {

    }
    @Then("should be able to see stock returns")
    public void should_be_able_to_see_stock_returns() {

    }
    @Then("should be able to see lazy money returns")
    public void should_be_able_to_see_lazy_money_returns() {

    }



}

