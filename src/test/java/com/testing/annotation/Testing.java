package com.testing.annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {

	@BeforeSuite
	private void setUp() {
		System.out.println("SetUp");
	}
	
	@BeforeTest
	private void browserLaunch() {
		System.out.println("BrowserLaunch");
	}
	
	@BeforeClass
	private void url() {
		System.out.println("Url");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}
	
	@Test
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}
	
	@Test
	private void searchMobile() {
		System.out.println("Search Watch");
	}
	
	@Test
	private void searchBag() {
		System.out.println("Search Bag");
	}
	
	@AfterMethod
	private void verifyPage() {
		System.out.println("Verify HomePage");
	}
	
	@AfterClass
	private void logout() {
		System.out.println("Logout");
	}
	
	@AfterTest
	private void browserClose() {
		System.out.println("Browser Close");
	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete Cookies");
	}
}
