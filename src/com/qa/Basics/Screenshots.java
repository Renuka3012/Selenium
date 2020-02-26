package com.qa.Basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshots {
	public static void main(String[] args) throws IOException {
		WebDriver driver = null;		
		System.setProperty("webdriver.gecko.driver", "D://practise//com.Selenium//driverFiles//geckodriver.exe");
		driver = new FirefoxDriver();
		String url="https://www.tsrtconline.in";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	File tsrtc=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(tsrtc, new File("./Screenshots/tsrtc1.png"));
		
		driver.quit();
	
	
	}

}
