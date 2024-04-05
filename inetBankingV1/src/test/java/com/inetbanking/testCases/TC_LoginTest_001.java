package com.inetbanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;


import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException {
		driver.get(baseURL);
		
		logger.info("URL Entered");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username Entered");
		
		lp.setPassword(password);
		logger.info("Password Entered");
		
		lp.clickSubmit();
		logger.info("SUBMITTED");
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login Test Pass");
		}else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}
		
	}
}
