package com.qa.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.practice.constants.AppConstants;
import com.qa.practice.utils.ElementUtil;

public class AcntCreatedPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By Accntcrtedtxt= By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
	private By Cngrts= By.xpath("//*[@id=\"form\"]/div/div/div/p[1]");
	private By advantage=By.xpath("//*[@id=\"form\"]/div/div/div/p[2]/text()");
	private By contibtn= By.xpath("//*[@id=\"form\"]/div/div/div/div/a");
	
	public AcntCreatedPage(WebDriver driver) {
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}
	
	public String getAcntcreatedPageTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public String getAccntcreatedPageURL() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	public String Accntcrtedtxt() {
		String ACtxt=driver.findElement(Accntcrtedtxt).getText();
		System.out.println(ACtxt);
		return ACtxt;
	}
	
	public String textvalidation() {
		String Cngrtstxt=driver.findElement(Cngrts).getText();
		//String advantagetxt=driver.findElement(advantage).getText();
		return Cngrtstxt;
	}
	
	public AcntCrtdLoginPage ContiBtnclick() {
		eleUtil.waitForElementVisible(contibtn, AppConstants.DEFAULT_SHORT_TIME_OUT).click();
		return new AcntCrtdLoginPage(driver);
	}

	

}
