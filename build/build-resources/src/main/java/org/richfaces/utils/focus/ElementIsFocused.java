package org.richfaces.utils.focus;

import java.util.function.Function;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementIsFocused implements Function<WebDriver, Boolean> {

    private WebElement activeElement;
    private final WebElement element;

    /**
     * Provide element to wait to gain focus or null if you want to fail for no element having focus
     */
    public ElementIsFocused(WebElement element) {
        this.element = element;
    }

    @Override
    public Boolean apply(WebDriver browser) {
        try {
            activeElement = FocusRetriever.retrieveActiveElement();
            if (element == null && activeElement == null) {
                return true;
            }
            if (element == null || activeElement == null) {
            	return false;
            }
            String elementId = element.getAttribute("id");
            String activeId = activeElement.getAttribute("id");
            if (elementId == null) {
            	elementId = "x";
            }
            return element.equals(activeElement) || elementId.equals(activeId); 
        } catch (StaleElementReferenceException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        String focused = (activeElement == null) ? null : ((activeElement.getAttribute("id") != null) ? activeElement.getAttribute("id") : activeElement.toString());
        return String.format("waiting for the focus on '%s' failed - last focused element: %s", element, focused);
    }
}
