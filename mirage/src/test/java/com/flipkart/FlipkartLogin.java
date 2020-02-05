package com.flipkart;

import org.testng.annotations.*;
import Interactions.LoginPageaction;

public class FlipkartLogin {
	LoginPageaction lp;
	@BeforeTest
	public void initclass()
	{
		 lp = new LoginPageaction();
	}
	@Test
	public void login() throws InterruptedException
	{
		/*driver.get(prop.getUrl());*/
		lp.Login();
		/*List<WebElement> list = driver.findElements(By.xpath("//ul[@class='_114Zhd']/li"));
		for(WebElement l:list)
		{
			Thread.sleep(2000);
			if(l.getText().equals("Grocery")||l.getText().equals("Offer Zone"))
			{
				System.out.println("no items");
			}
			else
			{
			System.out.println("categories in flipkart--->"+""+l.getText());
			Thread.sleep(2000);
			//String s = l.getText();
			action.moveToElement(l).build().perform();
			List<WebElement> t = driver.findElements(By.xpath("//ul[@class='QPOmNK']/li"));
			Thread.sleep(3000);
			for(WebElement a:t)
			{
				if(a.getText()!=null)
				{
					System.out.println("listed items under"+"---->"+""+a.getText());
				}
				else
				{
					System.out.println("gowtham");
				}
			}
			}
		}*/
		
	}
}
