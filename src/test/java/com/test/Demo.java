package com.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void SetUp() {
		
		String projectLocation  = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation+"/driver/chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://www.google.co.in");	
		driver.manage().window().maximize(); // maximises window
		driver.manage().deleteAllCookies(); //delete cookies
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void TitleTest() {
		System.out.println(driver.getTitle());
		
	}
	
	@Test
	public void urlTest() {
		System.out.println(driver.getCurrentUrl());
		
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}


}
