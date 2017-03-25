package org.vaadin.textfieldformatter.it;

import org.eclipse.jetty.server.Server;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.vaadin.addonhelpers.AbstractTest;
import org.vaadin.addonhelpers.TServer;

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void stopServer() {
		if (server != null) {
			try {
				server.stop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	protected void startBrowser(WebDriver driver) {
		if (this.driver != null) {
			this.driver.quit();
		}
		setDriver(driver);
		WebDriverExtensionsContext.setDriver(driver);
	}

	protected <T extends AbstractTest> void openUI(Class<T> testClass) {
		driver.navigate().to(BASEURL + testClass.getName());
	}
}
