package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.*;


public class ScreenShot
{

//private static final String FileUtils = null;

@Test
public void Screen_shot()
{
	System.setProperty("webdriver.chrome.driver", "/Users/arunakirannulu/eclipse-workspace/Selenium/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	// Take screenshot and store as a file format
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// now copy the  screenshot to desired location using copyFile //method
	try {
		FileUtils.copyFile(src, new File("/Users/arunakirannulu/Downloads/SeleniumNotes/screenshot/error.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

}
