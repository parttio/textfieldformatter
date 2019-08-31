package org.vaadin.textfieldformatter.it;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.vaadin.textfieldformatter.NumeralFieldFormatterUsageUI;

import com.vaadin.testbench.elements.TextFieldElement;

public class NumeralFieldFormatterIT extends AbstractCustomTestBenchTestCase {

	@Before
	public void init() {
		startBrowser();
	}

	@Test
	public void numeralFieldWithDefaultValues() throws InterruptedException {
		openUI(NumeralFieldFormatterUsageUI.class, NumeralFieldFormatterUsageUI.DefaultValues.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("12345.80");
		Assert.assertEquals("12,345.80", tf.getValue());
	}

	@Test
	public void numeralFieldWithCustomValues() throws InterruptedException {
		openUI(NumeralFieldFormatterUsageUI.class, NumeralFieldFormatterUsageUI.CustomValue.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("-12345,801");
		Assert.assertEquals("-€12 345,801", tf.getValue());
	}

	@Test
	public void numeralFieldWithThousandsGroupStyle() throws InterruptedException {
		openUI(NumeralFieldFormatterUsageUI.class, NumeralFieldFormatterUsageUI.ThousandsGroupThousand.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("1234567.89");
		Assert.assertEquals("1,234,567.89", tf.getValue());

		openUI(NumeralFieldFormatterUsageUI.class, NumeralFieldFormatterUsageUI.ThousandsGroupWan.class);
		tf = $(TextFieldElement.class).first();
		tf.sendKeys("1234567.89");
		Assert.assertEquals("123,4567.89", tf.getValue());

		openUI(NumeralFieldFormatterUsageUI.class, NumeralFieldFormatterUsageUI.ThousandsGroupLakh.class);
		tf = $(TextFieldElement.class).first();
		tf.sendKeys("1234567.89");
		Assert.assertEquals("12,34,567.89", tf.getValue());

		openUI(NumeralFieldFormatterUsageUI.class, NumeralFieldFormatterUsageUI.ThousandsGroupNone.class);
		tf = $(TextFieldElement.class).first();
		tf.sendKeys("1234567.89");
		Assert.assertEquals("1234567.89", tf.getValue());
	}

	@Test
	public void numeralFieldWithIntegerScale() throws InterruptedException {
		openUI(NumeralFieldFormatterUsageUI.class, NumeralFieldFormatterUsageUI.IntegerScale.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("-123456.789");
		Assert.assertEquals("-12,345.78", tf.getValue());
	}

	@Test
	public void numeralFieldWithDecimalScale() throws InterruptedException {
		openUI(NumeralFieldFormatterUsageUI.class, NumeralFieldFormatterUsageUI.DecimalScale.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("-12345.67890");
		Assert.assertEquals("-12,345.6789", tf.getValue());
	}

	@Test
	public void numeralFieldWithDecimalMark() throws InterruptedException {
		openUI(NumeralFieldFormatterUsageUI.class, NumeralFieldFormatterUsageUI.DecimalMark.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("1,2");
		Assert.assertEquals("1,2", tf.getValue());
	}

	@Test
	public void numeralFieldWithPositiveOnly() throws InterruptedException {
		openUI(NumeralFieldFormatterUsageUI.class, NumeralFieldFormatterUsageUI.PositiveOnly.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("-12.34");
		Assert.assertEquals("12.34", tf.getValue());
	}

	@Test
	public void numeralFieldWithSignBeforePrefix() throws InterruptedException {
		openUI(NumeralFieldFormatterUsageUI.class, NumeralFieldFormatterUsageUI.SignBeforePrefix.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("-123.45");
		Assert.assertEquals("€-123.45", tf.getValue());
	}

	@Test
	public void numeralFieldWithStripLeadingZeroes() throws InterruptedException {
		openUI(NumeralFieldFormatterUsageUI.class, NumeralFieldFormatterUsageUI.StripLeadingZeroes.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("001.23");
		Assert.assertEquals("001.23", tf.getValue());
	}
}