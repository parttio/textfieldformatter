package org.vaadin.textfieldformatter.it;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.vaadin.textfieldformatter.BasicCreditCardFieldFormatterUsageUI;

public class CreditCardFieldFormatterIT extends AbstractSeleniumJupiterTestCase {

	@Test
	public void validVisaNumber() throws InterruptedException {
		WebElement root = openUI(BasicCreditCardFieldFormatterUsageUI.class);

		TextFieldElement tf = new TextFieldElement(root);
		tf.sendKeys("4");
		WebElement notification = new WebDriverWait(getDriver(), Duration.ofSeconds(3))
				.until(driver -> driver.findElement(By.tagName("vaadin-notification-card")));
		assertEquals("VISA", notification.getText());
		tf.sendKeys("000000000000000");
		wait("4000 0000 0000 0000", tf);
	}
}
