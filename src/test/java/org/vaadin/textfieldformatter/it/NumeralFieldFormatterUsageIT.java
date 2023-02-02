package org.vaadin.textfieldformatter.it;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUI;

public class NumeralFieldFormatterUsageIT extends AbstractSeleniumJupiterTestCase {

	@Test
	public void numeralFieldWithDefaultValues() throws InterruptedException {
		openUI(NumeralFieldFormatterUI.class, NumeralFieldFormatterUI.DefaultValues.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("12345.80");
		assertEquals("12,345.80", tf.getAttribute("value"));
	}

	@Test
	public void numeralFieldWithCustomValues() throws InterruptedException {
		openUI(NumeralFieldFormatterUI.class, NumeralFieldFormatterUI.CustomValue.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("-12345,801");
		assertEquals("-€12 345,801", tf.getAttribute("value"));
	}

	@Test
	public void numeralFieldWithThousandsGroupStyle() throws InterruptedException {
		openUI(NumeralFieldFormatterUI.class, NumeralFieldFormatterUI.ThousandsGroupThousand.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("1234567.89");
		assertEquals("1,234,567.89", tf.getAttribute("value"));

		openUI(NumeralFieldFormatterUI.class, NumeralFieldFormatterUI.ThousandsGroupWan.class);
		tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("1234567.89");
		assertEquals("123,4567.89", tf.getAttribute("value"));

		openUI(NumeralFieldFormatterUI.class, NumeralFieldFormatterUI.ThousandsGroupLakh.class);
		tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("1234567.89");
		assertEquals("12,34,567.89", tf.getAttribute("value"));

		openUI(NumeralFieldFormatterUI.class, NumeralFieldFormatterUI.ThousandsGroupNone.class);
		tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("1234567.89");
		assertEquals("1234567.89", tf.getAttribute("value"));
	}

	@Test
	public void numeralFieldWithIntegerScale() throws InterruptedException {
		openUI(NumeralFieldFormatterUI.class, NumeralFieldFormatterUI.IntegerScale.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("-123456.789");
		assertEquals("-12,345.78", tf.getAttribute("value"));
	}

	@Test
	public void numeralFieldWithDecimalScale() throws InterruptedException {
		openUI(NumeralFieldFormatterUI.class, NumeralFieldFormatterUI.DecimalScale.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("-12345,6789012");
		assertEquals("-12.345,678901", tf.getAttribute("value"));
	}

	@Test
	public void numeralFieldWithDecimalMark() throws InterruptedException {
		openUI(NumeralFieldFormatterUI.class, NumeralFieldFormatterUI.DecimalMark.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("1,2");
		assertEquals("1,2", tf.getAttribute("value"));
	}

	@Test
	public void numeralFieldWithPositiveOnly() throws InterruptedException {
		openUI(NumeralFieldFormatterUI.class, NumeralFieldFormatterUI.PositiveOnly.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("-12.34");
		assertEquals("12.34", tf.getAttribute("value"));
	}

	@Test
	public void numeralFieldWithSignBeforePrefix() throws InterruptedException {
		openUI(NumeralFieldFormatterUI.class, NumeralFieldFormatterUI.SignBeforePrefix.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("-123.45");
		assertEquals("-€123.45", tf.getAttribute("value"));
	}

	@Test
	public void numeralFieldWithPostfix() throws InterruptedException {
		openUI(NumeralFieldFormatterUI.class, NumeralFieldFormatterUI.Postfix.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("-123.45");
		assertEquals("-123.45€", tf.getAttribute("value"));
	}

	@Test
	public void numeralFieldWithStripLeadingZeroes() throws InterruptedException {
		openUI(NumeralFieldFormatterUI.class, NumeralFieldFormatterUI.DontStripLeadingZeroes.class);
		WebElement tf = getDriver().findElement(By.tagName("vaadin-text-field"));
		tf.sendKeys("001.23");
		assertEquals("001.23", tf.getAttribute("value"));
	}
}