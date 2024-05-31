package advanceSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShoppersStack_Test_Case2 extends ShopperBaseClass{
	
	@Test
	
	public void editProfile() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[text()='S']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		WebElement edit = driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(edit).click();
		Thread.sleep(2000);
		List<WebElement> input = driver.findElements(By.xpath("//form[@class='editprofilebox MuiBox-root css-0']/div[2]/div/div/div/input"));
		
		System.out.println(input);
		List<String> data = new ArrayList<>();
		Thread.sleep(2000);
		data.add("Angel");
		data.add("Priya");
		data.add("17/05/2000");
		data.add("9067255527");
		
		int i = 0 ;
		for (WebElement web : input) {
			
			web.clear();
			web.sendKeys(data.get(i++));
		}
		
		
		
	}

}
