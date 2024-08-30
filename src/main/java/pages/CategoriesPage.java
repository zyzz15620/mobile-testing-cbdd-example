package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static core.WaitTo.waitTillVisibleAndClick;
import static core.WaitTo.waitTillVisibleAndIsDisplayed;

public class CategoriesPage extends AppiumBase {
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvTitle\" and @text=\"Coffee Product\"]")
    private WebElement coffeeProduct;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvTitle\" and @text=\" Fast Food\"]")
    private WebElement fastFood;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvTitle\" and @text=\" Home Supplies, Utilities & Stationery\"]")
    private WebElement homeSupplies;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvTitle\" and @text=\"Beverages\"]")
    private WebElement beverages;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvTitle\" and @text=\" Baby Need's\"]")
    private WebElement babyNeeds;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvTitle\" and @text=\"Vegetables\"]")
    private WebElement vegetables;
    public CategoriesPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    //Display
    public Boolean coffeeProductIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(coffeeProduct);
    }

    public Boolean fastFoodIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(fastFood);
    }

    public Boolean homeSuppliesIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(homeSupplies);
    }

    public Boolean beveragesIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(beverages);
    }

    public Boolean babyNeedsIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(babyNeeds);
    }

    public Boolean vegetablesIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(vegetables);
    }

    //Click
    public void clickCoffeeProduct() {
        waitTillVisibleAndClick(coffeeProduct);
    }

    public void clickFastFood() {
        waitTillVisibleAndClick(fastFood);
    }

    public void clickHomeSupplies() {
        waitTillVisibleAndClick(homeSupplies);
    }

    public void clickBeverages() {
        waitTillVisibleAndClick(beverages);
    }

    public void clickBabyNeeds() {
        waitTillVisibleAndClick(babyNeeds);
    }

    public void clickVegetables() {
        waitTillVisibleAndClick(vegetables);
    }
}
