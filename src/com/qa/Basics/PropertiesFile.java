package com.qa.Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesFile {
	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("D:\\practise\\com.Selenium\\src\\com\\qa\\Basics\\config.properties");
		prop.load(file);
	String	url=prop.getProperty("url");
		
		System.out.println(url);
		
	String 	browser =prop.getProperty("browser");
	if(browser.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", "D://practise//com.Selenium//driverFiles//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
	}else if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chromee.driver", "D://practise//com.Selenium//driverFiles//chromedriver.exe");
		driver = new  ChromeDriver();
		driver.get(url);
		
		
	}
		
	}

}
