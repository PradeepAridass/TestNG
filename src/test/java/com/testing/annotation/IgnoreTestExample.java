package com.testing.annotation;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTestExample {

	@Test
	private void searchTv() {
		System.out.println("Search Tv");
	}
	
	@Test(enabled = false)
	private void searchWatch() {
		System.out.println("Search Watch");
	}
	
	@Ignore
	@Test
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
