package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {

	@FindBy (xpath="//div[text()='My Account']")
	public WebElement myaccout;
	
	@FindBy (xpath ="//li[10]/a/div[text()='Logou']")
	public WebElement logout;
}