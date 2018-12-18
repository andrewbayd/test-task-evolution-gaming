package util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;



public class WebDriverLogger extends AbstractWebDriverEventListener {
    private static final Logger LOGGER = LogManager.getLogger(WebDriverLogger.class);

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        LOGGER.info("Navigated to " + s);
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        LOGGER.info(webElement + " is clicked");
    }

}
