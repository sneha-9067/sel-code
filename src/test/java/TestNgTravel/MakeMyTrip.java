package TestNgTravel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MakeMyTrip {
	@Parameters({"url"})
	@Test
	
	public void makeMyTrip(String url) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Thread.sleep(2000);
		driver.navigate().to(url);
		
		driver.close();
	}

}