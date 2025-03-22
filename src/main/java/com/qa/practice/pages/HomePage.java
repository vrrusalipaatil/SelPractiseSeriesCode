package com.qa.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	//1. Private By locators:
	private By Signup= By.partialLinkText("Signup");

	//2. Constructor
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	//3. Page methods/actions
	public String getHomePageTitle() {
		String title=driver.getTitle();
		System.out.println("Login page title: "+title);
		return title;
	}
	
	public String getHomePageUrl() {
		String url=driver.getCurrentUrl();
		System.out.println("Login page title: "+url);
		return url;
	}
	
	//encapsulation
	   public boolean isSignupLoginLinkExist() { 
		   return driver.findElement(Signup).isDisplayed();
	   }
	 
		public SignupLoginPage SignupLoginClick() {
			driver.findElement(Signup).click();
			return new SignupLoginPage(driver);
		}

}
