package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

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
		driver.findElement(By.id("login")).sendKeys("enis");
		driver.findElement(By.id("password")).sendKeys("enis");
		driver.findElement(By.id("domain")).sendKeys("connectdemo");
		driver.findElement(By.id("user-login")).click();
		return new BasePage(driver);
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
	 * Open/close Navigation menu
	 * @return
	 */
	public BasePage ClickOnNavigationMenu(){
		Reporter.log("Click on Navigation Menu",true);
		driver.findElement(By.className("md-menu")).click();
		return this;
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
	
	//click logout
	//languageSelection
	//click on My profile
	//click on new pwd
	//click on user manual web
	//click on user manual mobile
	
	
	/**
	 * Click on Overview
	 */
	public void ClickOverview(){
		Reporter.log("Click on overview",true);
		driver.findElement(By.id("overview-li")).click();
	}
	
	/**
	 * Click on Contacts
	 */
	public void ClickContacts(){
		Reporter.log("Click on contacts",true);
		driver.findElement(By.id("contact-li")).click();
	}
	
	/**
	 * Click on Deals
	 */
	public void ClickDeals(){
		Reporter.log("Click on deals",true);
		driver.findElement(By.id("deal-li")).click();
	}
	
	/**
	 * Click on Cases
	 */
	public void ClickCases(){
		Reporter.log("Click on cases",true);
		driver.findElement(By.id("project-li")).click();
	}

	/**
	 * Click on Tasks
	 */
	public void ClickTasks(){
		Reporter.log("Click on tasks",true);
		driver.findElement(By.id("task-li")).click();
	}
	
	/**
	 * Click on Teams
	 */
	public void ClickTeams(){
		Reporter.log("Click on teams",true);
		driver.findElement(By.id("team-li")).click();
	}
	
	
	/**
	 * Click on Settings
	 */
	public void ClickSettings(){
		Reporter.log("Click on settings",true);
		driver.findElement(By.id("settings-li")).click();
	}
	
	/**
	 * Click on About
	 */
	public void ClickAbout(){
		Reporter.log("Click on about",true);
		driver.findElement(By.id("about-li")).click();
	}
	
}
