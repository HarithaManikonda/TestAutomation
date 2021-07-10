package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LaunchChrome {
	@Test
	public void test()
		
	{
		System.setProperty("webdriver.chrome.driver", "/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		
	}

}
