package org.vaadin.textfieldformatter.it;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.vaadin.textfieldformatter.CustomNumeralFieldFormatterUsageUI;
import org.vaadin.textfieldformatter.DefaultNumeralFieldFormatterUsageUI;

import com.vaadin.testbench.elements.TextFieldElement;

public class NumeralFieldFormatterUsageIT extends AbstractCustomTestBenchTestCase {

	@Before
	public void init() {
		startBrowser(new PhantomJSDriver());
	}

	@Test
	public void numeralFieldWithDefaultValues() throws InterruptedException {
		openUI(DefaultNumeralFieldFormatterUsageUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("12345.80");
		Assert.assertEquals("12,345.80", tf.getValue());
	}

	@Test
	public void numeralFieldWithCustomValues() throws InterruptedException {
		openUI(CustomNumeralFieldFormatterUsageUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("-12345,801");
		Assert.assertEquals("12.345,801", tf.getValue());
	}
}