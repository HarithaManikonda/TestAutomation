package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class switchPOPUp {
	@Test
	public void Switch_PopUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value='Go!']")).click();
	    
		String alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		System.out.println(alertMessage);
		driver.quit();

	}
	
	

}
