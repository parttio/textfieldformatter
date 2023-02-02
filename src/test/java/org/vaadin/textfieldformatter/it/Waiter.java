package org.vaadin.textfieldformatter.it;

import org.openqa.selenium.support.ui.WebDriverWait;

@FunctionalInterface
public interface Waiter<T> {

	T condition(WebDriverWait wait, T value);
}
