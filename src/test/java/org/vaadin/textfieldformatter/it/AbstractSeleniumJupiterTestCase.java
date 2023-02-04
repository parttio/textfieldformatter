package org.vaadin.textfieldformatter.it;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.vaadin.textfieldformatter.AbstractTest;
import org.vaadin.textfieldformatter.UITestConfiguration;

import io.github.bonigarcia.seljup.SeleniumJupiter;
import io.github.bonigarcia.seljup.SingleSession;
import io.github.bonigarcia.wdm.WebDriverManager;

@ExtendWith(SeleniumJupiter.class)
@SingleSession
public abstract class AbstractSeleniumJupiterTestCase {
	protected static final int TESTPORT = 8080;
	protected static final String BASEURL = "http://localhost:" + TESTPORT + "/";

	private WebDriver driver;

	public AbstractSeleniumJupiterTestCase() {
		super();
	}

	@BeforeAll
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
	}

	protected WebDriver getDriver() {
		return driver;
	}

	@BeforeEach
	protected void startBrowser() {
		ChromeOptions opt = new ChromeOptions();
		String headless = System.getProperty("test.headless");
		if (headless != null && Boolean.valueOf(headless)) {
			opt.setHeadless(true);
		}
		driver = new ChromeDriver(opt);
	}

	@AfterEach
	protected void quitBrowser() {
		driver.quit();
	}

	protected <T extends org.vaadin.textfieldformatter.AbstractTest, U extends UITestConfiguration> WebElement openUI(
			Class<T> testClass, Class<? extends UITestConfiguration> configuration) {
		driver.navigate().to(BASEURL + testClass.getSimpleName().toLowerCase() + "/" + configuration.getSimpleName());
		WebElement root = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(driver -> driver.findElement(By.className("test-root")));
		return root;
	}

	protected <T extends AbstractTest> WebElement openUI(Class<T> testClass) {
		driver.get(BASEURL + testClass.getSimpleName().toLowerCase());
		WebElement root = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(driver -> driver.findElement(By.className("test-root")));
		return root;
	}
	
	protected <T> T wait(T value, Waiter<T> waiter) {
		return waiter.condition(new WebDriverWait(this.driver, Duration.ofSeconds(3)), value);
	}
}
