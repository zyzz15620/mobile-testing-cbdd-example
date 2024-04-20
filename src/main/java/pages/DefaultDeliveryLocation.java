package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DefaultDeliveryLocation extends AppiumBase {
    public DefaultDeliveryLocation() {PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);}

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



    //Click
    public void clickSearchBox() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(searchBox)).click();
    }
    public void clickSearchButton() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(searchButton)).click();
    }
    public void clickAllLocation() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(allLocation)).click();
    }
    public void clickPinCode370405() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(pinCode370405)).click();
    }
    public void clickPinCode841301() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(pinCode841301)).click();
    }
    public void clickPinCode800001() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(pinCode800001)).click();
    }
    public void clickPinCode370465() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(pinCode370465)).click();
    }
    public void clickPinCode370001() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(pinCode370001)).click();
    }

    //Display
    public Boolean locationDisplayIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(locationDisplay)).isDisplayed();
    }
    public Boolean allLocationIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(allLocation)).isDisplayed();
    }
    public Boolean pinCode370405IsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(pinCode370405)).isDisplayed();
    }
    public Boolean pinCode841301IsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(pinCode841301)).isDisplayed();
    }
    public Boolean pinCode800001IsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(pinCode800001)).isDisplayed();
    }
    public Boolean pinCode370465IsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(pinCode370465)).isDisplayed();
    }
    public Boolean pinCode370001IsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(pinCode370001)).isDisplayed();
    }
    public Boolean searchBoxIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(searchBox)).isDisplayed();
    }
    public Boolean searchButtonIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(searchButton)).isDisplayed();
    }

}
