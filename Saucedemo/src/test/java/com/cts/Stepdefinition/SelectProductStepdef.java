package com.cts.Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.Baseclass.BasePage;
import com.cts.pages.LoginPage;
import com.cts.pages.SelectProductPage;
import com.cts.utility.Excelllogin;
import com.cts.utility.Screenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectProductStepdef extends BasePage {
	
	final static Logger logger=LogManager.getLogger(SelectProductPage.class);
	WebDriver driver=null;
	Excelllogin data=new Excelllogin();
	LoginPage loginpage =null ;
	SelectProductPage spp;
	 
	 @Given("^TC03 the user launch the chrome application$")
	    public void tc03_the_user_launch_the_chrome_application() throws Throwable {
		 driver = launchApp("chrome");
	 	 loginpage = new LoginPage(driver);
	 	 spp=new SelectProductPage(driver);
		 logger.info("browser opens");
	    }

	    @When("^TC03 the user open the Saucedemo Home page$")
	    public void tc03_the_user_open_the_saucedemo_home_page() throws Throwable {
	    	driver.get("https://www.saucedemo.com/");
	    	logger.info("website opens");
	    	
	    }

	    @Then("^TC03 the user login using (.+) and (.+)$")
	    public void tc03_the_user_login_using_and(String username, String password) throws Throwable {
	    	Excelllogin excellogin = new Excelllogin();
	    	loginpage.username(excellogin.excel_username(0));
	    	loginpage.password(excellogin.excel_password(0));
		        
	    }

	    @Then("^TC03 click on the login button user nagivate to the next page$")
	    public void tc03_click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable {
	    	loginpage.loginbtn();
	    	logger.info("login successfully");
	    }

	    @Then("^TC03 the user select the product$")
	    public void tc03_the_user_select_the_product() throws Throwable {
	       spp.selectProduct();
	       logger.info("Product is Selected");
	    }
	    
	    @Then("^TC03 adds the product to Add Cart$")
	    public void tc03_adds_the_product_to_add_cart() throws Throwable {
	    	 spp.addToCart();
	    	 logger.info("Product is added to cart");
		     Screenshot util = new  Screenshot(driver);
		     util.takeSnapShot("D:\\vaishnavi\\Saucedemo\\src\\test\\resources\\Screenshot\\Product.png");
			 logger.error("browser is closed");
		     driver.close();

	    }

 }
