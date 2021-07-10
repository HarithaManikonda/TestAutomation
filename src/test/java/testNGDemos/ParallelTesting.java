package testNGDemos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelTesting {

	WebDriver driver;
	/*@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
		driver=new ChromeDriver();
	}*/
	@Test
	public void openGamil()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("Running Gmail Test |" + Thread.currentThread().getId());
	}
	@Test
	public void openAmazon()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://amazon.com");
		System.out.println("Running Amazon Test |" + Thread.currentThread().getId());
	}
	
	@Test
	public void openAmazon2()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://amazon.com");
		System.out.println("Running Amazon Test |" + Thread.currentThread().getId());
	}
	/*@AfterTest
	public void close()
	{
		driver.quit();
	}*/
}
