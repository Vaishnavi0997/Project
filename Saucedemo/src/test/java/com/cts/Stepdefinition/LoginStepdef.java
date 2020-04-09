package com.cts.Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.Baseclass.BasePage;
import com.cts.pages.LoginPage;
import com.cts.utility.Excelllogin;
import com.cts.utility.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef extends BasePage {

	final static Logger logger = LogManager.getLogger(LoginPage.class);
	WebDriver driver = null;
	Excelllogin excellogin = new Excelllogin();
	LoginPage loginpage = null;

	@Given("^the user launch the browser$")
	public void the_user_launch_the_browser() throws Throwable {
		driver = launchApp("chrome");
		loginpage = new LoginPage(driver);
		logger.info("browser opens");
	}

	@When("^the user open the Saucedemo Home page$")
	public void the_user_open_the_saucedemo_home_page() throws Throwable {
		driver.get("https://www.saucedemo.com/");
		logger.info("website opens");

	}

	@Then("^the user login using (.+) and (.+)$")
	public void the_user_login_using_and(String username, String password) throws Throwable {
		Excelllogin excellogin = new Excelllogin();
		logger.debug("enter username and password");
		loginpage.username(excellogin.excel_Username(0));
		loginpage.password(excellogin.excel_Password(0));

	}

	@Then("^click on the login button user nagivate to the next page$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable {
		loginpage.loginButton();
		logger.info("login successfully");
		Screenshot util = new Screenshot(driver);
		util.takeSnapShot("src/test/resources/Screenshot/LoginPage.png");
		logger.error("browser is closed");
		driver.close();

	}

}
