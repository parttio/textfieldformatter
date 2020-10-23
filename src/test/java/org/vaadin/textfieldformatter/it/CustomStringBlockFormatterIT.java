package org.vaadin.textfieldformatter.it;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.vaadin.textfieldformatter.BasicIBANFormatterUsageUI;
import org.vaadin.textfieldformatter.CSBFDelimitersUI;
import org.vaadin.textfieldformatter.CSBFNumericAndPrefixUI;
import org.vaadin.textfieldformatter.CSBFNumericAndPrefixWithBlocksUI;
import org.vaadin.textfieldformatter.CSBFNumericAndPrefixWithBuilderUI;
import org.vaadin.textfieldformatter.CSBFNumericOnlyUI;
import org.vaadin.textfieldformatter.CSBFReplacingMaskUI;
import org.vaadin.textfieldformatter.SetValueUI;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;

public class CustomStringBlockFormatterIT extends AbstractCustomTestBenchTestCase {

	@Before
	public void init() {
		startBrowser();
	}

	@Test
	public void basicIban() throws InterruptedException {
		openUI(BasicIBANFormatterUsageUI.class, BasicIBANFormatterUsageUI.BasicIBAN.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("FI42500015100000231");
		Assert.assertEquals("FI42 5000 1510 0000 23", tf.getValue());
	}

	@Test
	public void replaceIbanFormatter() throws InterruptedException {
		openUI(BasicIBANFormatterUsageUI.class, BasicIBANFormatterUsageUI.ReplaceIBAN.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("FI425000151000002319999");
		Assert.assertEquals("FI42 5000 1510 0000 2319 99", tf.getValue());
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
		Assert.assertEquals("1-22*33", tf.getValue());
	}

	@Test
	public void customBlockWithReplacingMask() throws InterruptedException {
		openUI(CSBFReplacingMaskUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("12233abcd");
		Assert.assertEquals("1-22-33A", tf.getValue());
		$(ButtonElement.class).first().click();
		Assert.assertEquals("1-*22", tf.getValue());
		tf.clear();
		tf.sendKeys("12233abcd");
		Assert.assertEquals("12*23", tf.getValue());
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
	public void customBlocksWithNumericAndPrefixWithBuilder() throws InterruptedException {
		openUI(CSBFNumericAndPrefixWithBuilderUI.class);
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

	@Test
	public void customBlocksWithLazyDelimiter() throws InterruptedException {
		openUI(CSBFDelimitersUI.class, CSBFDelimitersUI.LazyDelimiter.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("1");
		Assert.assertEquals("1", tf.getValue());
		tf.sendKeys("2");
		Assert.assertEquals("1-2", tf.getValue());
	}

	@Test
	@Ignore("Hacky fix for setValue broke with Vaadin TextField 2.1.2")
	public void withSetValue() throws InterruptedException {
		openUI(SetValueUI.class);
		ButtonElement btn = $(ButtonElement.class).first();
		btn.click();
		TextFieldElement tf = $(TextFieldElement.class).first();
		Assert.assertEquals("A-BB-CCC", tf.getValue());
	}
}
