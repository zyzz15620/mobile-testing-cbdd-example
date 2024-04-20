package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends AppiumBase {
    public LoginPage() {PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);}

    @FindBy(id = "wrteam.multivendor.customer:id/btnLogin")
    private WebElement loginButton;
    @FindBy(id = "wrteam.multivendor.customer:id/tvSignUp")
    private WebElement signUpButton;
    @FindBy(id = "wrteam.multivendor.customer:id/tvForgotPass")
    private WebElement forgotPasswordButton;
    @FindBy(id = "wrteam.multivendor.customer:id/edtLoginMobile")
    private WebElement mobileField;
    @FindBy(id = "wrteam.multivendor.customer:id/imgLoginPassword")
    private WebElement passwordField;

    //is Displayed
    public Boolean loginButtonIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(loginButton)).isDisplayed();
    }
    public Boolean signUpButtonIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(signUpButton)).isDisplayed();
    }
    public Boolean forgotPasswordButtonIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(forgotPasswordButton)).isDisplayed();
    }
    public Boolean mobileFieldIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(mobileField)).isDisplayed();
    }
    public Boolean passwordFieldIsDisplayed() {
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(passwordField)).isDisplayed();
    }

    //click
    public void clickLoginButton() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(loginButton)).click();
    }

}
