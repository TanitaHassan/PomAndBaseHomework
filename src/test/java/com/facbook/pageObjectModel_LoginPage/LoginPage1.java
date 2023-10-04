package com.facbook.pageObjectModel_LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
   WebDriver driver;

public LoginPage1(WebDriver driver) {
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
public WebElement userName(String enterYourUserName) {
	WebElement uName= driver.findElement(By.id("email"));
	uName.clear();
	uName.sendKeys(enterYourUserName);
	return uName;
	
	
}

}
