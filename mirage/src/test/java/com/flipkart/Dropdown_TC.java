package com.flipkart;

import org.testng.annotations.*;

import Interactions.DropdownAction;

public class Dropdown_TC {
	
	DropdownAction a;
	
	@BeforeTest
	public void init()
	{
		a = new DropdownAction();
	}
	
	@Test
	public void run() 
	{
		a.Login();
	}
	@Test
	public void verify() throws Throwable
	{
		a.verifyDropdown();
	}

}