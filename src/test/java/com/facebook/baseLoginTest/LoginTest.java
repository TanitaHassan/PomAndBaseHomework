package com.facebook.baseLoginTest;

import org.testng.annotations.Test;

import com.facbook.pageFactory.LoginPageWithPageFactory;
import com.facebook.base.BaseTest;
import com.facebook.utilities.PropertiesReader;
public class LoginTest extends BaseTest { //is a relationship parent child use keywords extends
	LoginPageWithPageFactory lpf;
	PropertiesReader propertiesReader;
	
	@Test
	public void validLoginTest() {
		propertiesReader=new PropertiesReader();
		lpf=new LoginPageWithPageFactory(driver);
		lpf.userName(propertiesReader.userName());
		lpf.passWord(propertiesReader.passWord());
		lpf.loginButton();
	}

}
