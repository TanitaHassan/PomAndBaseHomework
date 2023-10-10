package com.facebook.utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	Properties prop; // its like webdriver driver-- instance variable

	public PropertiesReader() { // this is constructor--- user define we made byself

		prop = new Properties();
		String propertyFile = "src/test/resources/test.properties";

		try {  //try means file will be find from the properties like path will find
			FileInputStream fis = new FileInputStream(propertyFile);
			prop.load(fis); //load the file
		}

		catch (IOException e) { // if not found the path then it will give the error

			e.printStackTrace(); //print the error things
		}

	}

	public String readBrowser() {
		return prop.getProperty("browser");

	}

	public String getUrl() {
		return prop.getProperty("qaUrl");
	}

	public String userName() {
		return prop.getProperty("userName");
	}

	public String passWord() {
		return prop.getProperty("password");

	}

	public static void main(String[] args) {
		PropertiesReader pr = new PropertiesReader();
		String browserName = pr.readBrowser();
		System.out.println(browserName);
	}

}
