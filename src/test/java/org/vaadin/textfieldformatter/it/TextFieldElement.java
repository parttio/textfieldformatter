package org.vaadin.textfieldformatter.it;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextFieldElement implements Waiter<String> {

	private final SearchContext searchContext;
	private final WebElement element;
	private final String tagName = "vaadin-text-field";

	public TextFieldElement(SearchContext searchContext) {
		this.searchContext = searchContext;
		this.element = this.searchContext.findElement(By.tagName(tagName));
	}
	
	public void sendKeys(String keys) {
		this.element.sendKeys(keys);
	}
	
	public void clear() {
		this.element.clear();
	}
	
	@Override
	public String condition(WebDriverWait wait, String value) {
		wait.withMessage("Waiting for " + tagName + " value " + value).until(ExpectedConditions.attributeToBe(this.element, "value", value));
		return this.element.getAttribute("value");
	}
}
