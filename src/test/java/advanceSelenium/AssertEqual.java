package advanceSelenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqual extends BaseDemoClass{
	
	@Test
	public void hardAsset()
	{
		String expected_url = "https://demowebshop.tricentis.com/";
		
		String actual_url = driver.getCurrentUrl();
		
		String a = null;
		String b = "hello";
		//hardasset
		//assertEquals(expected_url, actual_url);
		//assertNotEquals(expected_url, actual_url);
		//assertNull(a);
		//assertNotNull(b);
		
		boolean result = expected_url.equals(actual_url);
		//assertTrue(result);
		
		boolean result2 = expected_url.equals(actual_url);
		//assertFalse(!result2);
		
		SoftAssert ass = new SoftAssert();
		
		ass.assertEquals(expected_url,actual_url);
		driver.findElement(By.id("small-searchterms")).sendKeys("Scent");
		ass.assertNull(b);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		ass.assertAll();
		
	}

}
