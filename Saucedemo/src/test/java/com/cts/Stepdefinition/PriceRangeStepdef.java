package com.cts.Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.Baseclass.BasePage;
import com.cts.pages.LoginPage;
import com.cts.pages.SelectPriceRange;
import com.cts.utility.Excelllogin;
import com.cts.utility.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PriceRangeStepdef extends BasePage {
	
	final static Logger logger=LogManager.getLogger(SelectPriceRange.class);	
	WebDriver driver=null;
	Excelllogin data=new Excelllogin();
	LoginPage loginpage =null ;
	SelectPriceRange range;
	 
	 @Given("^TC02 the user launch the chrome application$")
	    public void tc02_the_user_launch_the_chrome_application() throws Throwable {
		 driver = launchApp("chrome");
	 	 loginpage = new LoginPage(driver);
	 	 range=new SelectPriceRange(driver);
		 logger.info("browser opens");

	    }

	    @When("^TC02 the user open the Saucedemo Home page$")
	    public void tc02_the_user_open_the_saucedemo_home_page() throws Throwable {
	    	driver.get("https://www.saucedemo.com/");
	    	logger.info("website opens");
	    	
	    }

	    @Then("^TC02 the user login using (.+) and (.+)$")
	    public void tc02_the_user_login_using_and(String username, String password) throws Throwable {
	    	Excelllogin excellogin = new Excelllogin();
	    	loginpage.username(excellogin.excel_username(0));
	    	loginpage.password(excellogin.excel_password(0));	    		        
	    }

	    @Then("^TC02 click on the login button user nagivate to the next page$")
	    public void tc02_click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable {
	    	loginpage.loginbtn();
	    	logger.info("login successfully");
	    }

	    @Then("^TC02 select the price range from low to high$")
	    public void tc02_select_the_price_range_from_low_to_high() throws Throwable {
	        range.priceRange();
	        logger.info("Price is Selected");
	        Screenshot util = new  Screenshot(driver);
			util.takeSnapShot("D:\\vaishnavi\\Saucedemo\\src\\test\\resources\\Screenshot\\PriceRange.png");
			logger.error("browser is closed");
			driver.close();
	        
	    }


}
