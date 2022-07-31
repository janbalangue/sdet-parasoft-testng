package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class HomePageTest extends TestBase {

	WebDriver driver;
	HomePage homePage;
	private static final String KEY = "browser";

	@BeforeClass
	@Test
	public synchronized void before(ITestContext context) {
		String browser = context.getCurrentXmlTest().getParameter(KEY);
		if (browser.equals("chrome"))
			driver = new ChromeDriver();
		else if (browser.equals("firefox"))
			driver = new FirefoxDriver();
		homePage = PageFactory.initElements(driver, HomePage.class);
		Reporter.log("HomePageTest.before() called");
	}

	@Test
	public synchronized void clickRegisterTest() {
//		homePage.clickRegister();
		Reporter.log("register button clicked");
	}

	@Test
	public synchronized void clickAboutUsTest() {
//		homePage.clickAboutUs();
		Reporter.log("about us clicked");
	}

	@Test
	public synchronized void clickServicesTest() {
//		homePage.clickServices();
		Reporter.log("services clicked");
	}

	@Test
	public synchronized void clickProductsTest() {
//		homePage.clickProducts();
		Reporter.log("products clicked");
	}

	@Test
	public synchronized void clickLocationsTest() {
//		homePage.clickLocations();
		Reporter.log("locations clicked");
	}

	@Test
	public synchronized void clickAdminTest() {
//		homePage.clickAdmin();
		Reporter.log("admin clicked");
	}

	@Test
	public synchronized void loginTest() {
//		homePage.login("username", "password");
		Reporter.log("login completed");
	}
}
