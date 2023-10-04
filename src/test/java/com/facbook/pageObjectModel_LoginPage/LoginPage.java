package com.facbook.pageObjectModel_LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement userName(String enterYourName) {
		WebElement uName=driver.findElement(By.id("email")); //using 3 korai for 3 times 3 item
		uName.clear();
		uName.sendKeys(enterYourName);
		return uName;
		
	}
	public WebElement passWord(String enterYourPassWord) {
		WebElement passWord=driver.findElement(By.id("pass"));
		passWord.clear();
		passWord.sendKeys(enterYourPassWord);
		return passWord;
		
	}
	public void loginButton() {
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();
			
	}
	public WebElement forgetPassWord() {
		WebElement forgetPass=driver.findElement(By.linkText("Forgot password?"));
		forgetPass.click();
		return forgetPass;
		
	}
	public WebElement createAccount() {
		WebElement createAcc=driver.findElement(By.linkText("Create new account"));
		createAcc.click();
		return createAcc;
		
		
	}
	

}
