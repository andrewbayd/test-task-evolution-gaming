package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.BasePage;

public class HomePage extends BasePage {

    private static final String LANGUAGE_BUTTON_XPATH = "//span[@class='menu_lang']";
    private static final String ELECTRONICS_LINK_XPATH = "//a[@title='Объявления Электротехника']";

    @FindBy(xpath = LANGUAGE_BUTTON_XPATH)
    private WebElement languageButton;

    @FindBy(xpath = ELECTRONICS_LINK_XPATH)
    private WebElement electronicsLink;

    public void switchToRussian() {
        waitForElementAndClick(languageButton);
    }

    public void openElectronicsPage() {
        waitForElementAndClick(electronicsLink);
    }

}
