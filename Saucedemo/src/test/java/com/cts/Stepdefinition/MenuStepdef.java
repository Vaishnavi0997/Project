package com.cts.Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.Baseclass.BasePage;
import com.cts.pages.LoginPage;
import com.cts.pages.MenuPage;
import com.cts.utility.Excelllogin;
import com.cts.utility.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuStepdef extends BasePage {
	
	final static Logger logger=LogManager.getLogger(MenuPage.class);	
	WebDriver driver=null;
	Excelllogin data=new Excelllogin();
	LoginPage loginpage =null ;
	MenuPage mp;
	
	@Given("^TC05 the user launch the chrome application$")
    public void tc05_the_user_launch_the_chrome_application() throws Throwable {
		driver = launchApp("firefox");
	 	loginpage = new LoginPage(driver);
	 	mp=new MenuPage(driver);
	    logger.info("browser opens");

    }

    @When("^TC05 the user open the Saucedemo Home page$")
    public void tc05_the_user_open_the_saucedemo_home_page() throws Throwable {
    	driver.get("https://www.saucedemo.com/");
    	logger.info("website opens");
      
    }

    @Then("^TC05 the user login using (.+) and (.+)$")
    public void tc05_the_user_login_using_and(String username, String password) throws Throwable {
    	Excelllogin excellogin = new Excelllogin();
    	loginpage.username(excellogin.excel_username(0));
    	loginpage.password(excellogin.excel_password(0));
    }

    @Then("^TC05 click on the login button user nagivate to the next page$")
    public void tc05_click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable {
    	loginpage.loginbtn();
    	logger.info("login successfully");
    }

    @Then("^TC05 user opens the menu$")
    public void tc05_user_opens_the_menu() throws Throwable {
        mp.openMenu();
        logger.info("Menu is opened");
    }

    @Then("^TC05 user click on About$")
    public void tc05_user_click_on_about() throws Throwable {
        mp.clickAbout();
        Screenshot util = new  Screenshot(driver);
		util.takeSnapShot("D:\\vaishnavi\\Saucedemo\\src\\test\\resources\\Screenshot\\Menu.png");
		logger.error("browser is closed");
        driver.close();
    }

	

}
