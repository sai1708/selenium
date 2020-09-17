package com.step_defination;

import com.base_class.Library;

import com.pages.CogmentoContactsPage;
import com.selenium_reuseablefunction.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CogmentoContactsSteps extends Library{
	
	CogmentoContactsPage contactsPage;
	SeleniumUtility seleniumUtil;
	
	@Given("Open Contacts functionlity of FreeCrm")
	public void open_Contacts_functionlity_of_FreeCrm() {
		contactsPage=new CogmentoContactsPage(driver);
		contactsPage.contactsMenu();;
		logger.info("Contacts Launched");
	}

	@Then("asks the Screeshot and the Title")
	public void asks_the_Screeshot_and_the_Title() {
		seleniumUtil=new SeleniumUtility(driver);
		seleniumUtil.to_take_screenshot("contacts");
		  logger.info("Taken Screenshot");
		  seleniumUtil.getTitle();
	}


}
