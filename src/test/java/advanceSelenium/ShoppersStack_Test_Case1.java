package advanceSelenium;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ShoppersStack_Test_Case1 extends ShopperBaseClass{
	
	@Test
	
	public void addBeauty() throws InterruptedException
	{		
		
		WebElement beauty = driver.findElement(By.id("beautyProducts"));
		Actions act = new Actions(driver);
		act.moveToElement(beauty).click().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Lipstick']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='add to cart']")));
		List<WebElement> prod = driver.findElements(By.xpath("//button[text()='add to cart']"));
		for (WebElement web : prod) {
			Thread.sleep(2000);
			web.click();
		}
	}

}
