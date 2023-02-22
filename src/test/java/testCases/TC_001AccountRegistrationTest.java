package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountRegisterPage;
import testBase.BaseClass;

public class TC_001AccountRegistrationTest extends BaseClass{
	@Test(groups= {"Regression","Master"})
	public void test_account_Registration() throws InterruptedException
	{
		logger.debug("application logs......");
		logger.info("***  Starting TC_001_AccountRegistrationTest ***");
		try
		{
		PageObjects.HomePage hp=new PageObjects.HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My account link");
		
		hp.clickRegister();
		logger.info("Clicked on register link");
		
		AccountRegisterPage regpage=new AccountRegisterPage(driver);
			
		logger.info("Providing customer data");
		
		regpage.setFiirstName(randomeString().toUpperCase());
		
		regpage.setLastName(randomeString().toUpperCase());
		
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		
		regpage.setTelphone(randomeNumber());
		
		String password=randomAlphaNumeric();
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setpolicy();
		
		regpage.clickContinue();
		logger.info("Clicked on continue");
		
		String confmsg=regpage.getConfirmationMsg();
		
		logger.info("Validating expected message");
		if(confmsg.equals("Your Account Has Been Created!")) {
			 	Assert.assertTrue(true);
		}
		else {
			logger.warn("Customer rgst not sucessful ");
			logger.error("test faild");
			Assert.assertTrue(false);
		}
		}catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("***  Finished TC_001_AccountRegistrationTest ***");		
		}
	
	
}
