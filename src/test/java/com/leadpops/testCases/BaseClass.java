package com.leadpops.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.leadpops.pageObjects.TestData;


public class BaseClass {
	TestData testData = new TestData();
	
	public String baseURL= testData.baseURL;
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") 
				+ testData.chromeDriverLocation);
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		logger = Logger.getLogger("dollarleadclub");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
