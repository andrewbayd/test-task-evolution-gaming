package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.BasePage;

public class ElectronicsPage extends BasePage {
    private static final String SEARCH_BUTTON_XPATH = "//a[@href='/ru/electronics/search/']";

    @FindBy(xpath = SEARCH_BUTTON_XPATH)
    private WebElement searchButton;

    public void openElectronicsSearchPage() {
        waitForElementAndClick(searchButton);
    }
}
