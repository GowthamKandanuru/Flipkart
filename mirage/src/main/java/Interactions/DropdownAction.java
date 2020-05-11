package Interactions;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import Config.PropertyFile;
import PageObject.*;
import Utility.ExcelUtils;

public class DropdownAction {
	
	WebDriver driver;
	PropertyFile prop;
	Actions a;
	List<String> s;
	WebDriverWait wait;
	Select select;
	JavascriptExecutor js;
	
	public DropdownAction()
	{
		prop = new PropertyFile();
		System.setProperty(prop.getDriver(),prop.getDriverPath());
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,30);
		a = new Actions(driver);
		js  = (JavascriptExecutor)driver;
	}
	
	public void Login()
	{
		LoginPage l = PageFactory.initElements(driver,LoginPage.class);
		driver.get(prop.getUrl());
		l.username.sendKeys(prop.getUser());
		l.password.sendKeys(prop.getPass());
		l.login.click();
	}
	
	public void verifyDropdown() throws Throwable
	{
		SearchBox box = PageFactory.initElements(driver,SearchBox.class);
		DropDown d = PageFactory.initElements(driver,DropDown.class);
		s = ExcelUtils.getData(prop.getExcelPath(),prop.getSheet());
		for(String s1 : s)
		{
			if(s1.equals("Puma"))
			{
			box.searchbox.sendKeys(s1);
			box.searchbox.sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.visibilityOf(d.obj)).click();
			/*js.executeScript("window.scrollBy(0,300)");
			select = new Select(d.dropdown);
			select.selectByValue("1000");*/
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView();",d.nav);
			d.nav.click();
			break;
			}
		}
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}

}
