package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
    public static void visibilitImplicitWait(WebDriver driver , int  time, WebElement webElement){
        WebDriverWait webDriverWait = new WebDriverWait(driver, time);
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
