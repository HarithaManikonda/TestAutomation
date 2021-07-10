package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseKeyboardEvents {
	@Test
	public void Mouse_Keyboards_Events()
	{
		
		System.setProperty("webdriver.chrome.driver","/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		WebElement txt_usename=driver.findElement(By.id("email"));
		WebElement txt_pass=driver.findElement(By.id("pass"));
		Actions builder=new Actions(driver);
		Action seriesofActions=builder.moveToElement(txt_usename).click()
								.keyDown(txt_usename,Keys.SHIFT)
								.sendKeys(txt_usename, "hello")
								.keyUp(txt_usename,Keys.SHIFT)
								.keyDown(txt_pass,Keys.SHIFT)
								.sendKeys(txt_pass, "password")
								.keyUp(txt_pass,Keys.SHIFT)
								
								//.doubleClick(txt_usename)
								.contextClick()
								
								//.dragAndDropBy(txt_usename, 2000, 100).moveByOffset(300, 0)
								.build();
								
		seriesofActions.perform();
	}

}
