package testNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNG
{
	
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
		 driver=new ChromeDriver();
	}
	
	@Test
	public void gmailLogin()
	{
		
		driver.get("https://www.facebook.com");//opening facebook url in chrome
		
		WebElement element=driver.findElement(By.id("email"));//Finding the textbox by its name
		/*String s2=element.getAttribute("data-testid");
		System.out.println(s2);*/
		
		element.sendKeys("Haritha");//Entering value in email textbox
		
		driver.findElement(By.name("pass")).sendKeys("abcd");//Entering value in password textbox
		
		driver.findElement(By.name("login")).click();
		String ExpectedText= driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		String ActualText="The password you’ve entered is incorrect. Forgot Password?";
		Assert.assertEquals(ActualText, ExpectedText);
		
		/*System.out.println(s1);
		if(s1.equals("The password you’ve entered is incorrect. Forgot Password?"))
		{
			driver.findElement(By.className("_97w4")).click();
		}
		else 
		{
			System.out.println("test sucess");
		}	*/
	}
		@AfterTest
		public void closebrowser()
		
		{
			driver.close();
			System.out.println("closed the browser");
		}
		
			
	
}
