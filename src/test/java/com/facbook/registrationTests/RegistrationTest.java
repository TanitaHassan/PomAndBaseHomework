package com.facbook.registrationTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facbook.registrationPages.RegistrationPage;
import com.facebook.base.BaseTest;
import com.facebook.utilities.ExcelReader;

public class RegistrationTest extends BaseTest {
     RegistrationPage regPage;
     ExcelReader exReader;
     String file="src/test/resources/registration.xlsx";
     String sheetName="Sheet1";
     
     @BeforeMethod
     public void openFacebook() {
    	 openApp();
     }
     @Test
     public void createRegistrationTest() {
    	 regPage=new RegistrationPage (driver);
    	 regPage.createAccountButton();
    	 exReader=new ExcelReader(file,sheetName);
    	String fName= exReader.getStringCellValue(1, 0);
    	regPage.firstNameField(fName);
    	String lName= exReader.getStringCellValue(0, 0);
    	regPage.lastNameField(lName);
    	String mobileNum= exReader.getStringCellValue(0, 3);
    	regPage.mobileField(mobileNum);
    	String newPass= exReader.getStringCellValue(0, 3);
    	regPage.newPasswordField(newPass);
    	
     }
     @AfterMethod
 	public void closeFacebook() {
 	 closeApp();
 	}
}
