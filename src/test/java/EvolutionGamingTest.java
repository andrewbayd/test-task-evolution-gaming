import org.assertj.core.api.Assertions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import util.Navigator;

import java.util.List;

import static util.Constants.TestData.*;

public class EvolutionGamingTest {
    private Navigator navigator = new Navigator();
    private Header header = new Header();
    private HomePage homePage = new HomePage();
    private ElectronicsSearchPage electronicsSearchPage = new ElectronicsSearchPage();
    private ElectronicsSearchResultsPage electronicsSearchResultsPage = new ElectronicsSearchResultsPage();
    private FavoritesPage favoritesPage = new FavoritesPage();

    @BeforeClass
    public void setUp() {
        navigator.openApp();
    }

    @Test
    public void searchTest() {
        header.switchToRussian();
        homePage.openElectronicsPage();
        header.openElectronicsSearchPage();
        electronicsSearchPage.enterSearchWord(SEARCH_WORD);
        electronicsSearchPage.setMinAndMaxPrice(MIN_PRICE, MAX_PRICE);
        electronicsSearchPage.submitSearch();
        electronicsSearchResultsPage.sortResultsByPrice();
        electronicsSearchResultsPage.selectDealType(DEAL_TYPE_SELL);
        List<String> selectedAdsIds = electronicsSearchResultsPage.selectRandomAdvertisements(ADS_TO_BE_SELECTED_COUNT);
        electronicsSearchResultsPage.addToFavorites();
        electronicsSearchResultsPage.clickOkInAlert();
        header.openFavoritesPage();
        List<String> favoritesAdsIds = favoritesPage.getFavoritesAdsIds();
        Assertions.assertThat(selectedAdsIds).isEqualTo(favoritesAdsIds);
    }

    @AfterClass
    public void closeUp() {
        navigator.closeBrowser();
    }

}
