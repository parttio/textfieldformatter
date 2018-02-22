package org.vaadin.textfieldformatter.it;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.vaadin.textfieldformatter.CSBFDelimitersUI;
import org.vaadin.textfieldformatter.CSBFNumericAndPrefixUI;
import org.vaadin.textfieldformatter.CSBFNumericAndPrefixWithBlocksUI;
import org.vaadin.textfieldformatter.CSBFNumericOnlyUI;
import org.vaadin.textfieldformatter.CSBFReplacingMaskUI;

import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.TextFieldElement;

public class CustomStringBlockFormatterIT extends AbstractCustomTestBenchTestCase {

	@Before
	public void init() {
		startBrowser(createHeadlessChromeDriver());
	}

	@Test
	public void customBlockWithDelimiters() throws InterruptedException {

		openUI(CSBFDelimitersUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("12233k");
		Assert.assertEquals("1-22-33k", tf.getValue());
	}

	@Test
	public void customBlockWithDelimitersNumericOnly() throws InterruptedException {

		openUI(CSBFNumericOnlyUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("12233k");
		Assert.assertEquals("1-22-33", tf.getValue());
	}

	@Test
	public void customBlockWithReplacingMask() throws InterruptedException {
		openUI(CSBFReplacingMaskUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("12233abcd");
		Assert.assertEquals("1-22-33A", tf.getValue());
		$(ButtonElement.class).first().click();
		tf.sendKeys("12233abcd");
		Assert.assertEquals("1-*22", tf.getValue());
	}

	@Test
	public void customBlocksWithNumericAndPrefixBlocks() throws InterruptedException {
		openUI(CSBFNumericAndPrefixWithBlocksUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		Assert.assertEquals("PREFIX: ", tf.getValue());
		tf.sendKeys("1234bbbbb");
		Assert.assertEquals("PREFIX: 1-23-4", tf.getValue());
	}

	@Test
	public void customBlocksWithNumericAndPrefix() throws InterruptedException {
		openUI(CSBFNumericAndPrefixUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		Assert.assertEquals("PREFIX:", tf.getValue());
		tf.sendKeys("1234bbbbb");
		Assert.assertEquals("PREFIX:1234", tf.getValue());
	}
}
