package com.facbook.registrationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how =How.XPATH,using="//a[starts-with(@id,'u_0_0_')]") private WebElement createAccount;
	public void createAccountButton() {
		createAccount.click();
	}
	@FindBy(how=How.NAME,using="firstname")public WebElement firstName;
	public WebElement firstNameField(String enterFirstName) {
		firstName.sendKeys(enterFirstName);
		return firstName;
		
	}
	@FindBy(how=How.NAME,using="lastname")public WebElement lastName;
	public WebElement lastNameField(String enterLastName) {
		lastName.sendKeys(enterLastName);
		return lastName;
		
	}
	@FindBy(how=How.NAME,using="reg_email__")private WebElement mobileNumber;
	public WebElement mobileField(String enterPhoneNumber) {
		mobileNumber.sendKeys( enterPhoneNumber);
		return mobileNumber;
		
	}
	@FindBy(how=How.ID,using="password_step_input")private WebElement newPassword;
	public WebElement newPasswordField(String enterNewPass) {
		newPassword.sendKeys(enterNewPass);
		return newPassword;
		
	}
	

}
