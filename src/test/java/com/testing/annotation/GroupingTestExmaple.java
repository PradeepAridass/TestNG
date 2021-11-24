package com.testing.annotation;

import org.testng.annotations.Test;

public class GroupingTestExmaple {

	@Test(groups = "Electronics")
	private void searchTv() {
		System.out.println("Search Tv");
	}
	
	@Test(groups = "Mens Accessories")
	private void searchWatch() {
		System.out.println("Search Watch");
	}
	
	@Test(groups = "Electronics")
	private void searchMobile() {
		System.out.println("Search Mobile");
	}
	
	@Test(groups = "Electronics")
	private void searchlaptop() {
		System.out.println("Search Laptop");
	}
	
	@Test(groups = "Mens Accessories")
	private void searchShoe() {
		System.out.println("Search Shoe");
	}
}
