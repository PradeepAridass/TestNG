package com.testing.annotation;

import org.testng.annotations.Test;

public class InvocationTestExample {
	
	@Test
	private void searchTv() {
		System.out.println("Search Tv");
	}
	
	@Test
	private void searchWatch() {
		System.out.println("Search Watch");
	}
	
	@Test(invocationCount = 5)
	private void searchMobile() {
		System.out.println("Search Mobile");
	}
	
	@Test
	private void searchlaptop() {
		System.out.println("Search Laptop");
	}
	
	@Test
	private void searchShoe() {
		System.out.println("Searc Shoe");
	}
}
