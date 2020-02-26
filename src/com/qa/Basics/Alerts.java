package com.qa.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {
	public static void main(String[] args) {
		
	
	WebDriver driver = null;		
	System.setProperty("webdriver.gecko.driver", "D://practise//com.Selenium//driverFiles//geckodriver.exe");
	driver = new FirefoxDriver();
	String url="https://www.tsrtconline.in";
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	
	driver.findElement(By.id("searchBtn")).click();;
	Alert alert = driver.switchTo().alert();
String	text=alert.getText();
System.out.println(text);
	alert.accept();
	System.out.println("Renuka");
	}

}
