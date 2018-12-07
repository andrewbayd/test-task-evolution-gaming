package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.BasePage;

public class Header extends BasePage {
    private static final String LANGUAGE_BUTTON_XPATH = "//span[@class='menu_lang']";

    @FindBy(xpath = LANGUAGE_BUTTON_XPATH)
    private WebElement languageButton;

    public void switchToRussian() {
        waitForElementAndClick(languageButton);
    }


}
