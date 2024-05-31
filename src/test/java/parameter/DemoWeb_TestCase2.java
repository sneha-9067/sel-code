package parameter;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DemoWeb_TestCase2 extends DemoWeb_BaseClass{
	
	@Test
	
	public void addGift()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}

}
