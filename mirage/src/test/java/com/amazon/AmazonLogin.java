package com.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class AmazonLogin {
	
	WebDriver driver,driver1;
	WebDriverWait wait;
	Actions action;
	boolean b;
	@BeforeTest
	public void intializeDriver()
	{
		System.setProperty("webdriver.gecko.driver","K:\\EclipseProjects\\Workplace\\POM\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		action = new Actions(driver);
		 wait=new WebDriverWait(driver, 20);
	}
	@Test
	public void login() throws Exception
	{
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")).click();
		List<WebElement> l=driver.findElements(By.xpath("//ul[@class='a-nostyle a-list-link']/li"));
		System.out.println(l.size());
		for(WebElement s:l)
		{
			System.out.println(s.getText());
		}
		for(int i=1;i<5;i++)
		{
		driver.findElement(By.xpath("//li[@aria-label='Apple']/span/a/div/label/i[@class='a-icon a-icon-checkbox']")).click();
	 b= driver.findElement(By.xpath("//li[@aria-label='Apple']/span/a/div/label/input")).isSelected();
	 System.out.println(b);
		}	 
	}
}