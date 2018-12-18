package util;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

class DriverWrapper {
    private static final String CHROME_DRIVER_PATH = "./src/main/resources/chromedriver";

    private static EventFiringWebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        return new EventFiringWebDriver(new ChromeDriver());
    }

    static EventFiringWebDriver driver = getDriver().register(new WebDriverLogger());
}
