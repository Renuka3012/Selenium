package com.qa.Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		WebDriver driver = null;		
		System.setProperty("webdriver.gecko.driver", "D://practise//com.Selenium//driverFiles//geckodriver.exe");
		driver = new FirefoxDriver();
		String url="http://newtours.demoaut.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.linkText("REGISTER")).click();;
		
	WebElement dropdown	=driver.findElement(By.name("country"));
//	int count = dropdown.size();
//	System.out.println(count);
//	
	
	
	Select select = new Select(dropdown);
	
 select.selectByIndex(2);
 select.selectByValue("241");
 select.selectByVisibleText("BENIN");
 select.deselectByValue("241");
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
//	for (int i=0;i<count;i++)
//	{
//		String text=dropdown.get(i).getText();
//		System.out.println(text);
//	}
//	
	driver.quit();
	}

}
