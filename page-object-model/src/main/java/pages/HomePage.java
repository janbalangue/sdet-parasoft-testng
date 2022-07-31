package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement registerElement;

	@FindBy(css = "a[href='about.htm']")
	WebElement aboutUsElement;

	@FindBy(css = "a[href='services.htm']")
	WebElement servicesElement;

	@FindBy(css = "a[href='https://www.parasoft.com/products/']")
	WebElement productsElement;

	@FindBy(css = "a[href='https://www.parasoft.com/solutions/']")
	WebElement locationsElement;

	@FindBy(css = "a[href='admin.htm']")
	WebElement adminElement;

	@FindBy(css = "input[name='username']")
	WebElement usernameElement;

	@FindBy(css = "input[name='password']")
	WebElement passwordElement;

	@FindBy(css = "input[value='Log In']")
	WebElement loginElement;

	public synchronized void clickRegister() {
		registerElement.click();
	}

	public synchronized void clickAboutUs() {
		aboutUsElement.click();
	}

	public synchronized void clickServices() {
		servicesElement.click();
	}

	public synchronized void clickProducts() {
		productsElement.click();
	}

	public synchronized void clickLocations() {
		locationsElement.click();
	}

	public synchronized void clickAdmin() {
		adminElement.click();
	}

	public synchronized void login(String username, String password) {
		usernameElement.sendKeys(username);
		passwordElement.sendKeys(password);
		loginElement.click();
	}

}
