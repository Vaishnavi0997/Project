package com.cts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.Baseclass.BasePage;

public class MenuPage extends BasePage {

	@FindBy(xpath = "//*[@id=\'menu_button_container\']/div/div[3]/div/button")
	WebElement menu;
	@FindBy(id = "about_sidebar_link")
	WebElement about;
	@FindBy(linkText = "Platform")
	WebElement platform;
	@FindBy(linkText = "Selenium")
	WebElement selenium;

	public MenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void openMenu() {
		menu.click();
	}

	public void clickAbout() {
		// To click about in menu page
		about.click();
		// Here it will direct to another page where we can select platfor
		platform.click();

	}

	public void selectSelenium() {
		// In platform to select Selenium
		selenium.click();
	}

}
