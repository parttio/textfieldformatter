package org.vaadin.textfieldformatter.it;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.vaadin.textfieldformatter.DateFieldFormatterUI;

public class DateFieldFormatterIT extends AbstractSeleniumJupiterTestCase {

	@Test
	public void monthYear() {
		openUI(DateFieldFormatterUI.class, DateFieldFormatterUI.MonthYear.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("112011");
		assertEquals("11/2011", tf.getAttribute("value"));
	}

	@Test
	public void americanDate() {
		openUI(DateFieldFormatterUI.class, DateFieldFormatterUI.AmericanDate.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("a2.4.2020");
		assertEquals("02/04/2020", tf.getAttribute("value"));
	}

	@Test
	public void finnishDate() {
		openUI(DateFieldFormatterUI.class, DateFieldFormatterUI.FinnishDate.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("a4/2/2020");
		assertEquals("04.02.2020", tf.getAttribute("value"));
	}

	@Test
	public void withMinMax() {
		openUI(DateFieldFormatterUI.class, DateFieldFormatterUI.MinMax.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("03022019");
		assertEquals("04/02/2019", tf.getAttribute("value"));
		tf.sendKeys("05022019");
		assertEquals("04/02/2019", tf.getAttribute("value"));
		tf.sendKeys("04022019");
		assertEquals("04/02/2019", tf.getAttribute("value"));
	}

	@Test
	public void withMin() {
		openUI(DateFieldFormatterUI.class, DateFieldFormatterUI.Min.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("03022019");
		assertEquals("04/02/2019", tf.getAttribute("value"));
		tf.sendKeys("04022019");
		assertEquals("04/02/2019", tf.getAttribute("value"));
	}

	@Test
	public void withMax() {
		openUI(DateFieldFormatterUI.class, DateFieldFormatterUI.Max.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("04022019");
		assertEquals("03/02/2019", tf.getAttribute("value"));
		tf.sendKeys("03022019");
		assertEquals("03/02/2019", tf.getAttribute("value"));
	}
}
