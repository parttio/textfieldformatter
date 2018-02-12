package org.vaadin.textfieldformatter.it;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.vaadin.textfieldformatter.CustomStringBlockFormatterWithNumericOnlyUsageUI;

import com.vaadin.testbench.elements.TextFieldElement;

/**
 * A simple example that uses Selenium to do a browser level test for a 
 * BasicJavaSCriptComponentUsageUI. For more complex tests, consider using
 * page object pattern.
 */
public class CustomStringBlockFormatterWithNumericOnlyUsageIT extends AbstractCustomTestBenchTestCase {


	@Before
	public void init() {
		startBrowser(new PhantomJSDriver());
	}

    @Test
	public void customBlockWithDelimiters() throws InterruptedException {

		openUI(CustomStringBlockFormatterWithNumericOnlyUsageUI.class);
		TextFieldElement tf = $(TextFieldElement.class).first();
		tf.sendKeys("12233k");
		Assert.assertEquals("1-22-33", tf.getValue());
    }
}
