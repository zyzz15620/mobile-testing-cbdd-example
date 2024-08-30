package stepdefs;

import core.AppiumBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.net.MalformedURLException;

public class ServiceHooks {
    AppiumBase appiumBase = new AppiumBase();

    @Before  //Cucumber annotation
    public void initDriver() throws MalformedURLException {
        appiumBase.createDriver();
    }

    @After
    public void afterHook(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.attach(((TakesScreenshot) AppiumBase.getDriver()).getScreenshotAs(OutputType.BYTES), "png", "image.png");
        }
        appiumBase.closeApp();
    }
}
