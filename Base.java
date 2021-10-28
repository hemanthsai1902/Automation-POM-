package com.flipkart.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop; 
	public Base() throws IOException {
		prop = new Properties();
		FileInputStream fp = new FileInputStream("E:\\FlipkartPOM\\src\\main\\java\\com\\flipkart\\configu\\config.prop");
		prop.load(fp);
	}

	public static void intilization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./Chrome/chromedriver.exe");
			driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

	}}
