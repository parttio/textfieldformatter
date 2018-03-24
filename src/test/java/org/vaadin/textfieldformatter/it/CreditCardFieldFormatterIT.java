package org.vaadin.textfieldformatter.it;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.vaadin.textfieldformatter.BasicCreditCardFieldFormatterUsageUI;

import com.vaadin.testbench.By;
import com.vaadin.testbench.elements.NotificationElement;
import com.vaadin.testbench.elements.TextFieldElement;

/**
 * A simple example that uses Selenium to do a browser level test for a
 * BasicJavaSCriptComponentUsageUI. For more complex tests, consider using page
 * object pattern.
 */
public class CreditCardFieldFormatterIT extends AbstractCustomTestBenchTestCase {

	@Before
	public void init() {
		startBrowser();
	}

	@Test
	public void validVisaNumber() throws InterruptedException {
		openUI(BasicCreditCardFieldFormatterUsageUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("4");
		WebElement element = waitUntil(
				ExpectedConditions.visibilityOf(findElement(By.vaadin("//com.vaadin.ui.Notification"))));
		NotificationElement notification = testBenchElement(element).wrap(NotificationElement.class);
		Assert.assertEquals("VISA", notification.getCaption());
		tf.sendKeys("000000000000000");
		Assert.assertEquals("4000 0000 0000 0000", tf.getValue());
		Assert.assertEquals(tf.getAttribute("autocomplete"), "cc-number");
	}
}
