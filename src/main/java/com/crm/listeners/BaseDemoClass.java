package com.crm.listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseDemoClass {
	
	WebDriver driver ;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("connect to the database");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("pre-condition for Test Runner");	
	}
	
	@BeforeClass
	public void beforeClass() 
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		
		driver.findElement(By.id("Email")).sendKeys("googlemail@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Sneha@123");
		
		driver.findElement(By.id("RememberMe")).click();
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}
	
	@AfterTest
	public void afterTest() 
	{
		System.out.println("post-condition for Test Runner");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("disconnect from database");
		
		
	}
	
	
	

}

