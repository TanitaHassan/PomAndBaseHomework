package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DirectLocators {
	WebDriver driver;
	@BeforeTest
	public void openApp() {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void userName() {
		driver.findElement(By.id("email")).sendKeys("tanita");
		
	}
	@Test
	public void passWord() {
		driver.findElement(By.id("pass")).sendKeys("123");
		
	}
	@Test
	public void login() {
		driver.findElement(By.name("login")).click();
	}
	//@Test
	public void linktext() {
		driver.findElement(By.linkText("Messenger")).click();
	}
	@Test
	public void partialLinkText() {
		driver.findElement(By.partialLinkText("Español")).click();
	}
	@AfterTest
	public void closeApp() {
		driver.close();
	}
}
