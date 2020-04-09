package com.cts.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.Baseclass.BasePage;

public class SelectProductPage extends BasePage {

	WebDriver driver = null;
	@FindBy(xpath="//*[@id=\'item_1_title_link\']/div")
	WebElement product;
	@FindBy(xpath = "//*[@id=\'inventory_item_container\']/div/div/div/button")
	WebElement addcart;

	public SelectProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public void selectProduct() {
		//here product is selected
		product.click();
	}

	public void addToCart() {
		//the selected product is added to cart
		addcart.click();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	}

}
