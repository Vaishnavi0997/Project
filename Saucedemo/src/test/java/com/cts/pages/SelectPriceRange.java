package com.cts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.Baseclass.BasePage;

public class SelectPriceRange extends BasePage {

	WebDriver driver = null;
	@FindBy(xpath = "//select[@class='product_sort_container']//option[3]")
	WebElement price;

	public SelectPriceRange(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public void priceRange() {
		//To select the price range from low to high
		price.click();

	}

}
