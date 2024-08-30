package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Swipe;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static core.WaitTo.*;

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
        return waitTillVisibleAndIsDisplayed(deleteButton);
    }
    public Boolean saveForLaterButtonIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(saveForLaterButton);
    }
    public Boolean usePromoCodeButtonIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(usePromoCodeButton);
    }
    public Boolean continueButtonIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(continueButton);
    }

    //Get details
    public String getProductName() {
        return waitTillVisibleAndGetText(productName);
    }
    public String getProductPrice() {
        return waitTillVisibleAndGetText(productPrice);
    }
    public String getProductMeasurement() {
        return waitTillVisibleAndGetText(productMeasurement);
    }
    public String getTotalPrice() {
        return waitTillVisibleAndGetText(totalPrice);
    }
    public String getProductQuantity() {
        return waitTillVisibleAndGetText(productQuantity);
    }

    //click
    public void clickDeleteButton() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(deleteButton)).click();
    }
    public void clickSaveForLaterButton() {
        waitTillVisibleAndClick(saveForLaterButton);
    }
    public void clickUsePromoCodeButton() {
        waitTillVisibleAndClick(usePromoCodeButton);
    }
    public void clickContinueButton() {
        waitTillVisibleAndClick(continueButton);
    }
    public void clickContinueButtonWithAddress() {
        waitTillVisibleAndClick(continueButtonWithAddress);
    }
}
