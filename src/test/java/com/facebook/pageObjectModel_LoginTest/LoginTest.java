package com.facebook.pageObjectModel_LoginTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facbook.pageObjectModel_LoginPage.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    WebDriver driver; //instance variable--WebDriver is a data type and driver is a variable.
    LoginPage loginSite; //has a relationship---Loginpage is data type and make relationship with loginSite variable.here is the main difference
    
@BeforeMethod       
public void openApp() {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.facebook.com/");
}
 @Test
public void loginTest() {
     loginSite=new LoginPage(driver); //we called the variable name loginpage which make has a relationship
     loginSite.userName("tanita");
     loginSite.passWord("123");
     loginSite.loginButton();
}
  @AfterMethod
public void closeApp() {
      if(driver !=null);
       driver.quit();
}

}
