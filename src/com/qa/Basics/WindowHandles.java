package com.qa.Basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;		
		System.setProperty("webdriver.gecko.driver", "D://practise//com.Selenium//driverFiles//geckodriver.exe");
		driver = new FirefoxDriver();
		String url="http://www.popuptest.com/goodpopups.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		
		Set<String>handler=driver.getWindowHandles();
		Iterator<String>it=handler.iterator();
		 String ParentId=it.next();
		 System.out.println(ParentId);
		 
		String ChildId= it.next();
		 System.out.println(ChildId);
		
		driver.switchTo().window(ChildId);Thread.sleep(10000);
		System.out.println(driver.getTitle());
		 
		 driver.close();
		 
		 driver.switchTo().window(ParentId);
		System.out.println(driver.getTitle());
		driver.quit();
		 
		 
		 
		 
		
		
		
		
	}

}
