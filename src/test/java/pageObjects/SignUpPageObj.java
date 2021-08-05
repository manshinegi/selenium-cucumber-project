package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.Base;
import resources.Utility;

public class SignUpPageObj extends Base {


    public SignUpPageObj() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement email;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueBtn;

    @FindBy(linkText = "Already have an account?")
    WebElement signIn;

    @FindBy(xpath = "//h2[text()='Enter password']")
    WebElement enterpasswordLable;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "passwordConfirm")
    WebElement passwordConfirm;

    @FindBy(xpath = "//h2[text()='Enter your mobile']")
    WebElement enterMobileNoLable;

    @FindBy(xpath = "//div[contains(@class, 'MuiInput-input')]")
    WebElement countryCodeDropDown;

    @FindBy(id = "phone")
    WebElement mobileNo;

    @FindBy(xpath = "//li[text()='+91 (India (भारत))']")
    WebElement countryCode;

    @FindBy(id = "email-helper")
    WebElement emailHelper;

    @FindBy(xpath = "//h2[text()='Verify your mobile']")
    WebElement verifyMobileLable;

    @FindBy(xpath = "//div[@class='grid grid-flow-col gap-x-1.5 lg:gap-x-2 justify-center']/input[6]")
    WebElement otpCode;

    @FindBy(id = "pdsAgreed")
    WebElement termConditionCheckbox;

    @FindBy(xpath = "//h2[text()='Product Disclosure Statement']")
    WebElement disclosureStatementLable;

    @FindBy(id = "type.INDIVIDUAL")
    WebElement individualAccount;

    @FindBy(id = "type.JOINT")
    WebElement jointAccount;

    @FindBy(id = "type.BUSINESS")
    WebElement businessAccount;

    @FindBy(id = "type.TRUST")
    WebElement trustAccount;


    @FindBy(xpath = "//button[text()='Next']")
    WebElement NextBtn;

    @FindBy(xpath = "//h1[contains(text(), 'Let')]")
    WebElement letsgetStartedLabel;

    @FindBy(xpath = "//button[text()='Before we start']")
    WebElement beforeWeStartLable;

    @FindBy(xpath = "//h2[text()='Select account type']")
    WebElement selectAccountTypeLable;

    public boolean verifyLandingPage() {
        return letsgetStartedLabel.isDisplayed();
    }

    public void enterEmailId(String emailAddress) {
        prop.setProperty("emailId" , emailAddress);
        email.sendKeys(emailAddress);
    }

    public void clickOnContinueBtn() {
        continueBtn.click();
    }

    public boolean verifyCreatePasswordPage() {
        Utility.visibilitImplicitWait(driver, 10, enterpasswordLable);
        return enterpasswordLable.isDisplayed();
    }

    public void enterpassword() {
        password.sendKeys("Manshi@123");
    }

    public void enterConfirmPassword() {
        passwordConfirm.sendKeys("Manshi@123");
    }

    public void clickOnDropDown() {
        countryCodeDropDown.click();
    }

    public void selectCountryCode() {
//        while (!countryCode.isDisplayed()) {
//            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//            javascriptExecutor.executeScript("document.getElementById('id').scrollDown += 100");
//
//        }
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(countryCode));
        countryCode.click();
    }

    public void enterMobileNo() {
        mobileNo.sendKeys("8587094388");
    }

    public boolean verifyOtpPage() {
        Utility.visibilitImplicitWait(driver, 10, verifyMobileLable);
        return verifyMobileLable.isDisplayed();
    }

    public void enterOtp() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.attributeToBeNotEmpty(otpCode, "value"));

    }

    public boolean verifyTermAndConditionPage() {
        Utility.visibilitImplicitWait(driver, 10, disclosureStatementLable);
        return disclosureStatementLable.isDisplayed();
    }

    public void ClickOntermsConditionCheckbox() {
        termConditionCheckbox.click();
    }

    public boolean verifySelectAccountPage() {
        Utility.visibilitImplicitWait(driver, 10, selectAccountTypeLable);
        return selectAccountTypeLable.isDisplayed();
    }

    public boolean verifyRegisterMobilePage() {
        Utility.visibilitImplicitWait(driver, 30, enterMobileNoLable);
        return enterMobileNoLable.isDisplayed();
    }
}
