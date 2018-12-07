package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.BasePage;

import java.util.List;

public class ElectronicsSearchPage extends BasePage {
    private static final String SEARCH_INPUT_FIELD_XPATH = "//input[@id='ptxt']";
    private static final String SEARCH_SUGGESTION_XPATH = "//div[@id='preload_txt']";
    private static final String SEARCH_SUGGESTIONS_OPTIONS_XPATH = "//div[contains(@id,'cmp')]";
    private static final String SEARCH_BUTTON_XPATH = "//input[@id='sbtn']";
    private static final String MIN_PRICE_INPUT_FIELD_XPATH = "//input[@name='topt[8][min]']";
    private static final String MAX_PRICE_INPUT_FIELD_XPATH = "//input[@name='topt[8][max]']";

    @FindBy(xpath = SEARCH_INPUT_FIELD_XPATH)
    private WebElement searchInputField;

    @FindBy(xpath = SEARCH_SUGGESTION_XPATH)
    private WebElement searchSuggestion;

    @FindBy(xpath = SEARCH_SUGGESTIONS_OPTIONS_XPATH)
    private List<WebElement> searchSuggestionsOptions;

    @FindBy(xpath = SEARCH_BUTTON_XPATH)
    private WebElement searchButton;

    @FindBy(xpath = MIN_PRICE_INPUT_FIELD_XPATH)
    private WebElement minPriceInputField;

    @FindBy(xpath = MAX_PRICE_INPUT_FIELD_XPATH)
    private WebElement maxPriceInputField;

    public void enterSearchWord(String searchWord) {
        waitForInputFieldAndType(searchInputField, searchWord);
        waitForElement(searchSuggestion);
        selectElementFromOptionsByText(searchSuggestionsOptions, searchWord);
    }

    public void submitSearch() {
        waitForElementAndClick(searchButton);
    }

    public void setMinAndMaxPrice(String min, String max) {
        waitForInputFieldAndType(minPriceInputField, min);
        waitForInputFieldAndType(maxPriceInputField, max);
    }
}
