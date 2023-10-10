package com.facbook.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
      WebDriver driver; // instance variable

	public LoginPageWithPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="email")WebElement userNameId; //using 1 korai for 3 items
	public WebElement userName(String enterYourUserName) {
		userNameId.sendKeys(enterYourUserName);
		return userNameId;
		
	}
	@FindBy(how=How.ID,using="pass")public WebElement pass;
	public WebElement passWord(String enterYourPass) {
		pass.sendKeys(enterYourPass);
		return pass;
		
		}
	@FindBy(how=How.NAME,using="login")private WebElement login;
	public void loginButton() {
		login.click();
	}
}
