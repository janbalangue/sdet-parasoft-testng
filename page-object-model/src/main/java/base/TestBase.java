package base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	private static WebDriver driver;

	@BeforeSuite
	public void setup() {
		File chromeFile = new File(System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver");
		System.setProperty("webdriver.chrome.driver", chromeFile.getAbsolutePath());
		File firefoxFile = new File(System.getProperty("user.dir") + "/src/main/java/drivers/geckodriver");
		System.setProperty("webdriver.gecko.driver", firefoxFile.getAbsolutePath());
		driver = new ChromeDriver();
		Reporter.log("driver created");
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void teardown() {
		driver.quit();
		Reporter.log("driver quit");
	}
}
