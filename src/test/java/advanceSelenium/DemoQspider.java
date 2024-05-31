package advanceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQspider {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
		
		driver.findElement(By.name("requiredfield")).sendKeys("Sneha");
		
		driver.findElement(By.name("minLength")).sendKeys("helloo");
		
		driver.findElement(By.name("maxLength")).sendKeys("Hello");
		
		driver.findElement(By.name("rangeLength")).sendKeys("Sneha");
		
		driver.findElement(By.name("minValue")).sendKeys("6");
		
		driver.findElement(By.name("maxValue")).sendKeys("1");
		
		driver.findElement(By.name("rangeValue")).sendKeys("100");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Albatross@5");
		
		driver.findElement(By.name("confirmpass")).sendKeys("Albatross@5");
		
		driver.findElement(By.name("email")).sendKeys("absd@gmail..ccoomm");
		
		driver.findElement(By.name("url")).sendKeys("https://www.facebook.com/");
		
		driver.findElement(By.name("digits")).sendKeys("9876543210");
		
		driver.findElement(By.name("number")).sendKeys("0123012301230");
		
		driver.findElement(By.name("alphanum")).sendKeys("abcde12345");
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

}
