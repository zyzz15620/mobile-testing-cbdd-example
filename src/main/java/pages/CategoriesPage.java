package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import stepdefs.Swipe;

public class CategoriesPage extends AppiumBase {
    public CategoriesPage() {PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);}
    Swipe swipe = new Swipe();

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

    //Display
    public Boolean coffeeProductIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(coffeeProduct)).isDisplayed();
    }
    public Boolean fastFoodIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(fastFood)).isDisplayed();
    }
    public Boolean homeSuppliesIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(homeSupplies)).isDisplayed();
    }
    public Boolean beveragesIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(beverages)).isDisplayed();
    }
    public Boolean babyNeedsIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(babyNeeds)).isDisplayed();
    }
    public Boolean vegetablesIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(vegetables)).isDisplayed();
    }

    //Click
    public void clickCoffeeProduct() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(coffeeProduct)).click();
    }
    public void clickFastFood() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(fastFood)).click();
    }
    public void clickHomeSupplies() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(homeSupplies)).click();
    }
    public void clickBeverages() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(beverages)).click();
    }
    public void clickBabyNeeds() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(babyNeeds)).click();
    }
    public void clickVegetables() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(vegetables)).click();
    }


}
