package com.qa.Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames  {
	public static void main(String[] args) {
		
		 WebDriver driver = null;		
			System.setProperty("webdriver.gecko.driver", "D://practise//com.Selenium//driverFiles//geckodriver.exe");
			driver = new FirefoxDriver();
			String url="https://jqueryui.com/droppable";
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			
			
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			WebElement drag_text=driver.findElement(By.id("draggable"));
			drag_text.getText();
			System.out.println(drag_text);
		WebElement droppable=	driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag_text, droppable).build().perform();;
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Resizable")).click();;
		
	}

}
