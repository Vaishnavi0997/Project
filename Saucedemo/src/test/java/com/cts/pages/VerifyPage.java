package com.cts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.Baseclass.BasePage;

public class VerifyPage extends BasePage {
	
	WebDriver driver=null;
	//@FindBy(linkText="Test.allTheThings() T-Shirt (Red)")
	//WebElement selproduct;
	@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[6]/div[2]/a/div")
	WebElement selproduct;
	@FindBy(xpath="//*[@id=\'inventory_item_container\']/div/div/div/button")
	WebElement addcart;
	@FindBy(xpath="//*[@id=\'inventory_item_container\']/div/button")
	WebElement backbtn;
	@FindBy(xpath="//*[@id=\'inventory_container\']/div/div[2]/div[3]/button")
	WebElement selproduct2;
	@FindBy(id="shopping_cart_container")
	WebElement cart;
	@FindBy(linkText="CONTINUE SHOPPING")
	WebElement continueshopping;
	
	public VerifyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver =driver;
		
	}
	public void selectProduct() {
		selproduct.click();
		addcart.click();
		backbtn.click();
		//selecting another product
		selproduct2.click();
	}
	public void verify() {
		cart.click();
		//to continue shopping
		continueshopping.click();
		
	}

}
