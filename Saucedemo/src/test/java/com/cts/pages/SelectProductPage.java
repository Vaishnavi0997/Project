package com.cts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.Baseclass.BasePage;

public class SelectProductPage extends BasePage {
	
	WebDriver driver=null;
	//@FindBy(linkText="Sauce Labs Bolt T-Shirt")
    @FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/a/div")
	WebElement product;
	@FindBy(xpath="//*[@id=\'inventory_item_container\']/div/div/div/button")
	WebElement addcart;
	//By addcart=By.xpath("//*[@id=\'inventory_item_container\']/div/div/div/button");
	public SelectProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver =driver;
		
	}
	public void selectProduct() {
	   product.click();
		//driver.findElement(product).click();
	}
	public void addToCart() {
		addcart.click();
		//driver.findElement(addcart).click();
	}

}
