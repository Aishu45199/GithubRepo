package com.pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginPage 
{
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Login in setup...");
	}
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Closing setup...");
	}
}
