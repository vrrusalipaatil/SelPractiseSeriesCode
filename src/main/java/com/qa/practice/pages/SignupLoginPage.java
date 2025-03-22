package com.qa.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.practice.constants.AppConstants;
import com.qa.practice.utils.ElementUtil;

public class SignupLoginPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By uname=By.name("name");
	private By emailid=By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)");
			//xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
	private By Signup=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
	private By emailId= By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=email]:nth-child(2)");
			//xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"); 
	private By passwd= By.name("password");
	private By login=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button");
	private By NUSignup=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");
				
	public SignupLoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil=new ElementUtil(driver);
	}
	
	public String getSignupLoginPageTitle() {
		String title=eleUtil.waitForTitleIsAndFetch(AppConstants.DEFAULT_MEDIUM_TIME_OUT, AppConstants.SIGNUPLOGIN_PAGE_TITLE_VALUE);
				//System.out.println(title);
		return title;
	}
	
	public String getSignupLoginPageURL() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	public boolean SignupBtnExist() {
		return driver.findElement(Signup).isDisplayed();
	}
	
	public String NewUserSignupLbl() {
		String lbl=driver.findElement(NUSignup).getText();
		System.out.println(lbl);
		return lbl;
	}
	
	public SignupLoginPage SignupLoginClick() {
		driver.findElement(Signup).click();
		return new SignupLoginPage(driver);
	}
	public SignupPage doSignUp(String un, String emId) {
		
		System.out.println("App Cred are: "+ un +":"+emId);
		eleUtil.waitForElementVisible(uname, AppConstants.DEFAULT_LONG_TIME_OUT).sendKeys(un);
		eleUtil.doSendKeys(emailid, emId);
		eleUtil.waitForElementVisible(Signup, AppConstants.DEFAULT_SHORT_TIME_OUT).click();
		return new SignupPage(driver);
		}
	
	public SignupPage doLogin(String eId, String pwd) {
		eleUtil.waitForElementVisible(emailId, AppConstants.DEFAULT_MEDIUM_TIME_OUT).sendKeys(eId);
		eleUtil.doSendKeys(passwd, pwd);
		eleUtil.doClick(login);
		
		return new SignupPage(driver);
		}
}
