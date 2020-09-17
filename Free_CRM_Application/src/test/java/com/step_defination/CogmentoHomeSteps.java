package com.step_defination;

import com.base_class.Library;
import com.pages.CogmentoHomePage;
import com.pages.CogmentoLoginPage;
import com.selenium_reuseablefunction.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CogmentoHomeSteps extends Library {
	
	CogmentoHomePage homePage;
	SeleniumUtility seleniumUtil;
	
	@Given("Open Home functionlity of FreeCrm")
	public void open_Home_functionlity_of_FreeCrm() {
		homePage=new CogmentoHomePage(driver);
		homePage.homeMenu();
		logger.info("Home Launched");
	}

	@Then("ask Screeshot and the Title")
	public void ask_Screeshot_and_the_Title() {
		seleniumUtil=new SeleniumUtility(driver);
		seleniumUtil.to_take_screenshot("home");
		  logger.info("Taken Screenshot");
		  seleniumUtil.getTitle();
	}


}
