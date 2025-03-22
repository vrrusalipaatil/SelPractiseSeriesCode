package com.qa.practice.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.practice.base.BaseTest;
import com.qa.practice.constants.AppConstants;

public class AcntCreatedPageTest extends BaseTest {

	
	  @BeforeClass 
	  public void AutoExerPagesetup() {
	  AcrtdLoginPage=AccntCPage.ContiBtnclick(); 
	  }
	 
	
	@Test
	public void AcntcreatedPageTitleTest() {
		String actualTitle = AccntCPage.getAcntcreatedPageTitle();
		Assert.assertEquals(actualTitle, AppConstants.ACNTCRTED_TITLE_VALUE);
	}

	@Test
	public void AccntcreatedPageURLTest() {
		String url = AccntCPage.getAccntcreatedPageURL();
		Assert.assertTrue(url.contains(AppConstants.ACNTCRTED_URL_FRACTION_VALUE));
	}

	@Test
	public void AccntcrtedtxtTest() {
		String Acntcrttxt = AccntCPage.Accntcrtedtxt();
		Assert.assertEquals(Acntcrttxt, AppConstants.ACNTCRTED_PAGE_ACNTCRTET_TEXT);
	}
	
	@Test
	public void AcntcrtedtxtValTest() {
		String ACrttxt = AccntCPage.textvalidation();
		Assert.assertEquals(ACrttxt, AppConstants.ACNTCRTED_PAGE_TEXT_VALIDATION);
	}
	
	@Test
	public void ContiBtnclickTest() {
		AcrtdLoginPage=AccntCPage.ContiBtnclick();
	}
	
}
