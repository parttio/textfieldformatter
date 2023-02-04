package org.vaadin.textfieldformatter.it;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.vaadin.textfieldformatter.BasicPhoneFieldFormatterUsageUI;

/**
 * A simple example that uses Selenium to do a browser level test for a
 * BasicJavaSCriptComponentUsageUI. For more complex tests, consider using page
 * object pattern.
 */
public class BasicPhoneFieldFormatterIT extends AbstractSeleniumJupiterTestCase {

	@Test
	public void germanyPhoneNumber() throws InterruptedException {

		WebElement root = openUI(BasicPhoneFieldFormatterUsageUI.class);

		TextFieldElement tf = new TextFieldElement(root);
		tf.sendKeys("+49152901820");
		wait("+49 1529 01820", tf);
	}
	
}
