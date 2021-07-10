package testNGDemos;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;	

@Listeners(ListenerTestNG.class)
public class ListenerTestNGTestCase {
	//System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\geckodriver\\geckodriver.exe");
	//WebDriver driver= new FirefoxDriver();					

	// Test to pass as to verify listeners .		
	@Test(priority=1)	
	public void TestToPass()				
	{	
	    System.out.println("This method to pass test");	
	    AssertJUnit.assertTrue(true);
	    //driver.get("https://www.facebook.com");	
	   // driver.getTitle();
	    //driver.quit();
	}		
	//Used skip exception to skip the test
	@Test(priority=2)
	public void TestToSkip ()
	{
            System.out.println("This method to skip test");
	    throw new SkipException("Skipping - This is not ready for testing ");
	}
			
	@Test(priority=3)		
	public void TestToFail()				
	{		
	    //driver.getTitle();
		 System.out.println("This method to test fail");	
		AssertJUnit.assertFalse(true);
	   			
	}
}
