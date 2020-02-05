package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;

	@FindBy(xpath ="//div[@class='_39M2dM JB4AMj']/input[@type='text']")
	public WebElement username;
	
	@FindBy(xpath= "//div[@class='_39M2dM JB4AMj']/input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	public WebElement login;
	
	/*public LoginPage(WebDriver driver)
	{
		this.driver= driver;
	}*/
}
