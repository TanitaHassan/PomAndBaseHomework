package com.facebook.utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	Properties prop; // its like webdriver driver-- instance variable

	public PropertiesReader() { // this is constructor--- user define we made byself

		prop = new Properties();
		String propertyFile = "src/test/resources/test.properties";

		try {
			FileInputStream fis = new FileInputStream(propertyFile);
			prop.load(fis);
		}

		catch (IOException e) {

			e.printStackTrace();
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
