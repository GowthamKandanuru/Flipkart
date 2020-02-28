package com.flipkart;

import org.testng.annotations.*;

import Interactions.SearchElements;

public class SearchElements_TC {

	SearchElements se;
	
	@BeforeTest
	public void init()
	{
		se = new SearchElements();
	}
	
	@Test(priority=1)
	public void login()
	{
		se.Login();
		
	}
	@Test(priority=2)
	public void searchText() throws Throwable
	{
		se.search();
	}
	
	@AfterTest
	public void close()
	{
		se.closeBrowser();
	}
}
