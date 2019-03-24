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
	public void vaadinSalesGermany() throws InterruptedException {

		openUI(BasicPhoneFieldFormatterUsageUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("+4915112700362");
		Assert.assertEquals("+49 1511 2700362", tf.getValue());
	}
}
