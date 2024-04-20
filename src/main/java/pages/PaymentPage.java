package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import stepdefs.Swipe;

public class PaymentPage extends AppiumBase {
    public PaymentPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    Swipe swipe = new Swipe();
    @FindBy(id = "wrteam.multivendor.customer:id/tvItemName")
    WebElement productName;
    @FindBy(id = "wrteam.multivendor.customer:id/tvAddress")
    WebElement address;
    @FindBy(id = "wrteam.multivendor.customer:id/tvSelectDeliveryDate")
    WebElement time;
    @FindBy(id = "wrteam.multivendor.customer:id/tvGrandTotal")
    WebElement grandTotal;
    @FindBy(xpath = "(//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvSubTotal\"])[2]")
    WebElement subTotal;
    @FindBy(id = "wrteam.multivendor.customer:id/tvDeliveryCharge")
    WebElement deliveryCharge;
    @FindBy(id = "wrteam.multivendor.customer:id/tvSaveAmount")
    WebElement savedAmount;
    @FindBy(xpath = "(//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvSubTotal\"])[1]")
    WebElement totalPrice;

    //get details
    public String getProductName() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(productName)).getText();
    }
    public String getAddress() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(address)).getText();
    }
    public String getPinCode() {
        return getAddress().substring(getAddress().length() - 6);
    }
    public String getTime() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(time)).getText();
    }
    public String getGrandTotal() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(grandTotal)).getText();
    }
    public String getSubTotal() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(subTotal)).getText();
    }
    public String getDeliveryCharge() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(deliveryCharge)).getText();
    }
    public String getSavedAmount() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(savedAmount)).getText();
    }
    public String getTotalPrice() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(totalPrice)).getText();
    }

}
