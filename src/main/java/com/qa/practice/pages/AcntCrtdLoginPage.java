package com.qa.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.practice.utils.ElementUtil;

public class AcntCrtdLoginPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By Loggedin=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
	private By DeleteAcnt=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
	
	public AcntCrtdLoginPage(WebDriver driver) {
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}

	public String getAcntcrtdLPageTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public String getAcntcrtdLPageURL() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	public boolean LoggedInVisible() {
		boolean LInVisible=driver.findElement(Loggedin).isDisplayed();
		return LInVisible;
	}
	
}
