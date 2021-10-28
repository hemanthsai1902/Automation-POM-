package com.flipkart.Login;

import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

import com.flipkart.base.Base;

public class Login extends Base  {

	public Login() throws IOException {
		super();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(prop.getProperty("phone"));;
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU'] ")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		}

	public String validateTitle() {
		return driver.getTitle();

	}
	public boolean validateImage() {
		boolean image = driver.findElement(By.xpath("//img[@title='Flipkart']")).isDisplayed();
        return image;  


	}

}
