package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePageTest {
WebDriver driver;
	
	@BeforeMethod
	public void testSetUp(){
		driver = new FirefoxDriver();
		driver.get("https://test1.beezify.io");
	}
	
	@AfterMethod
	public void testTearDown(){
	//	driver.close();
	}

}
