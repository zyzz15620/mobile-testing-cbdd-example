package core;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppiumBase {
    private static AndroidDriver driver;
    private static WebDriverWait webDriverWait;

    public void createDriver() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:udid", "RFCW502F4BR");
        desiredCapabilities.setCapability("appium:appActivity", "wrteam.multivendor.customer.activity.SplashActivity");
        desiredCapabilities.setCapability("appium:appPackage", "wrteam.multivendor.customer");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), desiredCapabilities);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(25));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    public void closeApp(){
        if(null!=driver) {
            driver.quit();
        }
    }
    public static AndroidDriver getDriver() {
        return driver;
    }
    public static WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }
}
