package com.cts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.Baseclass.BasePage;

public class LogoutPage extends BasePage {
	
	WebDriver driver=null;
	@FindBy(xpath="//*[@id=\'menu_button_container\']/div/div[3]/div/button")
	WebElement menu;
	//By clickMenu=By.xpath("//*[@id=\'menu_button_container\']/div/div[3]/div/button");
	@FindBy(id="logout_sidebar_link")
	WebElement logout;
	//By logout=By.id("logout_sidebar_link");
	public LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver =driver;
		
	}
	public void openMenu() {
		menu.click();
		//driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
	}
	public void clickLogout() {
		logout.click();	
	}

}
