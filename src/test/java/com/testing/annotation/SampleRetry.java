package com.testing.annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleRetry {
	
	@Test
	private void userNameValidation() {
		Assert.assertEquals("A", "a");

	}
	

}
