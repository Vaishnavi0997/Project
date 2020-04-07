package com.cts.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/saucedemo.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC01_Saucedemo,@TC02_Saucedemo,@TC03_Saucedemo,@TC04_Saucedemo,@TC05_Saucedemo,@TC06_Saucedemo,"},
		glue = {"com.cts.Stepdefinition"},
		monochrome = true
		)


public class SaucedemoRunner  {

}
