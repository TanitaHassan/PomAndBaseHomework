package com.facebook.baseLoginTest;

import org.testng.annotations.Test;

import com.facbook.pageFactory.LoginPageWithPageFactory;
import com.facebook.base.BaseTest;

public class InValidLoginTest extends BaseTest {
LoginPageWithPageFactory lpf;
	
	@Test
	public void validLoginTest() {
		lpf=new LoginPageWithPageFactory(driver);
		lpf.userName("tanita");
		lpf.passWord("123");
		lpf.loginButton();
	}

}
