package com.cts.Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	private static WebDriver driver;

	public WebDriver launchApp(String browser) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "D:/drivers/geckodriver-v0.26.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public void quit() {

		driver.quit();
	}
	



}
