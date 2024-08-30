package pages;

import core.AppiumBase;
import core.Swipe;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static core.WaitTo.waitTillVisibleAndClick;

public class HomePage extends AppiumBase {
    Swipe swipe = new Swipe();
    @FindBy(id = "wrteam.multivendor.customer:id/navCategory")
    private WebElement categoryTab;
    @FindBy(id = "wrteam.multivendor.customer:id/navProfile")
    private WebElement profileTab;
    @FindBy(id = "wrteam.multivendor.customer:id/navWishList")
    private WebElement wishListTab;
    @FindBy(id = "wrteam.multivendor.customer:id/tvTitleSeller")
    private WebElement pageLoadedIndicator;
    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    //Click
    public void clickCategoryTab() {
        waitTillVisibleAndClick(categoryTab);
    }

    public void clickProfileTab() {
        waitTillVisibleAndClick(profileTab);
    }

    public void clickWishListTab() {
        waitTillVisibleAndClick(wishListTab);
    }

    //Swipe
    public void swipeToFreshVeg() {
        By freshVegHeader = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvTitle\" and @text=\"Fresh Vagetables\"]");
        swipe.swipeInBoxUntilElementAppear(freshVegHeader, 5, getDriver());
    }

    public void swipeToCoffe() {
        By coffeeHeader = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvTitle\" and @text=\"Coffee\"]");
        swipe.swipeInBoxUntilElementAppear(coffeeHeader, 5, getDriver());
    }

    public int freshVegCount() {
        return getDriver().findElements(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvSubTitle\" and @text=\"Vegetables Products\"]\n" +
                "//parent::android.widget.RelativeLayout\n" +
                "//following-sibling::androidx.recyclerview.widget.RecyclerView\n" +
                "//android.widget.FrameLayout")).size();
    }

    public void clickFreshVegViewAll() {
        waitTillVisibleAndClick(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvSubTitle\" and @text=\"Vegetables Products\"]\n" +
                "//following-sibling::android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMore\"]"));
        //Tại vì có nhiều nút view all nên phải dùng xpath để xác định chính xác nút view all của fresh veg
    }

    public void clickCoffeeViewAll() {
        waitTillVisibleAndClick(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvSubTitle\" and @text=\"Coffee Products\"]\n" +
                "//following-sibling::android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMore\"]"));
    }

    public void pageIsLoaded() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(pageLoadedIndicator));
    }


}
