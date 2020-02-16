package Interactions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.PropertyFile;
import PageObject.LoginPage;
import PageObject.LogoutPage;
import PageObject.SearchBox;
import Utility.ExcelUtils;

public class SearchElements {
	
	WebDriver driver;
	PropertyFile prop;
	Actions a;
	List<String> s;
	WebDriverWait wait;
	File src;
	File DestFile;

	public SearchElements() {
		prop = new PropertyFile();
		System.setProperty(prop.getDriver(),prop.getDriverPath());
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,30);
		a = new Actions(driver);
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
	
	public void search() throws Throwable
	{
		SearchBox box = PageFactory.initElements(driver,SearchBox.class);
		s = ExcelUtils.getData(prop.getExcelPath(),prop.getSheet());
		for(String s1 : s)
		{
			box.searchbox.sendKeys(s1);
			box.searchbox.sendKeys(Keys.ENTER);
			String result = wait.until(ExpectedConditions.visibilityOf(box.results)).getText();
			screenshot(prop.getpath());
			System.out.println(result.substring(18,24));
			box.searchbox.clear();
		}
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public void screenshot(String fileWithPath) throws Exception
	{
		TakesScreenshot shot = (TakesScreenshot)driver;
		 src = shot.getScreenshotAs(OutputType.FILE);
		 DestFile=new File(fileWithPath); 
		 FileUtils.copyFile(src, DestFile);
	}
}
