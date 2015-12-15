package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BasePage;

public class BasePageTest {
WebDriver driver;
	
	@BeforeMethod
	public void testSetUp(){
		driver = new FirefoxDriver();
		driver.get("https://test1.beezify.io/default/home/index#/overview");
	}
	
	@Test
	public void CheckNavigationTitle(){
		BasePage basepage= new BasePage(driver);
		BasePage basepage1=basepage.login();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		basepage1.ClickOnNavigationMenu();
	}
	
	@AfterMethod
	public void testTearDown(){
		driver.close();
	}

}
