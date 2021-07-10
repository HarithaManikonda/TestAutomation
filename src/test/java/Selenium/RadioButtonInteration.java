package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonInteration {
	@Test
	public void RadioBtn() 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.calculator.net/mortgage-payoff-calculator.html");
		driver.findElement(By.id("cpayoff1")).click();
		//System.out.println("The ouput Is Selected Is:"+ driver.findElement(By.id("cpayoff1")).isSelected());
		//System.out.println("The ouput Is Selected Is:"+ driver.findElement(By.id("cpayoff1")).isSelected());
		//System.out.println("The ouput Is Selected Is:"+ driver.findElement(By.id("cpayoff1")).isSelected());
		
		System.out.println("The Output of the IsSelected.... " + driver.findElement(By.xpath("//*[@id=\"cpayoff1\"]")).isSelected());
		System.out.println("The Output of the IsEnabled " + driver.findElement(By.xpath("//*[@id=\"cpayoff1\"]")).isEnabled());
		System.out.println("The Output of the IsDisplayed... " + driver.findElement(By.xpath("//*[@id=\"calinputtable\"]/tbody/tr[5]/td/label[1]/span")).getText());//.getAttribute("class"))));
		
		/*List<WebElement> radioButtons = driver.findElements(By.name("email-preferences"));
        for (int i = 0; i < radioButtons.size(); i++) {
            if (driver.findElement(By.name("email-preferences")).isSelected()) {
                System.out.println(radioButtons.get(i).getText());
                break;
            }
		*/
	}

}
