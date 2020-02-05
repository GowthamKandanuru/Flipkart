package Interactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import Config.PropertyFile;
import PageObject.LoginPage;

public class LoginPageaction {
	WebDriver driver;
	PropertyFile prop;
	public LoginPageaction()
	{
		prop = new PropertyFile();
		System.setProperty(prop.getDriver(),prop.getDriverPath());
		driver = new FirefoxDriver();
	}
	
	public void Login()
	{
		LoginPage l = PageFactory.initElements(driver,LoginPage.class);
		driver.get(prop.getUrl());
		l.username.sendKeys("8332056542");
		l.password.sendKeys("chennai");
		l.login.click(); 
	}
	
}
