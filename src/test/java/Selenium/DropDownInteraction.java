package Selenium;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownInteraction {
	Logger logger = Logger.getLogger(DropDownInteraction.class.getName());

	@Test
	public void DropDown_Interaction() {
		System.setProperty("webdriver.chrome.driver","/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/interest-calculator.html");
		
		// Set the dropdown value
		
		Select dropdown=new Select(driver.findElement(By.id("ccompound")));
		//dropdown.selectByVisibleText("semimonthly");
		
		dropdown.selectByIndex(2);
		//dropdown.selectByValue("semimonthly");
		
		// Get all the options in dropdown
		List<WebElement> list = dropdown.getOptions();
		int size = list.size();
	      for(int i =0; i<size ; i++){
	         String options = list.get(i).getText();
	         logger.info(options);
	      }
	      
	   // Get all selected options
	      
	      List<WebElement>  option = dropdown.getAllSelectedOptions();
	      String defaultItem = option.get(0).getText();
	      logger.info(defaultItem );
	      
	      // another way to get the first selected value
	      WebElement  option1 = dropdown.getFirstSelectedOption();
	      String defaultItem1 = option1.getText();
	      logger.info(defaultItem1 );
		
	}
}
