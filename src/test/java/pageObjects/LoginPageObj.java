package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.Base;
import resources.Utility;

public class LoginPageObj extends Base {
    public LoginPageObj() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Already have an account?")
    WebElement loginLink;
    @FindBy(xpath = "//h3[text()='Welcome back']")
    WebElement welcomeText;
    @FindBy(id = "mat-input-0")
    WebElement emailId;
    @FindBy(id = "mat-input-1")
    WebElement password;
    @FindBy(xpath = "//button[ @type='button']")
    WebElement loginBtn;
    @FindBy(xpath = "//strong[contains(text(), 'finalise your account')]")
    WebElement finaliseAcountText;
    @FindBy(xpath = "//p[contains(@class,'userNotFound')]")
    WebElement userNotFoundText;
    @FindBy(xpath = "//mat-icon[text()='close']")
    WebElement crossImg;

    public void clickOnLoginLink() {
        loginLink.click();
    }

    public boolean verifyLoginPage() {
        Utility.visibilitImplicitWait(driver, 10, welcomeText);
        return welcomeText.isDisplayed();
    }

    public void enterEmailId(String email) {
        emailId.sendKeys(email);
    }

    public void enterPassword(String pswd) {
        password.sendKeys(pswd);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public boolean dashboardPage() {
       // Utility.visibilitImplicitWait(driver, 30, finaliseAcountText);
        return finaliseAcountText.isDisplayed();
    }


    public boolean verifyErrorMsg() {
        Utility.visibilitImplicitWait(driver, 30, userNotFoundText);
        return userNotFoundText.isDisplayed();

    }

    public void clickOnClose() {
        crossImg.click();
    }
}
