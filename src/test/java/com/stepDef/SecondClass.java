package com.stepDef;

import org.testng.annotations.Test;

public class SecondClass {
	
	@Test(groups = "Smoke")
	private void tc10() {
		System.out.println("Test case 10");
	}
	@Test(groups = "Sanity")
	private void tc20() {
		System.out.println("Test case 20");
	}
	@Test(groups = "Regression")
	private void tc30() {
		System.out.println("Test case 30");
	}
	
	
}
