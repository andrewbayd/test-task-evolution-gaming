package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.BasePage;

public class Header extends BasePage {
    private static final String LANGUAGE_BUTTON_XPATH = "//span[@class='menu_lang']";
    private static final String SEARCH_BUTTON_XPATH = "//a[@href='/ru/electronics/search/']";
    private static final String FAVORITES_LINK_XPATH = "//a[@title='Закладки']";


    @FindBy(xpath = LANGUAGE_BUTTON_XPATH)
    private WebElement languageButton;

    @FindBy(xpath = SEARCH_BUTTON_XPATH)
    private WebElement searchButton;

    @FindBy(xpath = FAVORITES_LINK_XPATH)
    private WebElement favoritesLink;

    public void switchToRussian() {
        waitForElementAndClick(languageButton);
    }

    public void openElectronicsSearchPage() {
        waitForElementAndClick(searchButton);
    }

    public void openFavoritesPage() {
        waitForElementAndClick(favoritesLink);
    }



}
