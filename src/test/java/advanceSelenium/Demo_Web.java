package advanceSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Web {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		
		driver.findElement(By.id("Email")).sendKeys("googlemail@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Sneha@123");
		
		driver.findElement(By.id("RememberMe")).click();
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
//		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
//		
//		List<WebElement> products = driver.findElements(By.xpath("//input[@value='Add to cart']"));
//		
//		for (WebElement web : products) {	
//			web.click();
//			Thread.sleep(1000);
//		}
//		
//		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
//		
//		
//		Thread.sleep(1000);
//		driver.close();
		
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		
		List<WebElement> details = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
		
		driver.findElement(By.xpath("//input[@class='sender-name']")).clear();
		driver.findElement(By.xpath("//input[@class='sender-email']")).clear();
		
		Thread.sleep(2000);
		List<String> value = new ArrayList<>();
		
		value.add("Khemu");
		
		value.add("khemu@gmail.com");
		
		value.add("Sneha");
		
		value.add("sneha@gmail.com");
		Thread.sleep(2000);
		int i = 0;
		
		for (WebElement web : details) {
			
			web.sendKeys(value.get(i++));
			Thread.sleep(2000);
		}
		
		driver.findElement(By.className("message")).sendKeys(" Khemu !!! ");
		
		driver.findElement(By.xpath("//input[@value='1']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).sendKeys("5");
		
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
		Thread.sleep(2000);
		
		
	}

}
