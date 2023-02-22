package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	
public HomePage(WebDriver driver) {
		super(driver);
		 
	}
//Find Elements
@FindBy(xpath="//span[normalize-space()='My Account']") 
WebElement lnkMyAccount;
@FindBy(linkText="Register") 
WebElement lnkRegister;
@FindBy(linkText="Login")
WebElement lnkLogin;

//Action methoad

public void clickMyAccount() {
lnkMyAccount.click();
}
public void clickRegister() {
	lnkRegister.click();
}
public void clickLogin() {
	lnkLogin.click();
}
}
