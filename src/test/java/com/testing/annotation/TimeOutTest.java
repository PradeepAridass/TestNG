package com.testing.annotation;

import org.testng.annotations.Test;

public class TimeOutTest {
	
	@Test(timeOut = 3000)
	private void searchWatch() throws InterruptedException {
		System.out.println("searchwatch");
		Thread.sleep(2000);
	}
	
	@Test(timeOut = 500)
	private void searchTv() throws InterruptedException {
		System.out.println("searchtv");
		Thread.sleep(2000);
	}
}
