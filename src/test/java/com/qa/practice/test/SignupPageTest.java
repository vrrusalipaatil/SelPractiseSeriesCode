package com.qa.practice.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.practice.base.BaseTest;
import com.qa.practice.constants.AppConstants;

public class SignupPageTest extends BaseTest {

	/*
	 * @BeforeClass public void SUPageSetup() { SUPage =
	 * SLPage.doSignUp(prop.getProperty("username").trim(),prop.getProperty(
	 * "password").trim()); System.out.println("Pass"); }
	 */
	 
	
	@Test(priority=1)
	public void SignupLoginClickTest() {
		homePage.SignupLoginClick();
	}
	
	@Test(priority=2)
	public void doSignUp() {
		SUPage = SLPage.doSignUp(prop.getProperty("username").trim(),prop.getProperty("password").trim());
		Assert.assertTrue(SUPage.EntAcntInfoText().contains(AppConstants.SIGNUP_PAGE_ENTRACCN_TEXT));
	}
	
			
	@Test(priority=3)
	public void SignupPageTitleTest() {
		String ActTitle = SUPage.getSignupPageTitle();
		Assert.assertEquals(ActTitle, AppConstants.SIGNUP_TITLE_VALUE);
	}

	@Test(priority=4)
	public void SignupPageURLTest() {
		String url = SUPage.getSignupPageURL();
		Assert.assertTrue(url.contains(AppConstants.SIGNUP_URL_FRACTION_VALUE));
	}

	@Test(priority=5)
	public void EntAcntInfoText() {
		String AHtxt = SUPage.EntAcntInfoText();
		Assert.assertEquals(AHtxt, AppConstants.SIGNUP_PAGE_ENTRACCN_TEXT);
	}
	
	@Test(priority=6)
	public void CreateAccntTest() throws InterruptedException {
		AccntCPage = SUPage.createaccnt(prop.getProperty("pwd"), prop.getProperty("fname"),prop.getProperty("lname"),prop.getProperty("add"),prop.getProperty("state"), prop.getProperty("city"),prop.getProperty("zip"),prop.getProperty("mobile"));
		
		//Assert.assertTrue(SUPage.EntAcntInfoText().contains(AppConstants.SIGNUP_PAGE_ENTRACCN_TEXT));
		//https://automationexercise.com/account_created
		//Account created
	}
	
	
	 @Test(priority=7) 
	 public void AcntcreatedPageTitleTest() { 
		 String actualTitle = AccntCPage.getAcntcreatedPageTitle();
		 Assert.assertEquals(actualTitle, AppConstants.ACNTCRTED_TITLE_VALUE); }
	 
	 @Test(priority=8) 
	 public void AccntcreatedPageURLTest() { 
	 String url = AccntCPage.getAccntcreatedPageURL();
	 Assert.assertTrue(url.contains(AppConstants.ACNTCRTED_URL_FRACTION_VALUE)); }
	 
	 @Test(priority=9) 
	 public void AccntcrtedtxtTest() { 
	 String Acntcrttxt =
	 AccntCPage.Accntcrtedtxt(); 
	 Assert.assertEquals(Acntcrttxt,AppConstants.ACNTCRTED_PAGE_ACNTCRTET_TEXT); }
	 
	 @Test(priority=10) 
	 public void AcntcrtedtxtValTest() { 
	 String ACrttxt = AccntCPage.textvalidation(); 
	 Assert.assertEquals(ACrttxt,AppConstants.ACNTCRTED_PAGE_TEXT_VALIDATION); }
	 
	 @Test(priority=11) 
	 public void ContiBtnclickTest() {
	 AcrtdLoginPage=AccntCPage.ContiBtnclick(); 
	 }
	
}
