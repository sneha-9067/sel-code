package advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Demo_Task2Class extends BaseDemoClass{
	
	@Test
	
	public void test()
	{
		driver.findElement(By.id("small-searchterms")).sendKeys("Perfumes",Keys.ENTER);
	}

}
