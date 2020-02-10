package Interactions;

import java.util.List;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import Config.PropertyFile;
import PageObject.*;
import Utility.ExcelUtils;

public class SearchElements {
	
	WebDriver driver;
	PropertyFile prop;
	Actions a;
	List<String> s;
	WebDriverWait wait;

	public SearchElements() {
		prop = new PropertyFile();
		System.setProperty(prop.getDriver(),prop.getDriverPath());
		driver = new FirefoxDriver();
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
		System.out.println(lo.logout.getText());
		lo.logout.click();
	}
	
	public void search() throws Throwable
	{
		SearchBox box = PageFactory.initElements(driver,SearchBox.class);
		s = ExcelUtils.getData(prop.getExcelPath(),prop.getSheet());
		for(String s1 : s)
		{
			//System.out.println(s1);
			box.searchbox.sendKeys(s1);
			box.searchbox.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			System.out.println(wait.until(ExpectedConditions.visibilityOf(box.results)).getText());
			box.searchbox.clear();
		}
	}
	
	/*public String result() throws Throwable
	{
		SearchBox box = PageFactory.initElements(driver,SearchBox.class);
		box.searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		return box.text.getText();
	}*/
	
	public void closeBrowser()
	{
		driver.quit();
	}
}
