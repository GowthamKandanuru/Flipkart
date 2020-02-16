package com.flipkart;

import org.testng.annotations.*;

import Interactions.LogoutPageaction;

public class FlipkartLogout {

	LogoutPageaction logout;

	
	@BeforeTest
	
	public void initclass()
	{
		logout = new LogoutPageaction();
	}
	
	@Test
	public void login() throws Throwable
	{
		logout.Login();
	}
	@Test
	public void logout() throws Throwable
	{
		logout.logout();
	}
}
