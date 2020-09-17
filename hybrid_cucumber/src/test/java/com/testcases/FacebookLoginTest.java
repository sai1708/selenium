package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base_class.Library;
import com.pages.FacebookLoginPage;
import com.pages.OrangeHrmLoginPage;
import com.selenium_reuseablefunction.SeleniumUtility;

public class FacebookLoginTest extends Library{
	
	FacebookLoginPage lpage;
	SeleniumUtility seleniumUtil;
	
	@BeforeTest
	public void launchApp()
	{
		//launchApplication("chrome", "https://opensource-demo.orangehrmlive.com/");
		browserSetUp();
		logger.info("Browser Launched");
	}
	
	@Test
	public void login() {
		lpage=new FacebookLoginPage(driver);
//		lpage.LoginUser("Admin", "admin123");
		lpage.LoginUser(properties.getProperty("username"),properties.getProperty("password"));
		logger.info("Browser Login Successfully");
		
	
	}
	
	
	@AfterTest
	public void close() {
		
		seleniumUtil = new SeleniumUtility(driver);   
		seleniumUtil.getTitle();
		seleniumUtil.to_take_screenshot("loginPage");
		tearDown();
		logger.info("Closing Browser");
	}


}
