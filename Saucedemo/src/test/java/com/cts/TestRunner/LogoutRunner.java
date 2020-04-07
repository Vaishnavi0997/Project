package com.cts.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature/saucedemo.feature",
		// plugin = {"pretty",
		// "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		plugin = { "pretty","html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, 
		         tags = {"@TC06_Saucedemo" },
		         glue = { "com.cts.Stepdefinition" }, 
		         monochrome = true)

public class LogoutRunner {

//	@AfterClass
//	public static void extendReport() {

//		Reporter.loadXMLConfig("src/test/resources/testdata/extend_reports.xml");
//		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
//		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
//		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
//		Reporter.setSystemInfo("Selenium", "3.141.59");
//		Reporter.setSystemInfo("Maven", "4.0.0");
//		Reporter.setSystemInfo("Java Version", "1.8.0_131");

//		Reporter.loadXMLConfig("D:\\vaishnavi\\Saucedemo\\src\\test\\resources\\testdata\\extend_reports.xml");
//		Reporter.setSystemInfo("user", System.getProperty("user.name"));
//		Reporter.setSystemInfo("os", "Windows");
//
//		Reporter.setTestRunnerOutput("Sample test runner output message");
//	}

}
