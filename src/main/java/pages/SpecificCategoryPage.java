package pages;

import core.AppiumBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import core.Swipe;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static core.WaitTo.waitTillVisibleAndClick;

public class SpecificCategoryPage extends AppiumBase {
    public SpecificCategoryPage() {PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);}
    Swipe swipe = new Swipe();
    @FindBy(id= "wrteam.multivendor.customer:id/toolbar_cart")
    WebElement cartButton;

    public void swipeToProductContains(String productName) {
        By product = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/productName\" and contains(@text, '" + productName + "')]");
        swipe.swipeInBoxUntilElementAppear(product, 3, getDriver());
    }
    public void clickOnProductContains(String productName) {
        By product = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/productName\" and contains(@text, '" + productName + "')]");
        waitTillVisibleAndClick((WebElement) product);
    }
    public int countProduct(int maxSwipe) {
        Set<String> productNames = new HashSet<>();
        for (int i = 0; i < maxSwipe; i++) {
            List<WebElement> productElements = getDriver().findElements(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/productName\"]"));
            for (WebElement productElement : productElements) {
                productNames.add(productElement.getText());
            }
            swipe.swipeMobileUp(getDriver());
        }
        return productNames.size();
    }
    public void addToCartProductContains(String productName) {
        By product = AppiumBy.xpath("" +
                "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/productName\" and contains(@text, '"+productName+"')]\n" +
                "//ancestor::android.widget.RelativeLayout[@resource-id=\"wrteam.multivendor.customer:id/lytPrice\"]\n" +
                "//following-sibling::android.widget.LinearLayout\n" +
                "//android.widget.Button[@resource-id=\"wrteam.multivendor.customer:id/btnAddToCart\"]");
        waitTillVisibleAndClick((WebElement) product);
    }
    public void addQuantityProductContains(String productName) {
        By product = AppiumBy.xpath("" +
                "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/productName\" and contains(@text, '"+productName+"')]\n" +
                "//ancestor::android.widget.RelativeLayout[@resource-id=\"wrteam.multivendor.customer:id/lytPrice\"]\n" +
                "//following-sibling::android.widget.LinearLayout\n" +
                "//android.widget.ImageButton[@resource-id=\"wrteam.multivendor.customer:id/btnAddQuantity\"]");
        waitTillVisibleAndClick((WebElement) product);
    }
    public void clickCartButton() {
        waitTillVisibleAndClick(cartButton);
    }
}
