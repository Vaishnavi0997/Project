package com.cts.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/saucedemo.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC04_Saucedemo"},
		glue = {"com.cts.Stepdefinition"},
		monochrome = true
		)


public class ContinueShoppingRunner {
	

}
