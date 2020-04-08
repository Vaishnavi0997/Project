package com.cts.Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.Baseclass.BasePage;
import com.cts.pages.LoginPage;
import com.cts.pages.VerifyPage;
import com.cts.utility.Excelllogin;
import com.cts.utility.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyStepdef extends BasePage {
	final static Logger logger = LogManager.getLogger(VerifyPage.class);
	WebDriver driver = null;
	Excelllogin data = new Excelllogin();
	LoginPage loginpage = null;
	VerifyPage verify;

	@Given("^TC04 the user launch the chrome application$")
	public void tc04_the_user_launch_the_chrome_application() throws Throwable {
		driver = launchApp("chrome");
		loginpage = new LoginPage(driver);
		verify = new VerifyPage(driver);
		logger.info("browser opens");
	}

	@When("^TC04 the user open the Saucedemo Home page$")
	public void tc04_the_user_open_the_saucedemo_home_page() throws Throwable {
		driver.get("https://www.saucedemo.com/");
		logger.info("website opens");

	}

	@Then("^TC04 the user login using (.+) and (.+)$")
	public void tc04_the_user_login_using_and(String username, String password) throws Throwable {
		Excelllogin excellogin = new Excelllogin();
		loginpage.username(excellogin.excel_Username(0));
		loginpage.password(excellogin.excel_Password(0));
	}

	@Then("^TC04 click on the login button user nagivate to the next page$")
	public void tc04_click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable {
		loginpage.loginButton();
		logger.info("login successfully");
	}

	@Then("^TC04 the user select the product and add to cart$")
	public void tc04_the_user_select_the_product_and_add_to_cart() throws Throwable {
		verify.selectProduct();
		logger.info("Product is selected and added to cart");
	}
	
	@Then("^TC04 the user continue shopping$")
    public void tc04_the_user_continue_shopping() throws Throwable {
		verify.verify();
		logger.info("Product is added");
		Screenshot util = new Screenshot(driver);
		util.takeSnapShot("src/test/resources/Screenshot/Verify.png");
		logger.error("browser is closed");
		driver.close();

    }

}
