package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccounPage extends BasePage {

	public MyAccounPage(WebDriver driver) {
		super(driver);
	}
	//Elements
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement msgHeading;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement lnklogout;
	
	public boolean isMyAccountPageExists() {
		try {
			return(msgHeading.isDisplayed());
		}
		catch(Exception e) {
			return (false); 
		}
	}
		public void clicklogout() {
			lnklogout.click();
		}
		
	
}
