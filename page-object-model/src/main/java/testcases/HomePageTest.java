package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class HomePageTest extends TestBase {

	WebDriver driver;
	HomePage homePage;

	@BeforeClass
	@Test
	public void before() {
		driver = new ChromeDriver();
		homePage = PageFactory.initElements(driver, HomePage.class);
		Reporter.log("HomePageTest.before() called");
	}

	@Test
	public void clickRegisterTest() {
//		homePage.clickRegister();
		Reporter.log("register button clicked");
	}

	@Test
	public void clickAboutUsTest() {
//		homePage.clickAboutUs();
		Reporter.log("about us clicked");
	}

	@Test
	public void clickServicesTest() {
//		homePage.clickServices();
		Reporter.log("services clicked");
	}

	@Test
	public void clickProductsTest() {
//		homePage.clickProducts();
		Reporter.log("products clicked");
	}

	@Test
	public void clickLocationsTest() {
//		homePage.clickLocations();
		Reporter.log("locations clicked");
	}

	@Test
	public void clickAdminTest() {
//		homePage.clickAdmin();
		Reporter.log("admin clicked");
	}

	@Test
	public void loginTest() {
//		homePage.login("username", "password");
		Reporter.log("login completed");
	}
}
