package com.LogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest {

	
	 WebDriver driver = null;
	 
	 String url="http://newtours.demoaut.com/";
	 
	 
	 @Given("^Open FireFox browser and navigate to NewTours$")
	 public void Open_FireFox_browser_and_navigate_to_NewTours()   {
	      
	     System.setProperty("webdriver.gecko.driver", "D://practise//com.Selenium//driverFiles//geckodriver.exe");
	     
			driver = new FirefoxDriver();
			 
	     driver.get(url);
	      
	 }

	 @When("^User enters UserName and password and click on LogIn Button$")
	 public void User_enters_UserName_and_password_and_click_on_LogIn_Button()   {
		 
		 
		 
		 driver.findElement(By.name("userName")).sendKeys("tutorial");;
		 driver.findElement(By.name("password")).sendKeys("tutorial");;
		 driver.findElement(By.name("login")).click();
		 
		 
	 }

	 @Then("^User should be able to logIn to the Application successfully and close the browser$")
	 public void User_should_be_able_to_logIn_to_the_Application_successfully_and_close_the_browser()   {
		 
		 
		 driver.findElement(By.name("findFlights")).click();
		 driver.quit();
	      
	 }

	 
	 
	 
}
