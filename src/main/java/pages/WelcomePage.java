package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WelcomePage extends AppiumBase {
    public WelcomePage() {PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);}

    @FindBy(id = "wrteam.multivendor.customer:id/tvSkip")
    private WebElement skipButton;
    @FindBy(id = "wrteam.multivendor.customer:id/tvNext")
    private WebElement nextButton;
    @FindBy(id = "wrteam.multivendor.customer:id/tvMessage")
    private WebElement lookForThingsAroundYouText;

    //Display
    public Boolean skipButtonIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(skipButton)).isDisplayed();
    }
    public Boolean nextButtonIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(nextButton)).isDisplayed();
    }
    public Boolean lookForThingsAroundYouTextIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(lookForThingsAroundYouText)).isDisplayed();
    }

    //Click
    public void clickSkipButton() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(skipButton)).click();
    }
    public void clickNextButton() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(nextButton)).click();
    }
}
