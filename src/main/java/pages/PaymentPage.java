package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import core.Swipe;

import static core.WaitTo.waitTillVisibleAndGetText;

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
        return waitTillVisibleAndGetText(productName);
    }
    public String getAddress() {
        return waitTillVisibleAndGetText(address);
    }
    public String getPinCode() {
        return getAddress().substring(getAddress().length() - 6);
    }
    public String getTime() {
        return waitTillVisibleAndGetText(time);
    }
    public String getGrandTotal() {
        return waitTillVisibleAndGetText(grandTotal);
    }
    public String getSubTotal() {
        return waitTillVisibleAndGetText(subTotal);
    }
    public String getDeliveryCharge() {
        return waitTillVisibleAndGetText(deliveryCharge);
    }
    public String getSavedAmount() {
        return waitTillVisibleAndGetText(savedAmount);
    }
    public String getTotalPrice() {
        return waitTillVisibleAndGetText(totalPrice);
    }

}
