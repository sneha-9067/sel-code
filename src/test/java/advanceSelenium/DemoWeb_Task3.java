package advanceSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DemoWeb_Task3 extends BaseDemoClass{
	
	@Test
	
	public void test() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		
		List<WebElement> details = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
		
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
		
		driver.findElement(By.className("message")).sendKeys("!!! ");
		
		driver.findElement(By.xpath("//input[@value='1']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).sendKeys("5");
		
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
		Thread.sleep(4000);
	}

}
