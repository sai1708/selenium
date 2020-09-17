package com.step_defination;

import com.base_class.Library;
import com.pages.CogmentoCalendarPage;
import com.pages.CogmentoHomePage;
import com.selenium_reuseablefunction.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CogmentoCalendarSteps extends Library {
	
	CogmentoCalendarPage calendarPage;
	SeleniumUtility seleniumUtil;
	
	@Given("Open Calendar functionlity of FreeCrm")
	public void open_Calendar_functionlity_of_FreeCrm() {
		calendarPage=new CogmentoCalendarPage(driver);
		calendarPage.calendarMenu();
		logger.info("Calendar Launched");
	}

	@Then("ask the Screeshot and the Title")
	public void ask_the_Screeshot_and_the_Title() {
		seleniumUtil=new SeleniumUtility(driver);
		seleniumUtil.to_take_screenshot("calendar");
		  logger.info("Taken Screenshot");
		  seleniumUtil.getTitle();
	}


}
