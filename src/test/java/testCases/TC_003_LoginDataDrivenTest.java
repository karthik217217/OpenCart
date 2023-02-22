package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccounPage;
import testBase.BaseClass;
import utilities.DataProviders;
	public class TC_003_LoginDataDrivenTest extends BaseClass 
{	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups={"DataDriven"}) //if data provider in the same class this is not required (,dataProviderClass=DataProviders.class)
	public void test_LoginDDT(String email,String pwd,String exp) {
		
		logger.info("***** Starting TC_003_LoginDataDrivenTest*****");
	try {	
		//Homepage-->myaccont--> login
	HomePage hp = new HomePage(driver);
	hp.clickMyAccount();
	hp.clickLogin();
	
	//loginpage-->email&password,click
	LoginPage lp =new LoginPage(driver);
	lp.setEmail(email);
	lp.setPassword(pwd);
	lp.clickLogin();
	
	//check MyAccountpage lable is present
	
	MyAccounPage acc=new MyAccounPage(driver);
boolean trgetpage =	acc.isMyAccountPageExists();

   if(exp.equals("valid")) 
   {
	if(trgetpage==true) 
	{
		acc.clicklogout();
		Assert.assertTrue(true);
	}
	else {
		Assert.fail();
	}
   }
   
   if(exp.equals("Invalid"))
   {
	   acc.clicklogout();
	   if(trgetpage==true) {
		   Assert.fail();
	   }
	   else {
		   Assert.assertTrue(true);
	   }
   }
	}
catch(Exception e) {
		Assert.fail();
	}
	logger.info("*****Fished TC_003_LoginDataDrivenTest ******");
}


}
