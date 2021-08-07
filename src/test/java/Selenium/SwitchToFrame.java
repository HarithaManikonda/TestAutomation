package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
public class SwitchToFrame 
{
	@Test
	public void SwitchTo_Frame()

	{
		System.setProperty("webdriver.chrome.driver", "/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/"); 
		
		// navigates to the page consisting an iframe

		driver.manage().window().maximize();
		
		// Different way to switch to frame
		/*
		   - By Index    -    driver.switchTo().frame(1);
           - By Name or Id -  driver.switchTo().frame("a077aa5e");
                              driver.switchTo().frame("a077aa5e");
           - By Web Element - driver.switchTo().frame(driver.findElement(By.name("a077aa5e")))
		 */
		
		//switching the frame by ID
		
		driver.switchTo().frame("a077aa5e");; 
		
		// click on a link in iFrame

  		driver.findElement(By.xpath("html/body/a/img")).click();
  

	}
}