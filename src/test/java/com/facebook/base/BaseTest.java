package com.facebook.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.facebook.utilities.PropertiesReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	PropertiesReader reader; // has a relationship and make instance variable

	// String browser="Edge";

	@BeforeMethod
	public void openApp() {
		reader = new PropertiesReader();
		String browser = reader.readBrowser();
        if (browser.equalsIgnoreCase("Chrome")) { // if has also condition and body () and {}
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("Edge")) { // else if()means condition {} and body
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		}

		else if (browser.equalsIgnoreCase("FireFox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}

		else { // have no condition like--().only body{} directly go over there
			System.out.println("Chrome is default browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		// we put here all open method at a once for every openapplicatin method
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//String qaUrl = reader.getUrl();
		//driver.get(qaUrl);
		driver.get(reader.getUrl());
	}

	@AfterMethod
	public void closeApp() {
		if (driver != null);
			driver.quit();
	}
}
