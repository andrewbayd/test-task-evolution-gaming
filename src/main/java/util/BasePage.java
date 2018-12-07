package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static util.DriverWrapper.driver;
import static util.Waiter.MEDIUM_DELAY;

public class BasePage extends PageFactory {

    public BasePage() {
        initElements(driver, this);
    }

    private Waiter waiter = new Waiter();
    private Random random = new Random();

    protected void waitForElementAndClick(WebElement element) {
        waiter.waitForElementIsVisible(element, MEDIUM_DELAY);
        element.click();
    }

    protected void waitForElement(WebElement element) {
        waiter.waitForElementIsVisible(element, MEDIUM_DELAY);
    }

    protected void waitForInputFieldAndType(WebElement element, String input) {
        waiter.waitForElementIsVisible(element, MEDIUM_DELAY);
        element.sendKeys(input);
    }

    protected void selectElementFromOptionsByText(List<WebElement> elements, String text) {
        for (WebElement element: elements) {
            if (element.getText().equals(text)) {
                element.click();
                break;
            }
        }
    }

    protected List<String> clickRandomElementsAndGetIds(List<WebElement> elements, int count) {
        List<String> selectedElementsIds = new ArrayList<>();
        for (int i = 0; i < count; i++) {
                int index = random.nextInt(elements.size());
                WebElement selectedElement = elements.get(index);
                selectedElement.click();
                selectedElementsIds.add(selectedElement.getAttribute("id"));
        }
        Collections.sort(selectedElementsIds);

        return selectedElementsIds;
    }

    protected List<String> getElementsIdsSorted(List<WebElement> elements) {
        return elements.stream().map(e -> e.getAttribute("id")).sorted().collect(Collectors.toList());
    }
}
