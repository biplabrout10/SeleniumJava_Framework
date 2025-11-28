package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@title='My Account']")
	WebElement MyAccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement Register;

	@FindBy(linkText = "Login")
	WebElement linkLogin;

	public void clickMyaccount() {
		MyAccount.click();
	}

	public void clickRegister() {
		Register.click();
	}
	
	public void clickLogin() {
		linkLogin.click();
	}

}
