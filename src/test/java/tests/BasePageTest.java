package tests;



import org.testng.annotations.Test;

import pages.BasePage;

public class BasePageTest extends BaseTest {

	
	
	
	@Test
	public void CheckNavigationTitle(){
		BasePage basepage= new BasePage(driver);
		BasePage basepage1=basepage.login();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		basepage1.ClickManualMobile();
	}
	
	

}
