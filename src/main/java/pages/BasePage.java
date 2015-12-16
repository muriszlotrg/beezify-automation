package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import properties.ReadConfigData;

public class BasePage {
	
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Privremena metoda za testiranje dok se loginPage ne uradi
	 * @return
	 */
	public BasePage login(){
		ReadConfigData data= new ReadConfigData();
		driver.findElement(By.id("login")).sendKeys(data.getUserName());
		driver.findElement(By.id("password")).sendKeys(data.getPassword());
		driver.findElement(By.id("domain")).sendKeys(data.getDomain());
		driver.findElement(By.id("user-login")).click();
		return new BasePage(driver);
	}
	
	/**
	 * Returns is element displayed
	 * @param path
	 * @return
	 */
	private boolean IsDisplayed(By path){
		return driver.findElement(path).isDisplayed();
	}
	
	/**
	 * Click on element with path
	 * @param path
	 */
	private void Click(By path){
		 driver.findElement(path).click();
	}
	
	/**
	 * Check is menu element displayed and click on element 
	 * if not open avatar menu and than click
	 * @param path
	 */
	private void ClickOnAvatarMenuElement(By path){
		if(IsDisplayed(path)) 
			Click(path);
		else {
			ClickUserAvatarMenu();
			Click(path);
		}
	}
	
	
	/**
	 * Check is menu element displayed and click on element 
	 * if not open naviagtion menu and than click
	 * @param path
	 */
	private void ClickOnNavMenuElement(By path){
		if(IsDisplayed(path)) 
			Click(path);
		else {
			ClickOnNavigationMenu();
			Click(path);
		}
	}
	
	/**
	 * Insert in search field
	 * @param search
	 * @return
	 */
	public BasePage InsertInSearchField(String search){
		Reporter.log("Insert in search: "+search,true);
		driver.findElement(By.id("ct-single-search")).sendKeys(search);
		return this;	
	}
	
	
	/**
	 * Click on search button
	 */
	public void ClickOnSearchButton(){
		Reporter.log("Click on search button",true);
		driver.findElement(By.className("search-icon md-search")).click();
	}
	
	/**
	 * Insert in search field and start search
	 * @param search
	 */
	public void Search(String search){
		InsertInSearchField(search);
		ClickOnSearchButton();
	}
	
	/**
	 * Returns Navigation title 
	 * @return
	 */
	public String NavigationTitle(){
		Reporter.log("Get Navigation title",true);
		return driver.findElement(By.id("nav-location-text")).getText();
	}
	
	/**
	 * Open/close Notification
	 * @return
	 */
	public BasePage ClickNotification(){
		Reporter.log("Click on notification",true);
		driver.findElement(By.id("ct-notifications-wrapper")).click();
		return this;
	}
	 
		
	/**
	 * Open/Close Avatar Menu
	 * @return
	 */
	public BasePage ClickUserAvatarMenu(){
		Reporter.log("Click on Avatar",true);
		driver.findElement(By.id("avatar-dropdown")).click();
		return this;
	}
	
	/**
	 * Returns Avatar Name
	 * @return
	 */
	public String GetAvatarName(){
		Reporter.log("Get avatar name",true);
		return driver.findElement(By.id("avatar-dropdown")).getText();
	}
	
	
	/**
	 * Logout from beezfiy
	 * @return
	 */
	public BasePage Logout(){
		Reporter.log("Logout from beezfiy",true);
		By path = new By.ById("logout");
		ClickOnAvatarMenuElement(path);
		return this;
	}
	
	/**
	 * Change language to Bosnian
	 * @return
	 */
	public BasePage ChangeToBosLanguage(){
		Reporter.log("Change to Bosnian language",true);
		By path = new By.ByXPath(".//*[@value='ba']");
		ClickOnAvatarMenuElement(path);
		return this;
	}

	
	/**
	 * Change language to English
	 * @return
	 */
	public BasePage ChangeToEngLanguage(){
		Reporter.log("Change language to english", true);
		By path = new By.ByXPath(".//*[@value='en']");
		ClickOnAvatarMenuElement(path);
		return this;
	}
	
	/**
	 * Click on My profile button
	 */
	public void ClickMyProfile(){
		Reporter.log("Click on My profile button",true);
		By path = new By.ByXPath(".//*[@ng-click='linkToMyProfile()']");
		ClickOnAvatarMenuElement(path);
	}
	
	/**
	 * Click on new password
	 */
	public void ClickNewPwd(){
		Reporter.log("Click on new password",true);
		By path = new By.ById("reset-own-password");
		ClickOnAvatarMenuElement(path);
	}
	
	
	/**
	 * Click on User manual web
	 */
	public void ClickManualWeb(){
		Reporter.log("Click on User manual web",true);
		By path = new ById("user-manual-web");
		ClickOnAvatarMenuElement(path);
	}
	
	/**
	 * Click on User manual mobile
	 */
	public void ClickManualMobile(){
		Reporter.log("Click on User manual mobile",true);
		By path = new ById("user-manual-mobile");
		ClickOnAvatarMenuElement(path);
	}

	
	/**
	 * Open/close Navigation menu
	 * @return
	 */
	public BasePage ClickOnNavigationMenu(){
		Reporter.log("Click on Navigation Menu",true);
		Click(By.className("md-menu"));
		return this;
	}
	
	/**
	 * Click on Overview
	 */
	public void ClickOverview(){
		Reporter.log("Click on overview",true);
		By path = new ById("overview-li");
		ClickOnNavMenuElement(path);
	}
	
	/**
	 * Click on Contacts
	 */
	public void ClickContacts(){
		Reporter.log("Click on contacts",true);
		By path = new ById("contact-li");
		ClickOnNavMenuElement(path);
	}
	
	/**
	 * Click on Deals
	 */
	public void ClickDeals(){
		Reporter.log("Click on deals",true);
		By path= new ById("deal-li");
		ClickOnNavMenuElement(path);
	}
	
	/**
	 * Click on Cases
	 */
	public void ClickCases(){
		Reporter.log("Click on cases",true);
		By path= new ById("project-li");
		ClickOnNavMenuElement(path);
	}

	/**
	 * Click on Tasks
	 */
	public void ClickTasks(){
		Reporter.log("Click on tasks",true);
		By path= new ById("task-li");
		ClickOnNavMenuElement(path);
	}
	
	/**
	 * Click on Teams
	 */
	public void ClickTeams(){
		Reporter.log("Click on teams",true);
		By path= new ById("team-li");
		ClickOnNavMenuElement(path);
	}
	
	
	/**
	 * Click on Settings
	 */
	public void ClickSettings(){
		Reporter.log("Click on settings",true);
		By path= new ById("settings-li");
		ClickOnNavMenuElement(path);
	}
	
	/**
	 * Click on About
	 */
	public void ClickAbout(){
		Reporter.log("Click on about",true);
		By path= new ById("about-li");
		ClickOnNavMenuElement(path);
	}
	
}
