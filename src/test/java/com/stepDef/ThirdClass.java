package com.stepDef;

import org.testng.annotations.Test;

public class ThirdClass {
	
	@Test(groups = "Smoke")
	private void tc100() {
		System.out.println("Test case 100");
	}
	@Test(groups = "Sanity")
	private void tc200() {
		System.out.println("Test case 200");
	}
	@Test(groups = "Regression")
	private void tc300() {
		System.out.println("Test case 300");
	}
	
	
}
