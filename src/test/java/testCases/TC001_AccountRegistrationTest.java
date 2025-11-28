package testCases;
import java.time.Duration;
import org.apache.commons.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{
	@Test
	public void verify_account_registration() {
		try {
		logger.info("---Starting TC001_AccountRegistrationTest---");
		HomePage hp = new HomePage(driver);
		hp.clickMyaccount();
		hp.clickRegister();
		logger.info("Clicked on registration link");
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString() + "@gmail.com");
		regpage.setTelephone(randomNum());
		String pwd = randomAlphaNumeric();
		regpage.setPassword(pwd);
		regpage.setconfirmPassword(pwd);
		regpage.setPrivacyPolicy();
		regpage.clicKContinue();
		String confirmationmsg = regpage.getConfirmationmsg();
	}catch(Exception e) {
       logger.error("Test failed");
       logger.debug("Debug logs...");
       Assert.fail();
	}
		logger.info("---Finished TC001_AccountRegistrationTest---");
	}
	
}


