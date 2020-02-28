package org.vaadin.textfieldformatter.it;

import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.vaadin.textfieldformatter.AbstractTest;
import org.vaadin.textfieldformatter.UITestConfiguration;

import com.vaadin.testbench.ScreenshotOnFailureRule;
import com.vaadin.testbench.TestBenchTestCase;

public abstract class AbstractCustomTestBenchTestCase extends TestBenchTestCase {
	protected static final int TESTPORT = 8080;
	protected static final String BASEURL = "http://localhost:" + TESTPORT + "/";

	@Rule
	public ScreenshotOnFailureRule screenshotOnFailure = new ScreenshotOnFailureRule(this, true);

	public AbstractCustomTestBenchTestCase() {
		super();
	}

	protected void startBrowser() {
		startBrowser(null);
	}

	protected void startBrowser(WebDriver driver) {

		ChromeOptions opt = new ChromeOptions();
		String headless = System.getProperty("test.headless");
		if (headless != null && Boolean.valueOf(headless)) {
			opt.setHeadless(true);
		}
		driver = new ChromeDriver(opt);
		setDriver(driver);
	}

	protected <T extends org.vaadin.textfieldformatter.AbstractTest, U extends UITestConfiguration> void openUI(
			Class<T> testClass, Class<? extends UITestConfiguration> configuration) {
		driver.navigate().to(
				BASEURL + testClass.getSimpleName().toLowerCase() + "/" + configuration.getSimpleName());
	}

	protected <T extends AbstractTest> void openUI(Class<T> testClass) {
		driver.get(BASEURL + testClass.getSimpleName().toLowerCase());
	}
}
