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
	
	@Test
	public void searchText() throws Throwable
	{
		se.Login();
	//	se.logout();
		se.search();
	}
}
