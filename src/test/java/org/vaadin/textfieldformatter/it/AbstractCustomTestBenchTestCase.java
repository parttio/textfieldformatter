package org.vaadin.textfieldformatter.it;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.vaadin.textfieldformatter.AbstractTest;

import com.vaadin.testbench.TestBenchTestCase;

public abstract class AbstractCustomTestBenchTestCase extends TestBenchTestCase {
	protected static final int TESTPORT = 8080;
	protected static final String BASEURL = "http://localhost:" + TESTPORT + "/";

	public AbstractCustomTestBenchTestCase() {
		super();
	}

	protected void startBrowser() {
		startBrowser(null);
	}

	protected void startBrowser(WebDriver driver) {
		if (this.driver != null) {
			this.driver.quit();
		}
		ChromeOptions opt = new ChromeOptions();
		String headless = System.getProperty("test.headless");
		if (headless != null && Boolean.valueOf(headless)) {
			opt.setHeadless(true);
		}
		driver = new ChromeDriver(opt);
		setDriver(driver);
	}

	protected <T extends AbstractTest> void openUI(Class<T> testClass) {
		driver.navigate().to(BASEURL + testClass.getSimpleName());
	}

	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
