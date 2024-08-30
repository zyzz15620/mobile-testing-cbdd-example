package pages;

import core.AppiumBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import core.Swipe;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static core.WaitTo.waitTillVisibleAndClick;

public class ProfilePage extends AppiumBase {
    public ProfilePage() {PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);}
    Swipe swipe = new Swipe();

    @FindBy(id = "wrteam.multivendor.customer:id/lytProfile")
    private WebElement welcomeGuest;
    @FindBy(id = "wrteam.multivendor.customer:id/tvMenuHome")
    private WebElement home;
    @FindBy(id = "wrteam.multivendor.customer:id/tvMenuCart")
    private WebElement cart;
    @FindBy(id = "wrteam.multivendor.customer:id/tvMenuNotification")
    private WebElement notification;
    @FindBy(id = "wrteam.multivendor.customer:id/tvMenuOrders")
    private WebElement orders;
    @FindBy(id = "wrteam.multivendor.customer:id/tvMenuWalletHistory")
    private WebElement walletHistory;

    public void clickWelcomeGuest() {
        waitTillVisibleAndClick(welcomeGuest);
    }

    public Set<String> getProfileSettings() {
            Set<String> productNames = new HashSet<>();
            List<WebElement> productElements = getDriver().findElements(AppiumBy.xpath("" +
                    "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]\n" +
                    "//android.widget.TextView"));
            for (WebElement productElement : productElements) {
                productNames.add(productElement.getText());
            }
            swipe.swipeMobileUp(getDriver());

            List<WebElement> productElements2 = getDriver().findElements(AppiumBy.xpath("" +
                    "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout" +
                    "//android.widget.TextView"));
            for (WebElement productElement : productElements2) {
                productNames.add(productElement.getText());
            }
            return productNames;
        }
    }

