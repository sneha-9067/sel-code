package advanceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ShopperBaseClass {
	
	WebDriver driver ;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("connect to the database");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("pre-condition for test runner");		
	}
	
	@BeforeClass
	public void beforeClass()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.navigate().to("https://www.shoppersstack.com/");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("snehaac05@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sneha@123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();		
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='S']")).click();
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("pre-condition for test runner");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("disconnect to the database");
	}

}
