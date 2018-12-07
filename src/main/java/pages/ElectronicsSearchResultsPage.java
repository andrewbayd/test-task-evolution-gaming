package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.BasePage;

import java.util.List;

public class ElectronicsSearchResultsPage extends BasePage {
    private static final String SORT_BY_PRICE_BUTTON_XPATH = "//td[@class='msg_column_td']/noindex";
    private static final String DEAL_TYPE_DROPDOWN_XPATH = "//select[@name='sid']";
    private static final String DEAL_TYPE_DROPDOWN_OPTIONS_XPATH = "//select[@name='sid']/option";
    private static final String ADVANCED_SEARCH_XPATH = "//a[contains(text(),'Расширенный поиск')]";
    private static final String ALL_CHECKBOXES_ON_PAGE_XPATH = "//input[@type='checkbox']";
    private static final String ADD_TO_FAVORITES_BUTTON_XPATH = "//a[@id='a_fav_sel']";
    private static final String ALERT_OK_BUTTON_XPATH = "//a[@id='alert_ok']";

    @FindBy(xpath = SORT_BY_PRICE_BUTTON_XPATH)
    private WebElement sortByPriceButton;

    @FindBy(xpath = DEAL_TYPE_DROPDOWN_XPATH)
    private WebElement dealTypeDropdown;

    @FindBy(xpath = DEAL_TYPE_DROPDOWN_OPTIONS_XPATH)
    private List<WebElement> dealTypeDropdownOptions;

    @FindBy(xpath = ADVANCED_SEARCH_XPATH)
    private WebElement advancedSearchButton;

    @FindBy(xpath = ALL_CHECKBOXES_ON_PAGE_XPATH)
    private List<WebElement> allCheckboxesOnPage;

    @FindBy(xpath = ADD_TO_FAVORITES_BUTTON_XPATH)
    private WebElement addToFavoritesButton;

    @FindBy(xpath = ALERT_OK_BUTTON_XPATH)
    private WebElement alertOkButton;

    public void sortResultsByPrice() {
        waitForElementAndClick(sortByPriceButton);
    }

    public void selectDealType(String type) {
        waitForElementAndClick(dealTypeDropdown);
        selectElementFromOptionsByText(dealTypeDropdownOptions, type);
    }

    public List<String> selectRandomAdvertisements(int count) {
        return clickRandomElementsAndGetIds(allCheckboxesOnPage, count);
    }

    public void addToFavorites() {
        waitForElementAndClick(addToFavoritesButton);
    }

    public void clickOkInAlert() {
        waitForElementAndClick(alertOkButton);
    }

}
