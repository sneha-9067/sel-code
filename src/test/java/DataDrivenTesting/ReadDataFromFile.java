package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromFile {

	@Test
	
	public void readData() throws  IOException
	{
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("./com.AdvanceSelenium/ConfigFile/DWS.properties");
		
		prop.load(fis);
		
		String url = prop.getProperty("url");
		
		String username = prop.getProperty("username");
		
		String pass = prop.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to(url);
		
		driver.findElement(By.className("ico-login")).click();
		
		driver.findElement(By.id("Email")).sendKeys(username);
		
		driver.findElement(By.id("Password")).sendKeys(pass);
		
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
			
		
	}
	
	
}
