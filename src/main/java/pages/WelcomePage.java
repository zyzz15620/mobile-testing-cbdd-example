package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static core.WaitTo.waitTillVisibleAndClick;
import static core.WaitTo.waitTillVisibleAndIsDisplayed;

public class WelcomePage extends AppiumBase {
    @FindBy(id = "wrteam.multivendor.customer:id/tvSkip")
    private WebElement skipButton;
    @FindBy(id = "wrteam.multivendor.customer:id/tvNext")
    private WebElement nextButton;
    @FindBy(id = "wrteam.multivendor.customer:id/tvMessage")
    private WebElement lookForThingsAroundYouText;
    public WelcomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    //Display
    public Boolean skipButtonIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(skipButton);
    }

    public Boolean nextButtonIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(nextButton);
    }

    public Boolean lookForThingsAroundYouTextIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(lookForThingsAroundYouText);
    }

    //Click
    public void clickSkipButton() {
        waitTillVisibleAndClick(skipButton);
    }

    public void clickNextButton() {
        waitTillVisibleAndClick(nextButton);
    }
}
