package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccounPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass 
{	
	@Test(groups = {"Sanity","Master"})
	public void test_Login() {
		
		logger.info("***** Starting TC_002_LoginTest*****");
	try {	
		//Homepage-->myaccont--> login
	HomePage hp = new HomePage(driver);
	hp.clickMyAccount();
	hp.clickLogin();
	
	//loginpage-->email&password,click
	LoginPage lp =new LoginPage(driver);
	lp.setEmail(rb.getString("email"));
	lp.setPassword(rb.getString("password"));
	lp.clickLogin();
	
	//check MyAccountpage lable is present
	
	MyAccounPage acc=new MyAccounPage(driver);
boolean trgetpage =	acc.isMyAccountPageExists();
Assert.assertEquals(trgetpage, true);
	}
catch(Exception e) {
		Assert.fail();
	}
	logger.info("*****Fished TC_002_LoginTest ******");
}

}