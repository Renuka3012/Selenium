package com.StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
 
import cucumber.api.junit.Cucumber;

 
@RunWith(Cucumber.class)
@CucumberOptions(features="D://practise//com.Selenium//src//com//StepDefinition//NewTours.feature",glue={"com.LogInTest"})


public class TestRunner {

}
  