package listeners;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.crm.listeners.GenerateExtentReport.class)
public class TC_2_DWS {
	
	WebDriver driver ;
	@Test
	
	public void dws()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("googlemail@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sneha@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	@Test
	
	public void redbus()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		
	}
	@Test(dependsOnMethods = "dws")
	
	public void logoutDws()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}

}
