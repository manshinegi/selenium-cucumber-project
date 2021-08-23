package pageObjects;

import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.Base;

import java.util.concurrent.TimeUnit;

public class JointAccountPageObj extends Base {
    public JointAccountPageObj() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "type.JOINT")
    WebElement jointAccount;

    @FindBy(xpath = "//h2[text()='Select account type']")
    WebElement selectAccountTypeLable;

    @FindBy(xpath = "//button[text()='Next']")
    WebElement nextBtn;

    @FindBy(xpath = "//h1[contains(text(), 'Let')]")
    WebElement letsgetStartedLabel;

    @FindBy(xpath = "//h2[text()='Before we start']")
    WebElement beforeWeStartLable;

    @FindBy(id="numberOfIndividuals")
    WebElement noOfIndiviuals;

    @FindBy(xpath = "//li[@data-testid='numberOfIndividuals-1']")
    WebElement option;


    public void selectJointAccount() {
        jointAccount.click();
    }

    public boolean verifyNoindividualPage() {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return true;
    }

    public void selectNoOfIndividuals() {
        noOfIndiviuals.click();
        option.click();
    }
    @Then("user fill individuals details")
    public void user_fill_individuals_details() {
    }

}
