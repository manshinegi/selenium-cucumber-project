package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import resources.Base;
import resources.Utility;

import java.util.concurrent.TimeUnit;

public class IndividualAccountPageObj extends Base {

    public IndividualAccountPageObj() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "type.INDIVIDUAL")
    WebElement individualAccount;

    @FindBy(xpath = "//h2[text()='Select account type']")
    WebElement selectAccountTypeLable;

    @FindBy(xpath = "//button[text()='Next']")
    WebElement nextBtn;

    @FindBy(xpath = "//h1[contains(text(), 'Let')]")
    WebElement letsgetStartedLabel;

    @FindBy(xpath = "//h2[text()='Before we start']")
    WebElement beforeWeStartLable;

    @FindBy(id = "individuals[0].firstName")
    WebElement firstName;

    @FindBy(id = "individuals[0].middleName")
    WebElement middleName;

    @FindBy(id = "individuals[0].lastName")
    WebElement lastName;

    @FindBy(xpath = "//h2[text()='Your details']")
    WebElement yourDetailLable;

    @FindBy(xpath = "//button[text()='Back']")
    WebElement backBtn;

    @FindBy(xpath = "//h2[contains(@class,'text-3xl')]")
    WebElement enterDOBLable;

    @FindBy(xpath = "//input[@id='individuals[0].dob']")
    WebElement DOB;

    @FindBy(xpath = "//button[text()='Enter address manually or international address']")
    WebElement enterAddressManuallyBtn;

    @FindBy(xpath = "//h2[text()='Enter your residential address']")
    WebElement EnterYourResidentialAddressLable;

    @FindBy(id = "individuals[0].address.addressLine1")
    WebElement addressLineOne;

    @FindBy(id = "individuals[0].address.addressLine2")
    WebElement addressLineTwo;

    @FindBy(id = "individuals[0].address.state")
    WebElement state;

    @FindBy(id = "individuals[0].address.postcode")
    WebElement postcode;

    @FindBy(id = "individuals[0].address.country")
    WebElement country;

    @FindBy(xpath = "//h2[text()='Choose ID type for verification']")
    WebElement chooseIdTypeForVerificationLable;

    @FindBy(id = "individuals[0].identification.type.DRIVER_LICENCE")
    WebElement driverLicenceBtn;

    @FindBy(id = "individuals[0].identification.state")
    WebElement identificationState;

    @FindBy(id = "individuals[0].identification.number")
    WebElement identificationNumber;

    @FindBy(xpath = "//h2[text()='Please take a photo of your ID']")
    WebElement takeYourPhotoIdLabel;

    @FindBy(id = "individuals[0].identification.files")
    WebElement uploadFileBtn;

    @FindBy(id = "individuals[0].tfn")
    WebElement tfn;

    @FindBy(id = "individuals[0].hasTaxOverseas.false")
    WebElement falseRadioBtn;

    @FindBy(xpath = "//h2[text()='Check these details match your ID']")
    WebElement checkTheseDetailsMatchYourIdLabel;

    @FindBy(id = "individuals[0].verificationConsent")
    WebElement verifyConsentCheckbox;

    @FindBy(xpath = "//button[text()='Verify']")
    WebElement verifyBtn;

    @FindBy(id = "individuals[0].identification.state")
    WebElement stateDropDown;

    @FindBy(xpath = "//li[@data-testid='individuals[0].identification.state-2']")
    WebElement option;

    @FindBy(id = "individuals[0].identification.files")
    WebElement uploadFile;

    @FindBy(id = "individuals[0].isPEP.false")
    WebElement PEPFalse;

    @FindBy(xpath = "//button[text()='Recheck']")
    WebElement recheckBtn;

    @FindBy(xpath = "//button[text()='Skip']")
    WebElement skipBtn;

    @FindBy(xpath = "//button[contains (text() , 'Recheck')]")
    WebElement recheckDetailsBtn;

    @FindBy(id = "investmentType.ASCF_PREMIUM")
    WebElement premiumProduct;

    @FindBy(id = "investments[0].term.MONTHS_3")
    WebElement threeMonthTerm;

    @FindBy(id = "investments[0].amount")
    WebElement amount;

    @FindBy(id="bankAccount.name")
    WebElement bankAccountName;
    @FindBy(id="bankAccount.bsb")
    WebElement bsb;
    @FindBy(id="bankAccount.number")
    WebElement accountNumber;

    public boolean verifySelectAccountPage() {
        Utility.visibilitImplicitWait(driver, 30, selectAccountTypeLable);
        return selectAccountTypeLable.isDisplayed();
    }

    public void selectIndividualAccount() {
        individualAccount.click();
    }

    public boolean verifyReminderPage() {
        Utility.visibilitImplicitWait(driver, 30, beforeWeStartLable);
        return beforeWeStartLable.isDisplayed();
    }

    public void enterFirstName(String name) {
        firstName.sendKeys(name);
    }

    public void enterMiddelName(String name) {
        middleName.sendKeys(name);
    }

    public void enterLastName(String name) {
        lastName.sendKeys(name);
    }

    public void clickOnNextBtn() {
        nextBtn.click();
    }

    public boolean verifyUserAddressPage() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return true;
    }

    public void enterDOB(String dob) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        DOB.sendKeys(dob);
    }

    public Boolean verifyUserDOBPage() {
        Utility.visibilitImplicitWait(driver, 30, enterDOBLable);
        return enterDOBLable.isDisplayed();
    }

    public boolean verifyUserDetailPage() {
        Utility.visibilitImplicitWait(driver, 30, yourDetailLable);
        return yourDetailLable.isDisplayed();
    }

    public void clickOnEnterAddressManuallyLink() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        enterAddressManuallyBtn.click();
        enterAddressManuallyBtn.click();
    }

    public void enterUserAdrress() {
        addressLineOne.sendKeys("house no 1834 , 4th lane , htjjjj");
        addressLineTwo.sendKeys("hssdqsadakd");
        state.sendKeys("abcd");
        postcode.sendKeys("121009");
        country.sendKeys("asbvc");
    }

    public boolean verifyIdTypeforVerificationPage() {
        Utility.visibilitImplicitWait(driver, 30, chooseIdTypeForVerificationLable);
        return chooseIdTypeForVerificationLable.isDisplayed();
    }

    public void clickOnDriverLicenceOption() {
        driverLicenceBtn.click();
    }

    public boolean verifyUserLicenceDetailPage() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return true;
    }

    public void enterState() {
        stateDropDown.click();
        option.click();
    }

    public void enterDriverLicenceNo(String idNo) {
        identificationNumber.sendKeys(idNo);
    }

    public boolean verifytakeYourPhotoIdPage() {
//        Utility.visibilitImplicitWait(driver, 30, takeYourPhotoIdLabel);
//        return takeYourPhotoIdLabel.isDisplayed();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return true;
    }

    public void uploadFile() {
        uploadFile.sendKeys("/Users/apple/Downloads/example.pdf");
    }

    public boolean verifyTaxFileNoPage() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return true;
    }

    public void enterTFN() {
        tfn.sendKeys("123456789");
    }

    public boolean verifyTaxObligationOutsidePage() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return true;
    }

    public void chooseOptionFalse() {
        falseRadioBtn.click();
    }

    public void clickOnConfirmCheckbox() {
        verifyConsentCheckbox.click();
    }

    public boolean verifVerifyUserDetailPage() {
//        Utility.visibilitImplicitWait(driver, 30, checkTheseDetailsMatchYourIdLabel);
//        return checkTheseDetailsMatchYourIdLabel.isDisplayed();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return true;
    }

    public void clickOnVerifyBtn() {
        verifyBtn.click();
    }

    public void clickOnNoOption() {
        PEPFalse.click();
    }

    public boolean verifyPoliticalyExposedPage() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return true;
    }

    public void clickOnSkipBtn() {
        skipBtn.click();
    }

    public boolean verifAlertOfVerifiaction() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return true;
    }

    public void clickOnRececkDetails() {
        recheckDetailsBtn.click();
    }

    public void chooseProductType() {
        premiumProduct.click();
    }

    public boolean verifyProducTypePage() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return true;
    }

    public boolean verifyTermTypePage() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return true;
    }

    public void clickOnThreeMonthPlan() {
        threeMonthTerm.click();
    }

    public boolean verifyEnterInvestmentMoneyPage() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return true;
    }

    public void enterInvestmentMoney() {
        amount.sendKeys("10000");
    }



    public boolean verifyEnterBonusCodePage() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return true;
    }

    public void clicknext() {
        //  WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        //  webDriverWait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(nextBtn)));
        driver.navigate().refresh();
        nextBtn.click();
    }

    public boolean verifyBankDetailPage() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return true;
    }

    public void enterBankDetail() {
        bankAccountName.sendKeys("ICICI");
        bsb.sendKeys("11123223");
        accountNumber.sendKeys("1210098433");

    }
}
