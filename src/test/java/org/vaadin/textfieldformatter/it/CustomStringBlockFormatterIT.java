package org.vaadin.textfieldformatter.it;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.vaadin.textfieldformatter.BasicCreditCardFieldFormatterUsageUI;
import org.vaadin.textfieldformatter.BasicIBANFormatterUsageUI;
import org.vaadin.textfieldformatter.CSBFDelimitersUI;
import org.vaadin.textfieldformatter.CSBFNumericAndPrefixUI;
import org.vaadin.textfieldformatter.CSBFNumericAndPrefixWithBlocksUI;
import org.vaadin.textfieldformatter.CSBFNumericAndPrefixWithBuilderUI;
import org.vaadin.textfieldformatter.CSBFNumericOnlyUI;
import org.vaadin.textfieldformatter.CSBFReplacingMaskUI;

public class CustomStringBlockFormatterIT extends AbstractSeleniumJupiterTestCase {

	@Test
	public void basicIban() throws InterruptedException {
		WebElement root = openUI(BasicIBANFormatterUsageUI.class, BasicIBANFormatterUsageUI.BasicIBAN.class);
		TextFieldElement tf = new TextFieldElement(root);
		tf.sendKeys("FI42500015100000231");
		wait("FI42 5000 1510 0000 23", tf);
	}

	@Test
	public void replaceIbanFormatter() throws InterruptedException {
		WebElement root = openUI(BasicIBANFormatterUsageUI.class, BasicIBANFormatterUsageUI.ReplaceIBAN.class);
		TextFieldElement tf = new TextFieldElement(root);
		tf.sendKeys("FI425000151000002319999");
		wait("FI42 5000 1510 0000 2319 99", tf);
	}

	@Test
	public void customBlockWithDelimiters() throws InterruptedException {
		WebElement root = openUI(CSBFDelimitersUI.class);
		TextFieldElement tf = new TextFieldElement(root);
		tf.sendKeys("12233k");
		wait("1-22-33k", tf);
	}

	@Test
	public void customBlockWithDelimitersNumericOnly() throws InterruptedException {
		WebElement root = openUI(CSBFNumericOnlyUI.class);
		TextFieldElement tf = new TextFieldElement(root);
		tf.sendKeys("12233k");
		wait("1-22*33", tf);
	}

	@Test
	public void customBlockWithReplacingMask() throws InterruptedException {
		WebElement root = openUI(CSBFReplacingMaskUI.class);
		TextFieldElement tf = new TextFieldElement(root);
		tf.sendKeys("12233abcd");
		wait("1-22-33A", tf);
		WebElement btn = getDriver().findElement(By.tagName("vaadin-button"));
		btn.click();
		wait("1-*22", tf);
		tf.clear();
		tf.sendKeys("12233abcd");
		wait("12*23", tf);
	}

	@Test
	public void customBlocksWithNumericAndPrefixBlocks() throws InterruptedException {
		WebElement root = openUI(CSBFNumericAndPrefixWithBlocksUI.class);
		TextFieldElement tf = new TextFieldElement(root);
		wait("PREFIX: ", tf);
		tf.sendKeys("1234bbbbb");
		wait("PREFIX: 1-23-4", tf);
	}

	@Test
	public void customBlocksWithNumericAndPrefixWithBuilder() throws InterruptedException {
		WebElement root = openUI(CSBFNumericAndPrefixWithBuilderUI.class);
		TextFieldElement tf = new TextFieldElement(root);
		wait("PREFIX: ", tf);
		tf.sendKeys("1234bbbbb");
		wait("PREFIX: 1-23-4", tf);
	}

	@Test
	public void customBlocksWithNumericAndPrefix() throws InterruptedException {
		WebElement root = openUI(CSBFNumericAndPrefixUI.class);
		TextFieldElement tf = new TextFieldElement(root);
		wait("PREFIX:", tf);
		tf.sendKeys("1234bbbbb");
		wait("PREFIX:1234", tf);
	}

	@Test
	public void customBlocksWithLazyDelimiter() throws InterruptedException {
		WebElement root = openUI(CSBFDelimitersUI.class, CSBFDelimitersUI.LazyDelimiter.class);
		TextFieldElement tf = new TextFieldElement(root);
		tf.sendKeys("1");
		wait("1", tf);
		tf.sendKeys("2");
		wait("1-2", tf);
	}
}
