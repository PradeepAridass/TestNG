package com.testing.annotation;

import org.testng.annotations.Test;

public class ExceptionTestExample {

	@Test(expectedExceptions = Exception.class)
	private void test() {
		int i = 10/0;
	}

}
