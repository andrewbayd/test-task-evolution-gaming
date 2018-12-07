package util;

import static util.Constants.HOMEPAGE_URL;
import static util.DriverWrapper.driver;

public class Navigator {
    public void openApp() {
        driver.manage().deleteAllCookies();
        driver.get(HOMEPAGE_URL);
    }

    public void closeBrowser() {
        driver.quit();
    }
}
