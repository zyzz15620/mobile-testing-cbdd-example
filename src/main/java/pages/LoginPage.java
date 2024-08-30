package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static core.WaitTo.waitTillVisibleAndClick;
import static core.WaitTo.waitTillVisibleAndIsDisplayed;

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
        return waitTillVisibleAndIsDisplayed(loginButton);
    }
    public Boolean signUpButtonIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(signUpButton);
    }
    public Boolean forgotPasswordButtonIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(forgotPasswordButton);
    }
    public Boolean mobileFieldIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(mobileField);
    }
    public Boolean passwordFieldIsDisplayed() {
        return waitTillVisibleAndIsDisplayed(passwordField);
    }

    //click
    public void clickLoginButton() {
        waitTillVisibleAndClick(loginButton);
    }

}
