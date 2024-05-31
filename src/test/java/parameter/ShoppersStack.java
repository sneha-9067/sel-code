package parameter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ShoppersStack {
	
	@Parameters({"url","username","password"})
	
	@Test
		public void shoppersLogin(String url, String username, String password)
	{
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		
		 WebElement login_button = driver.findElement(By.id("loginBtn"));
		 
		 if (login_button.isEnabled()) {
			 
			 driver.findElement(By.id("loginBtn")).click();
			 driver.findElement(By.id("Email")).sendKeys(username);
			 driver.findElement(By.id("Password")).sendKeys(password);
			 driver.findElement(By.xpath("//span[text()='Login']")).click();		
		}
		 else {
			 
			 JavascriptExecutor jse = (JavascriptExecutor) driver ;
			 
			 jse.executeScript("arguments[0].click();", login_button);	
			}
	}

}
