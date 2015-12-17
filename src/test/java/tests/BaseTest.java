package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import properties.ReadConfigData;

public class BaseTest  {

	WebDriver driver;
	
	@BeforeMethod
	public void testSetUp(){
		ReadConfigData read=new ReadConfigData();
		driver = new FirefoxDriver();
		driver.get(read.getPageUrl());
	}
	
	@AfterMethod
	public void testTearDown(){
	//	driver.close();
	}
}
