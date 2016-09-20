package com.companyname.bank;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeTest
	public void tearUp(){
		
	System.out.println("This is before Test");
	}
	
	@Test
	public void newtest(){
		System.out.println("This is test");
	}
	
	@AfterTest
	public void teardown(){
		System.out.println("This is after test");
		
	}
}
