package advanceSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchExecution {
	
	@Test
   public void rcb()
   {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
	   driver.get("https://www.royalchallengers.com/");   
   }
	@Test
	
	public void csk()
	{
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   
		   driver.get("https://www.chennaisuperkings.com/"); 
	}
	@Test
	
	public void mi()
	{
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   
		   driver.get("https://www.mumbaiindians.com/");
	}
	
}
