package org.vaadin.textfieldformatter.it;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.vaadin.textfieldformatter.BasicPhoneFieldFormatterUsageUI;

import com.vaadin.flow.component.textfield.testbench.TextFieldElement;

/**
 * A simple example that uses Selenium to do a browser level test for a
 * BasicJavaSCriptComponentUsageUI. For more complex tests, consider using page
 * object pattern.
 */
public class BasicPhoneFieldFormatterIT extends AbstractCustomTestBenchTestCase {

	@Before
	public void init() {
		startBrowser();
	}

	@Test
	public void germanyPhoneNumber() throws InterruptedException {

		openUI(BasicPhoneFieldFormatterUsageUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("+49152901820");
		Assert.assertEquals("+49 1529 01820", tf.getValue());
	}
}
