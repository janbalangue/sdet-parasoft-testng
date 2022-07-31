package base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {

	private static WebDriver driver;

	@BeforeSuite
	@Test
	public void setup() {
		File chromeFile = new File(System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver");
		System.setProperty("webdriver.chrome.driver", chromeFile.getAbsolutePath());
		driver = new ChromeDriver();
		Reporter.log("driver created");
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Reporter.log("parabank.parasoft.com loaded");
		driver.manage().window().maximize();
	}

	@AfterSuite
	@Test
	public void teardown() {
		driver.quit();
		Reporter.log("driver quit");
	}
}
