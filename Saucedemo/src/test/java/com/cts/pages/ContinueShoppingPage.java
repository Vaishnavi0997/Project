package com.cts.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.Baseclass.BasePage;

public class ContinueShoppingPage extends BasePage{
	WebDriver driver = null;
	@FindBy(xpath = "//*[@id=\'item_3_title_link\']/div")
	WebElement selectproduct;
	@FindBy(xpath = "//*[@id=\'inventory_item_container\']/div/div/div/button")
	WebElement addcart;
	@FindBy(xpath = "//*[@id=\'inventory_item_container\']/div/button")
	WebElement backbutton;
	@FindBy(xpath = "//*[@id=\'inventory_container\']/div/div[2]/div[3]/button")
	WebElement selectproduct2;
	@FindBy(id = "shopping_cart_container")
	WebElement cart;
	@FindBy(linkText = "CONTINUE SHOPPING")
	WebElement continueshopping;

	public ContinueShoppingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public void selectProduct() {
		selectproduct.click();
		addcart.click();
		backbutton.click();
		// selecting another product
		selectproduct2.click();
	}

	public void verify() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		cart.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		// to continue shopping
		continueshopping.click();
		

	}



}
