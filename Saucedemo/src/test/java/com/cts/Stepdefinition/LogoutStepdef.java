package com.cts.Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.Baseclass.BasePage;
import com.cts.pages.LoginPage;
import com.cts.pages.LogoutPage;
import com.cts.utility.Excelllogin;
import com.cts.utility.Screenshot;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutStepdef extends BasePage {

	final static Logger logger = LogManager.getLogger(LogoutPage.class);
	WebDriver driver = null;
	Excelllogin data = new Excelllogin();
	LoginPage loginpage = null;
	LogoutPage logoutpage;

	@Given("^TC06 the user launch the browser$")
	public void the_user_launch_the_browser() throws Throwable {
		driver = launchApp("firefox");
		loginpage = new LoginPage(driver);
		logoutpage = new LogoutPage(driver);
		logger.info("browser opens");

	}

	@When("^TC06 the user open the Saucedemo Home page$")
	public void tc06_the_user_open_the_saucedemo_home_page() throws Throwable {
		driver.get("https://www.saucedemo.com/");
		logger.info("website opens");

	}

	@Then("^TC06 the user login using (.+) and (.+)$")
	public void tc06_the_user_login_using_and(String username, String password) throws Throwable {
		Excelllogin excellogin = new Excelllogin();
		loginpage.username(excellogin.excel_Username(0));
		loginpage.password(excellogin.excel_Password(0));

	}

	@Then("^TC06 click on the login button user nagivate to the next page$")
	public void tc06_click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable {
		loginpage.loginButton();
		logger.info("login successfully");
	}

	@Then("^TC06 user opens the menu$")
	public void tc06_user_opens_the_menu() throws Throwable {
		logoutpage.openMenu();
		logger.info("menu opened");

	}

	@And("^TC06 user click on Logout$")
	public void tc06_user_click_on_logout() throws Throwable {
		logoutpage.clickLogout();
		Screenshot util = new Screenshot(driver);
		util.takeSnapShot("src/test/resources/Screenshot/Logout.png");
		logger.error("browser is closed");
		driver.close();
	}

	/*
	 * @Then("^TC06 user click on Logout$") public void tc06_user_click_on_logout()
	 * throws Throwable { logoutpage.clickLogout(); Screenshot util = new
	 * Screenshot(driver);
	 * util.takeSnapShot("src/test/resources/Screenshot/Logout.png");
	 * logger.error("browser is closed"); driver.close(); }
	 */
}
