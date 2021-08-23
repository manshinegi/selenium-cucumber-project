package stepdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import pageObjects.IndividualAccountPageObj;
import pageObjects.JointAccountPageObj;
import resources.Base;

public class JoinAccountStepDef extends Base {

    JointAccountPageObj jointAccountPageObj;
    Faker faker;

    public JoinAccountStepDef() {
        jointAccountPageObj = new JointAccountPageObj();
        faker = new Faker();
    }

    @When("User select on joint  account")
    public void user_select_on_joint_account() {
      jointAccountPageObj.selectJointAccount();
    }
    @Then("no of individual page  is populated")
    public void no_of_individual_page_is_populated() {
        Assert.assertTrue(jointAccountPageObj.verifyNoindividualPage());
    }
    @When("user select no of individual")
    public void user_select_no_of_individual() {
    jointAccountPageObj.selectNoOfIndividuals();
    }
    @Then("user fill individuals details")
    public void user_fill_individuals_details() {

    }


}
