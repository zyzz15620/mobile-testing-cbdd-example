package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Swipe;

public class ProductPage extends AppiumBase {
    public ProductPage() {PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);}
    Swipe swipe = new Swipe();
    @FindBy(id= "wrteam.multivendor.customer:id/tvProductName")
    WebElement productName;
    @FindBy(xpath = "//android.widget.RelativeLayout[@resource-id=\"wrteam.multivendor.customer:id/lytMainPrice\"]\n" +
            "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPrice\"]")
    WebElement productPrice; //Price lấy theo index đôi lúc có thể bị sai, cho nên dùng xpath dài hơn
    @FindBy(xpath = "(//android.widget.Button[@resource-id=\"wrteam.multivendor.customer:id/btnAddToCart\"])[1]")
    WebElement addToCartButton;
    @FindBy(id = "wrteam.multivendor.customer:id/btnCart")
    WebElement goToCartButton;
    @FindBy(id = "wrteam.multivendor.customer:id/lytSimilar")
    WebElement similarProduct;

    public Boolean isProductDisplayed() {
        return productName.isDisplayed();
    }
    public Boolean isProductPriceDisplayed() {
        return productPrice.isDisplayed();
    }
    public Boolean isAddToCartButtonDisplayed() {
        return addToCartButton.isDisplayed();
    }
    public Boolean isGoToCartButtonDisplayed() {
        return goToCartButton.isDisplayed();
    }
    public Boolean isSimilarProductDisplayed() {
        return similarProduct.isDisplayed();
    }
    public String getProductName() {
        return productName.getText();
    }
    public String getProductPrice() {
        return productPrice.getText();
    }
}
