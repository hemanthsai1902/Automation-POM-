package com.flipkart.loginTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.amazon.au.signin.Signin;
import com.flipkart.Login.Login;
import com.flipkart.base.Base;

public class LoginTest extends Base {
Login login;
	public LoginTest() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() throws IOException, Exception {
		intilization();
	 login = new Login();
	}
	@Test(priority=1)
	public void validateTitle() {
		String title =login.validateTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	@Test(priority=2)
	public void validateImage() {
		boolean vi = login.validateImage();
		Assert.assertTrue(vi);
	}
	 
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
