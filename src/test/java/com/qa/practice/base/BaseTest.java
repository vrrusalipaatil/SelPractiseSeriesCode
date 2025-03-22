package com.qa.practice.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.practice.factory.DriverFactory;
import com.qa.practice.pages.AcntCreatedPage;
import com.qa.practice.pages.AcntCrtdLoginPage;
import com.qa.practice.pages.HomePage;
import com.qa.practice.pages.SignupLoginPage;
import com.qa.practice.pages.SignupPage;

public class BaseTest {
	DriverFactory df;
	WebDriver driver;
	protected Properties prop;
	protected HomePage homePage;
	protected SignupLoginPage SLPage;
	protected SignupPage SUPage;
	protected AcntCreatedPage AccntCPage;
	protected AcntCrtdLoginPage AcrtdLoginPage;
	
	@BeforeTest
	public void setup() {
		df=new DriverFactory();
		prop= df.initProp();
		driver = df.initDriver(prop);
		homePage=new HomePage(driver);
		SLPage=new SignupLoginPage(driver);
		SUPage=new SignupPage(driver);
		AcrtdLoginPage= new AcntCrtdLoginPage(driver);
		}
	
		
		/*
		 * @AfterTest public void tearDown(){ driver.quit(); }
		 */
		
}
