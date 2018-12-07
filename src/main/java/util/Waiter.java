package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static util.DriverWrapper.driver;

public class Waiter {
    static final int SHORT_DELAY = 5;
    static final int MEDIUM_DELAY = 15;
    static final int LONG_DELAY = 30;

    void waitForElementIsVisible(WebElement element, int delay) {
        WebDriverWait wait = new WebDriverWait(driver, delay);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    void waitForSeveralElementsAreVisible(List<WebElement> elements, int delay) {
        WebDriverWait wait = new WebDriverWait(driver, delay);
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    void hardWaiter() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
