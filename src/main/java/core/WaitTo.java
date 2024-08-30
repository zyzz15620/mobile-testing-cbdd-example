package core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static core.AppiumBase.getWebDriverWait;

public class WaitTo {
    public static Boolean waitTillVisibleAndIsDisplayed(WebElement webElement) {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement)).isDisplayed();
    }
    public static String waitTillVisibleAndGetText(WebElement webElement) {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement)).getText();
    }
    public static void waitTillVisibleAndClick(WebElement webElement) {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement)).click();
    }
}
