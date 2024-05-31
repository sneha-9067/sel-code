package parameter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoWeb_TestCase1 extends DemoWeb_BaseClass {
	@Test
	
	public void task()
	{
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		 List<WebElement> option = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li"));	
		 
		 for (WebElement web : option) {
			
			 web.click();
			 
			 driver.navigate().back();
		}
	}
		

}
