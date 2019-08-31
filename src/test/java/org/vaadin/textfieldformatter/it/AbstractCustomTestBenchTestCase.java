package org.vaadin.textfieldformatter.it;

import org.eclipse.jetty.server.Server;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.vaadin.addonhelpers.AbstractTest;
import org.vaadin.addonhelpers.TServer;
import org.vaadin.textfieldformatter.UITestConfiguration;

import com.github.webdriverextensions.WebDriverExtensionsContext;
import com.github.webdriverextensions.internal.junitrunner.DriverPathLoader;
import com.vaadin.testbench.TestBenchTestCase;

public abstract class AbstractCustomTestBenchTestCase extends TestBenchTestCase {
	protected static final int TESTPORT = 5678;
	protected static final String BASEURL = "http://localhost:" + TESTPORT + "/";
	protected static Server server;

	public AbstractCustomTestBenchTestCase() {
		super();
	}

	@BeforeClass
	public static void startServer() {
		DriverPathLoader.loadDriverPaths(null);
		try {
			server = new TServer().startServer(TESTPORT);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void stopServer() {
		if (server != null) {
			try {
				server.stop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
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
		WebDriverExtensionsContext.setDriver(driver);
	}

	protected <T extends AbstractTest> void openUI(Class<T> testClass) {
		driver.navigate().to(BASEURL + testClass.getName());
	}

	protected <T extends org.vaadin.textfieldformatter.AbstractTest, U extends UITestConfiguration> void openUI(
			Class<T> testClass, Class<U> uiTestConfiguration) {
		driver.navigate().to(BASEURL + testClass.getName() + "/" + uiTestConfiguration.getSimpleName());
	}

	@After
	public void teardown() {
		driver.quit();
	}
}
