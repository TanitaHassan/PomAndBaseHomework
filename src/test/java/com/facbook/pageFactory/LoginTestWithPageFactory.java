package com.facbook.pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithPageFactory {
	WebDriver driver;
	LoginPageWithPageFactory lpf;
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void validLoginTest() {
		lpf=new LoginPageWithPageFactory(driver);
		lpf.userName("tanita");
		lpf.passWord("123");
		lpf.loginButton();
	}
	@Test
	public void invalidLoginTest() {
		lpf=new LoginPageWithPageFactory(driver);
		lpf.userName("adb");
		lpf.passWord("123");
		lpf.loginButton();
	}
	@AfterMethod
	public void closeApp() {
		if(driver !=null);
		driver.quit();
	}

}
