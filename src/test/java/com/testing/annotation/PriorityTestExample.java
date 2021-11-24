package com.testing.annotation;

import org.testng.annotations.Test;

public class PriorityTestExample {

	@Test(priority = 3)		
	private void searchTv() {
		System.out.println("Search Tv");
	}
	
	@Test(priority = -2)
	private void searchWatch() {
		System.out.println("Search Watch");
	}
	
	@Test(priority = 2)
	private void searchMobile() {
		System.out.println("Search Mobile");
	}
	
	@Test(priority = -3)
	private void searchlaptop() {
		System.out.println("Search Laptop");
	}
	
	@Test(priority = 1)
	private void searchShoe() {
		System.out.println("Searc Shoe");
	}
}
