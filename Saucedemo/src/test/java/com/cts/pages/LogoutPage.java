package com.cts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.Baseclass.BasePage;

public class LogoutPage extends BasePage {
	
	@FindBy(xpath="//*[@id=\'menu_button_container\']/div/div[3]/div/button")
	WebElement menu;
	@FindBy(id="logout_sidebar_link")
	WebElement logout;
	public LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void openMenu() {
		menu.click();
	}
	public void clickLogout() {
		//To Logout from Saucedemo
		logout.click();
	}

}
