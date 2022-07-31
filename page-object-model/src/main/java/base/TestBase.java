package base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {

	private static WebDriver driver;
	private static final String KEY = "browser";

	@BeforeSuite
	@Test
	public synchronized void setup(ITestContext context) {
		String browser = context.getCurrentXmlTest().getParameter(KEY);
		if (browser.equals("chrome")) {
			File chromeFile = new File(System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver");
			System.setProperty("webdriver.chrome.driver", chromeFile.getAbsolutePath());
			driver = new ChromeDriver();
			Reporter.log("chrome driver created");
		} else if (browser.equals("firefox")) {
			File chromeFile = new File(System.getProperty("user.dir") + "/src/main/java/drivers/geckodriver");
			System.setProperty("webdriver.gecko.driver", chromeFile.getAbsolutePath());
			driver = new FirefoxDriver();
			Reporter.log("firefox driver created");
		}
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Reporter.log("parabank.parasoft.com loaded");
		driver.manage().window().maximize();
	}

	@AfterSuite
	@Test
	public synchronized void teardown() {
		driver.quit();
		Reporter.log("driver quit");
	}
}
