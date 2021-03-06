package Interactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.PropertyFile;
import PageObject.LoginPage;
import PageObject.LogoutPage;

public class LogoutPageaction {

	WebDriver driver;
	PropertyFile prop;
	Actions a;
	WebDriverWait wait;
	
	public LogoutPageaction()
	{
		prop = new PropertyFile();
		System.setProperty(prop.getDriver(),prop.getDriverPath());
		driver = new FirefoxDriver();
		 a = new Actions(driver);
		 wait = new WebDriverWait(driver,30);
	}
	
	public void Login()
	{
		LoginPage l = PageFactory.initElements(driver,LoginPage.class);
		driver.get(prop.getUrl());
		l.username.sendKeys(prop.getUser());
		l.password.sendKeys(prop.getPass());
		l.login.click(); 
	}
	
	public void logout() throws Throwable
	{
		LogoutPage lo = PageFactory.initElements(driver,LogoutPage.class);
		Thread.sleep(2000);
		a.moveToElement(lo.myaccout).build().perform();
		wait.until(ExpectedConditions.visibilityOf(lo.logout)).click();
	}
}
