
package com.qa.practice.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.practice.base.BaseTest;
import com.qa.practice.constants.AppConstants;

public class RegisterUserTest extends BaseTest {

	@Test
	public void HomePageTitleTest() {
		String actualTitle = homePage.getHomePageTitle();
		Assert.assertEquals(actualTitle, AppConstants.HOMEPAGE_TITLE_VALUE);
	}

	@Test
	public void HomePageURLTest() {
		String actualURL = homePage.getHomePageUrl();
		Assert.assertTrue(actualURL.contains(AppConstants.HOMEPAGE_URL_FRACTION_VALUE));
	}
	
	
	/*
	 * @Test public void SupTest() { 
	 * SupPage = SLPage.doSignUp("test1515", "test");
	 * Assert.assertTrue(SLPage.SignupBtnExist()); }
	 */
	
	/*
	 * @Test public void EntAccntInfoTextTest() { String
	 * actualtxt=SupPage.EntAcntInfoText();
	 * Assert.assertTrue(actualtxt.contains("Enter Account Information")); }
	 * 
	 * @Test public void CreateAccntTest() { SupPage.createaccnt("test155",
	 * "test1","test2", "address123", "MH", "Pune", "234516", "2314567980"); }
	 */
	

}
