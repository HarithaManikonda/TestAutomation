package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownInteraction {

	@Test
	public void DropDown_Interaction() {
		System.setProperty("webdriver.chrome.driver","/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/interest-calculator.html");
		Select dropdown=new Select(driver.findElement(By.id("ccompound")));
		dropdown.selectByVisibleText("biweekly");
		
		
	}
}
