package com.stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ObjectFactoryAnnotation;

public class FirstClass {
	
	@Test
	private void tc1() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
//		boolean contains = title.contains("Amazon");
		
		//AssertTrue()
//		Assert.assertTrue(contains);
		
		
		System.out.println(title);
		
		Assert.assertEquals(title, "] – log in or sign up");
		
		driver.close();
		
	}
	
	
	
}