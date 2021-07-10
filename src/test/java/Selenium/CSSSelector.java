package Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSSSelector {
	@Test
	public void CSS_Selector()
	{
		System.setProperty("webdriver.chrome.driver","/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		
		
		WebElement element=driver.findElement(By.cssSelector("input[name='email']"));//tag and attribute css selector
		String s1=element.getAttribute("placeholder");
		System.out.println("Attribute value is..."+s1);
		
		//input[class='inputtext _55r1 _6luy']  
		WebElement element1=driver.findElement(By.cssSelector("input[class^='inputtext'][id='email']"));//prefix
		System.out.println("Prefix..."+ element1.getText());
		
		WebElement element2=driver.findElement(By.cssSelector("button[name=login]"));
		System.out.println("Button text is..."+ element2.getText());
		
		
		
		
	}

}
