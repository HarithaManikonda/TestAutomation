package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	 public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver", "/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.com");
	        WebElement searchBox=driver.findElement(By.cssSelector(("#twotabsearchtextbox")));
	        searchBox.sendKeys("automation testing");
	        WebElement searchButton=driver.findElement(By.cssSelector((".nav-search-submit")));
	        searchButton.click();
	        
	       
	        
	        // print the product details
	        WebElement products =  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[1]"));

	  
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	            System.out.println(products);      
	    
	        
	        driver.quit();
	       
	    }

	}