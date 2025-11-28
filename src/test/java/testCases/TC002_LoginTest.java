package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

	@Test
	public void verify_login() {
		try {
			logger.info("**** Starting TC002_LoginTest ****");
			HomePage hp = new HomePage(driver);
			hp.clickMyaccount();
			hp.clickLogin();

			LoginPage lp = new LoginPage(driver);
			lp.enterEmail(p.getProperty("email_2"));
			lp.enterPassword(p.getProperty("pwd_2"));
			lp.clickLoginBtn();

			MyAccountPage maccp = new MyAccountPage(driver);
			boolean targetpage = maccp.isMyAccountPageExists();
			Assert.assertEquals(targetpage, true);
			
		    }
		    catch (Exception e) {
			logger.error("Test failed");
			logger.debug("Debug logs...");
			Assert.fail();
		    }
		    logger.info("**** Finished TC002_LoginTest ****");
	}
}