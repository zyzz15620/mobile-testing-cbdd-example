package core;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Swipe {
    public void swipe(int startX, int startY, int endX, int endY, AndroidDriver driver) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence dragNDrop = new Sequence(finger, 1);
        dragNDrop.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), startX, startY));
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofSeconds(1), PointerInput.Origin.viewport(), endX, endY));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(dragNDrop));
    }

    public void swipeMobileUp(AndroidDriver driver) {
        Dimension size = driver.manage().window().getSize();
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);
        int startX = size.width / 2;
        swipe(startX, startY, startX, endY, driver);
    }

    public void swipeMobileUpInBox(WebElement box, AndroidDriver driver) {
        Dimension size = box.getSize();
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);
        int startX = size.width / 2;
        swipe(startX, startY, startX, endY, driver);
    }

    public void swipeInBoxUntilElementAppear(By target, int maxSwipes, AndroidDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        boolean isElementPresent = false;
        int swipes = 0;
        while (!isElementPresent && swipes < maxSwipes) {
            swipeMobileUp(driver);
            try {
                WebElement targetElement = wait.until(ExpectedConditions.visibilityOfElementLocated(target));
                isElementPresent = targetElement != null && targetElement.isDisplayed();
                if (isElementPresent) {
                    Dimension phoneSize = driver.manage().window().getSize();
                    swipe(0, phoneSize.height / 2, 0, phoneSize.height / 4, driver);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    break;
                }
            } catch (TimeoutException e) {
                swipes++;
            }
        }
        if (isElementPresent) {
            System.out.println("Element appeared after " + swipes + " swipes.");
        } else {
            System.out.println("Element did not appear after " + swipes + " swipes.");
        }
    }
}

