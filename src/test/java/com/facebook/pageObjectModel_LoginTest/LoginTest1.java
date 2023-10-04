package com.facebook.pageObjectModel_LoginTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facbook.pageObjectModel_LoginPage.LoginPage1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest1 {
	WebDriver driver;
	LoginPage1 logintest;
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void validLoginTest() {
		logintest=new LoginPage1(driver);
		logintest.userName("Tanita");
	}

}
