package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static core.WaitTo.waitTillVisibleAndClick;
import static core.WaitTo.waitTillVisibleAndIsDisplayed;

public class DefaultDeliveryLocation extends AppiumBase {
    @FindBy(id = "wrteam.multivendor.customer:id/searchView")
    private WebElement searchBox;
    @FindBy(id = "wrteam.multivendor.customer:id/tvSearch")
    private WebElement searchButton;
    @FindBy(id = "wrteam.multivendor.customer:id/recyclerView")
    private WebElement locationDisplay;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPinCode\" and @text=\"All\"]")
    private WebElement allLocation;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPinCode\" and @text=\"370405\"]")
    private WebElement pinCode370405;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPinCode\" and @text=\"841301\"]")
    private WebElement pinCode841301;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPinCode\" and @text=\"800001\"]")
    private WebElement pinCode800001;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPinCode\" and @text=\"370465\"]")
    private WebElement pinCode370465;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPinCode\" and @text=\"370001\"]")
    private WebElement pinCode370001;
    public DefaultDeliveryLocation() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    //Click
    public void clickSearchBox() {
        waitTillVisibleAndClick(searchBox);
    }

    public void clickSearchButton() {
        waitTillVisibleAndClick(searchButton);
    }

    public void clickAllLocation() {
        waitTillVisibleAndClick(allLocation);
    }

    public void clickPinCode370405() {
        waitTillVisibleAndClick(pinCode370405);
    }

    public void clickPinCode841301() {
        waitTillVisibleAndClick(pinCode841301);
    }

    public void clickPinCode800001() {
        waitTillVisibleAndClick(pinCode800001);
    }

    public void clickPinCode370465() {
        waitTillVisibleAndClick(pinCode370465);
    }

    public void clickPinCode370001() {
        waitTillVisibleAndClick(pinCode370001);
    }

    //Display
    public Boolean locationDisplayIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(locationDisplay);
    }

    public Boolean allLocationIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(allLocation);
    }

    public Boolean pinCode370405IsDisplayed() {
        return waitTillVisibleAndIsDisplayed(pinCode370405);
    }

    public Boolean pinCode841301IsDisplayed() {
        return waitTillVisibleAndIsDisplayed(pinCode841301);
    }

    public Boolean pinCode800001IsDisplayed() {
        return waitTillVisibleAndIsDisplayed(pinCode800001);
    }

    public Boolean pinCode370465IsDisplayed() {
        return waitTillVisibleAndIsDisplayed(pinCode370465);
    }

    public Boolean pinCode370001IsDisplayed() {
        return waitTillVisibleAndIsDisplayed(pinCode370001);
    }

    public Boolean searchBoxIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(searchBox);
    }

    public Boolean searchButtonIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(searchButton);
    }

}
