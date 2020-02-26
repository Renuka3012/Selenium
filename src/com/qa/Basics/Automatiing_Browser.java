package com.qa.Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Automatiing_Browser {
	
	public static void main(String[] args) throws InterruptedException {
		String url ="https://www.google.co.in";
		System.setProperty("webdriver.gecko.driver", "D://practise//com.Selenium//driverFiles//geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(url);
		String title=driver.getTitle();
		String currenturl=driver.getCurrentUrl();
		String Window_handle=driver.getWindowHandle();
		System.out.println(title);
		System.out.println(currenturl);
		System.out.println(Window_handle);
		
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(10000);
		
		//gLFyf gsfi
		
		
		
		
		//driver.findElement(By.)
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
		
		
		
	}

}
