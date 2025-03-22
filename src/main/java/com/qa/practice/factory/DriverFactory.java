package com.qa.practice.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
  
	public static String highlight;
	public WebDriver driver;
	public Properties prop;
	
	/**
	 * this method is initializing the driver on the basis of given browser name 
	 * @param prop
	 * @return this returns the driver
	 */
	
	public WebDriver initDriver(Properties prop) {
		//optionsManager = new OptionsManager(prop);
		//highlight = prop.getProperty("highlight").trim();
		
		String browsername = prop.getProperty("browser").toLowerCase().trim();
		System.out.println("Browser Name :"+browsername);
		
		if (browsername.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
		}
		else if (browsername.equalsIgnoreCase("safari")){
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Plz pass the right browser..."+browsername);
		}
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			return driver;
		}
	
	/**
	 * this method reding the properties from the .properties file
	 * @return
	 */
	
	public Properties initProp() {
		prop=new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}

