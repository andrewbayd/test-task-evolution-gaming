package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.BasePage;

import java.util.List;

public class FavoritesPage extends BasePage {
    private static final String ALL_CHECKBOXES_ON_PAGE_XPATH = "//input[@type='checkbox']";

    @FindBy(xpath = ALL_CHECKBOXES_ON_PAGE_XPATH)
    private List<WebElement> allCheckboxesOnPage;

    public List<String> getFavoritesAdsIds() {
        return getElementsIdsSorted(allCheckboxesOnPage);
    }
}
