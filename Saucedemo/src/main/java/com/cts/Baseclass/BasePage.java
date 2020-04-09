package com.cts.Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	private static WebDriver driver;

	public WebDriver launchApp(String browser) {
        //To open chrome browser
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		//To open firefox 
		if (browser.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}

	public void quit() {

		driver.close();
	}

}
