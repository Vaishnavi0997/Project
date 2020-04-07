package com.cts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.Baseclass.BasePage;


public class LoginPage extends BasePage{
	
	WebDriver driver=null;
	@FindBy(id="user-name")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	

	public void username(String username) {
		this.username.sendKeys(username);
	}

	public void password(String password) {

		this.password.sendKeys(password);
	}

	public void loginbtn() {

		loginbtn.click();
	}


}
