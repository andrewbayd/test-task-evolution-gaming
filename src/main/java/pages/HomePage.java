package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.BasePage;

public class HomePage extends BasePage {
    private static final String ELECTRONICS_LINK_XPATH = "//a[@title='Объявления Электротехника']";

    @FindBy(xpath = ELECTRONICS_LINK_XPATH)
    private WebElement electronicsLink;

    public void openElectronicsPage() {
        waitForElementAndClick(electronicsLink);
    }

}
