package org.vaadin.textfieldformatter.it;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.vaadin.textfieldformatter.CSBFWithReplacingMaskUI;
import org.vaadin.textfieldformatter.CustomStringBlockFormatterUsageDelimitersUI;
import org.vaadin.textfieldformatter.CustomStringBlockFormatterWithNumericOnlyUsageUI;

import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.TextFieldElement;

public class CustomStringBlockFormatterUsageIT extends AbstractCustomTestBenchTestCase {

	@Before
	public void init() {
		startBrowser(new PhantomJSDriver());
	}

	@Test
	public void customBlockWithDelimiters() throws InterruptedException {

		openUI(CustomStringBlockFormatterUsageDelimitersUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("12233k");
		Assert.assertEquals("1-22-33k", tf.getValue());
	}

	@Test
	public void customBlockWithDelimitersNumericOnly() throws InterruptedException {

		openUI(CustomStringBlockFormatterWithNumericOnlyUsageUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("12233k");
		Assert.assertEquals("1-22-33", tf.getValue());
	}

	@Test
	public void customBlockWithReplacingMask() throws InterruptedException {

		openUI(CSBFWithReplacingMaskUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("12233abcd");
		Assert.assertEquals("1-22-33A", tf.getValue());
		$(ButtonElement.class).first().click();
		tf.sendKeys("12233abcd");
		Assert.assertEquals("1-*22", tf.getValue());
	}
}
