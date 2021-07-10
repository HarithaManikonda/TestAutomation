package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class GetAllLinks {
	
	@Test
	public void Get_AllLinks()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.calculator.net");
	    List<WebElement>links=driver.findElements(By.tagName("a"));
	    System.out.println("Number of links:"+links.size());
	    for(int i=0;i<links.size();i++)
	    {
	    	System.out.println("Name of the link is:"+links.get(i).getText());
	    }
	    driver.quit();
	}
}
