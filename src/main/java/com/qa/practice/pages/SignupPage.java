package com.qa.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.qa.practice.utils.ElementUtil;

public class SignupPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
		
	private By EntAccntInfotxt=By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b");
	private By pwd=By.id("password");
	private By fname=By.id("first_name");
	private By lname=By.id("last_name");
	private By add=By.id("address1");
	private By state=By.id("state");
	private By city=By.id("city");
	private By zip=By.id("zipcode");
	private By mobile=By.id("mobile_number");
	private By cabttn= By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
	
	public SignupPage(WebDriver driver) {
		this.driver=driver;
		eleUtil= new ElementUtil(driver);
	}
	
	public String getSignupPageTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public String getSignupPageURL() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	public String EntAcntInfoText() {
		String AHtxt=driver.findElement(EntAccntInfotxt).getText();
		System.out.println(AHtxt);
		return AHtxt;
	}
	
	public AcntCreatedPage createaccnt(String pwd1, String fname1,String lname1,String add1,
												String state1,String city1, String zip1, String m1) throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,700)");
		
		eleUtil.waitForElementVisible(pwd, 10).sendKeys(pwd1);	
		eleUtil.waitForElementVisible(fname, 5).sendKeys(fname1);
		eleUtil.doSendKeys(lname, lname1);
		eleUtil.doSendKeys(add, add1);
		eleUtil.doSendKeys(state, state1);
		eleUtil.doSendKeys(city, city1);
		eleUtil.doSendKeys(zip, zip1);
		eleUtil.waitForElementVisible(mobile, 10).sendKeys(m1);
		eleUtil.doSendKeys(mobile, m1);
		eleUtil.doClick(cabttn);
		
		return new AcntCreatedPage (driver);
		}
	
}
