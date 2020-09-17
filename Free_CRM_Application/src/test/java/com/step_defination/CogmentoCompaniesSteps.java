package com.step_defination;

import com.base_class.Library;

import com.pages.CogmentoCompaniesPage;
import com.selenium_reuseablefunction.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CogmentoCompaniesSteps extends Library {
	
	CogmentoCompaniesPage companiesPage;
	SeleniumUtility seleniumUtil;
	
	@Given("Open Companies functionlity of FreeCrm")
	public void open_Companies_functionlity_of_FreeCrm() {
		companiesPage=new CogmentoCompaniesPage(driver);
		companiesPage.companiesMenu();
		logger.info("Companies Launched");
	}

	@Then("asks the Companies Screeshot and the Title")
	public void asks_the_Companies_Screeshot_and_the_Title() {
		seleniumUtil=new SeleniumUtility(driver);
		seleniumUtil.to_take_screenshot("companies");
		  logger.info("Taken Screenshot");
		  seleniumUtil.getTitle();	
		  }


}
