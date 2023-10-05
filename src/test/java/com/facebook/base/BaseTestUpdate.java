package com.facebook.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestUpdate {
	public WebDriver driver;
	String browser="Edge";
	
	@BeforeMethod
	public void openFacebook() {
		if (browser.equalsIgnoreCase("Chrome")) {  //if has also condition and body () and {}
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		}
		
		else if(browser.equalsIgnoreCase("Edge")) {        //else if()means condition {} and body
			WebDriverManager.chromedriver().setup();
			driver= new EdgeDriver();
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//driver.get("https://www.facebook.com/");
		}
		
		else if(browser.equalsIgnoreCase("FireFox")) {
			WebDriverManager.chromedriver().setup();
			driver= new FirefoxDriver();
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//driver.get("https://www.facebook.com/");
		}
		else {      //have no condition like--().only body{} directly go over there
			System.out.println("Chrome is default browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		//we put here all open method at a once for every openapplicatin method
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	
	
	//@AfterMethod
	public void closeApp() {
		if(driver !=null);
		driver.quit();
	}
}

