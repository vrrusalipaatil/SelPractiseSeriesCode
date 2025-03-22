package com.qa.practice.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.practice.base.BaseTest;
import com.qa.practice.constants.AppConstants;

public class SignupLoginPageTest extends BaseTest  {
	
	@BeforeClass
	public void SLPageSetup() {
		SLPage = homePage.SignupLoginClick();
		}
	
	@Test
	public void SignupLoginLinkExistTest() {
		Assert.assertTrue(homePage.isSignupLoginLinkExist());
	}

	@Test
	public void SignupLoginClickTest() {
		homePage.SignupLoginClick();
	}
	
	@Test
	public void SignupLoginPageTitleTest() {
		String actualTitle = SLPage.getSignupLoginPageTitle();
		Assert.assertEquals(actualTitle, AppConstants.SIGNUPLOGIN_PAGE_TITLE_VALUE);
	}

	@Test
	public void SignupLoginPageURLTest() {
		String actualURL = SLPage.getSignupLoginPageURL();
		Assert.assertTrue(actualURL.contains(AppConstants.SIGNUPLOGIN_PAGE_URL_FRACTION_VALUE));
	}
	

	@Test
	public void NUlbTest() {
		String actualtxt = SLPage.NewUserSignupLbl();
		Assert.assertTrue(actualtxt.contains(AppConstants.SIGNUPLOGIN_PAGE_SIGNUP_TEXT));
	}

	@Test
	public void doSignUp() {
		SUPage = SLPage.doSignUp(prop.getProperty("username").trim(),prop.getProperty("password").trim());
		Assert.assertTrue(SUPage.EntAcntInfoText().contains(AppConstants.SIGNUP_PAGE_ENTRACCN_TEXT));
	}

}
