package advanceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {
	
	public static void main(String[] args) throws InterruptedException {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//		driver.navigate().to("https://www.shoppersstack.com/");
//		Thread.sleep(2000);
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
//		driver.findElement(By.id("loginBtn")).click();
//		driver.findElement(By.id("Email")).sendKeys("snehaac05@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("Sneha@123");
//		driver.findElement(By.xpath("//span[text()='Login']")).click();
//		
//		WebElement beauty = driver.findElement(By.id("beautyProducts"));
//		Actions act = new Actions(driver);
//		act.moveToElement(beauty).click().build().perform();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[text()='Lipstick']"));
//		
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='add to cart']")));
//		List<WebElement> prod = driver.findElements(By.xpath("//button[text()='add to cart']"));
//		for (WebElement web : prod) {
//			Thread.sleep(2000);
//			web.click();
//		}
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		
		driver.findElement(By.id("Email")).sendKeys("googlemail@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Sneha@123");
		
		driver.findElement(By.id("RememberMe")).click();
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,7500)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='column follow-us']/ul/li")));
		System.out.println("run till here");
		 List<WebElement> option = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li"));	
		 System.out.println(option);
		 Thread.sleep(2000);
		 for (WebElement web : option) {
			 
			 option = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li"));	
			 
			 
			 
		}
	}

}
