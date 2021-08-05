package resources;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties prop;
    public static Base  base;

    public Base() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
                    + "/src/test/java/config/config.properties");
            prop.load(fis);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialisation() {
        if(base==null){
            base = new Base();
        }
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(prop.getProperty("url"));
    }

    public static void getScreenshot(String result) throws IOException
    {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(System.getProperty("user.dir"+"/src/test/screenshots"+result+"screenshot.png")));

    }


    public static void closeBrowser() {
        driver.quit();
    }
}
