package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepdefs.Swipe;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends AppiumBase {
    public CartPage() {PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);}
    Swipe swipe = new Swipe();
    @FindBy(id= "wrteam.multivendor.customer:id/tvProductName")
    WebElement productName;
    @FindBy(xpath = "(//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPrice\"])[last()]")
    WebElement productPrice;
    @FindBy(xpath = "(//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMeasurement\"])[last()]")
    WebElement productMeasurement;
    @FindBy(id = "wrteam.multivendor.customer:id/tvTotalPrice")
    WebElement totalPrice;
    @FindBy(xpath = "(//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvQuantity\"])[last()]")
    WebElement productQuantity;
    @FindBy(id = "wrteam.multivendor.customer:id/tvDelete")
    WebElement deleteButton;
    @FindBy(id = "wrteam.multivendor.customer:id/tvAction")
    WebElement saveForLaterButton;
    @FindBy(id = "wrteam.multivendor.customer:id/tvPromoCode")
    WebElement usePromoCodeButton;
    @FindBy(id = "wrteam.multivendor.customer:id/tvConfirmOrder")
    WebElement continueButton;
    @FindBy(xpath = "(//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvConfirmOrder\"])[2]")
    WebElement continueButtonWithAddress;

    //Button is displayed
    public Boolean deleteButtonIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(deleteButton)).isDisplayed();
    }
    public Boolean saveForLaterButtonIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(saveForLaterButton)).isDisplayed();
    }
    public Boolean usePromoCodeButtonIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(usePromoCodeButton)).isDisplayed();
    }
    public Boolean continueButtonIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(continueButton)).isDisplayed();
    }

    //Get details
    public String getProductName() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(productName)).getText();
    }
    public String getProductPrice() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(productPrice)).getText();
    }
    public String getProductMeasurement() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(productMeasurement)).getText();
    }
    public String getTotalPrice() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(totalPrice)).getText();
    }
    public String getProductQuantity() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(productQuantity)).getText();
    }

    //click
    public void clickDeleteButton() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(deleteButton)).click();
    }
    public void clickSaveForLaterButton() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(saveForLaterButton)).click();
    }
    public void clickUsePromoCodeButton() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(usePromoCodeButton)).click();
    }
    public void clickContinueButton() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(continueButton)).click();
    }
    public void clickContinueButtonWithAddress() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(continueButtonWithAddress)).click();
    }
}
