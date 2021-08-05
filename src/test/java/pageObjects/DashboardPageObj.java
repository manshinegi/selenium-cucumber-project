package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.Base;
import resources.Utility;

public class DashboardPageObj extends Base {
    public DashboardPageObj() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//mat-icon[text()='close']")
    WebElement crossImg;

    @FindBy(linkText = "Dashboard")
    WebElement dashboardLable;

    @FindBy(xpath = "//div[@class='username']")
    WebElement email;

    @FindBy(xpath = "//a[contains(@class, 'mat-tab-link')]")
    WebElement userName;

    @FindBy(xpath = "//button[@xpath='1']")
    WebElement earnrNavigationBtn;

    @FindBy(xpath = "//h2[text()='Earnr Summary']")
    WebElement earnrSummaryLabel;

    @FindBy(xpath = "//button[contains (@class ,'mat-flat-button')]")
    WebElement logOutBtn;

    @FindBy(xpath = "//button[@routerLink='profile']")
    WebElement profileBtn;


    @FindBy(xpath = "//button[@routerLink='account']")
    WebElement accountBtn;

    public boolean verifyDashboardPage() {

        Utility.visibilitImplicitWait(driver, 30, dashboardLable);
        return dashboardLable.isDisplayed();
    }

    public boolean verifyUserDetailOnDashboard() {
        return email.equals(prop.getProperty("emailId")) && userName.equals(prop.getProperty("userName"));
    }

    public void clickOnNavigationBtn() {
        earnrNavigationBtn.click();
    }

    public boolean verifyEarnrSummryPage() {
        Utility.visibilitImplicitWait(driver, 30, earnrSummaryLabel);
        return earnrSummaryLabel.isDisplayed();
    }

    public void clickOnLogoutBtn() {
        logOutBtn.click();
    }

    public boolean verifyUserIsLogout() {
        Utility.visibilitImplicitWait(driver, 30, earnrSummaryLabel);
        return earnrSummaryLabel.isDisplayed();
    }

    public void clickOnProfileBtn() {
        profileBtn.click();
    }

    public boolean verifyUserProfilepage() {
        Utility.visibilitImplicitWait(driver, 30, earnrSummaryLabel);
        return earnrSummaryLabel.isDisplayed();
    }
}

