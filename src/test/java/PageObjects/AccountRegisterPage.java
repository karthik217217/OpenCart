package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegisterPage extends BasePage {

	public AccountRegisterPage(WebDriver driver) {
		super(driver);
	}
	// Elements
	
	@FindBy(name="firstname")
	WebElement txtfirstname;
	
	@FindBy(name="lastname")
	WebElement txtlatname;
	
	@FindBy(name="email")
	WebElement txtemail;
	
	@FindBy(name="telephone")
	WebElement txtTelephone;
	
    @FindBy(name="password")
    WebElement txtpassword;

   @FindBy(name="confirm")
   WebElement txtconfirmpassword;
   
   @FindBy(name="agree")
   WebElement chekdpolicy;
   
   @FindBy(xpath="//input[@value='Continue']")
   WebElement btncontinue;
@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgconfirmation;
   
// Action Methoad
   public void setFiirstName(String fname) {
	   txtfirstname.sendKeys(fname);  
   }
   public void setLastName(String lname) {
	   txtlatname.sendKeys(lname); 
   }
   public void setEmail(String email) {
	   txtemail.sendKeys(email);
   }
   public void setTelphone(String telephone) {
	   txtTelephone.sendKeys(telephone);
   }
   public void setPassword(String pwd) {
	   txtpassword.sendKeys(pwd);
   }
   public void setConfirmPassword(String confirmpwd) {
	   txtconfirmpassword.sendKeys(confirmpwd);
   }
   public void setpolicy() {
	   chekdpolicy.click();
   }
   public void clickContinue() {
	   btncontinue.click();
   }
   
  public String getConfirmationMsg() {
	   try {
		   return (msgconfirmation.getText());
	   }
	   catch (Exception e) {
		   return(e.getMessage());
   }
   
}
   
}
