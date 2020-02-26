package com.qa.Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Concept {
	public static void main(String[] args) {
 WebDriver driver = null;		
		System.setProperty("webdriver.gecko.driver", "D://practise//com.Selenium//driverFiles//geckodriver.exe");
		driver = new FirefoxDriver();
		String url="http://newtours.demoaut.com/";
		
		driver.get(url);
		
		List <WebElement>links=driver.findElements(By.tagName("a"));
	int 	count=links.size();
	
	System.out.println(count);
	
	for (int i=0;i<count;i++)
	{
		 String LinksName=links.get(i).getText();
		 System.out.println(LinksName);
		// List <WebElement>links=driver.findElements(By.tagName("a"));
		 
	}
	
	WebElement username=driver.findElement(By.name("userName"));
	username.sendKeys("tutorial");
	
	//password
	
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("tutuorail");
//	
	Actions action = new Actions(driver);
//	
//	action.moveToElement(username).sendKeys("tutorial").build().perform();
//		
	
		driver.findElement(By.name("login")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
		
	}

}
