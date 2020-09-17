package com.step_defination;

import com.base_class.Library;
import com.pages.CogmentoLoginPage;
import com.selenium_reuseablefunction.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CogmentoLoginSteps extends Library {
	
	CogmentoLoginPage loginPage;
	SeleniumUtility seleniumUtil;
	
	@Given("To Launch the Browser and navigate to the Url")
	public void to_Launch_the_Browser_and_navigate_to_the_Url() {
		browserSetUp();
		logger.info("Browser Launched");
	}

	@When("To Enter Username and Password")
	public void to_Enter_Username_and_Password() {
		loginPage=new CogmentoLoginPage(driver);
		loginPage.LoginUser(properties.getProperty("username"),properties.getProperty("password"));
		  logger.info("Entered username and password");

	}

	@Then("To Click the Submit button")
	public void to_Click_the_Submit_button() {
		loginPage=new CogmentoLoginPage(driver);
		loginPage.submit();
		  logger.info("login successful");
	}
		  


	@Then("To ask Screeshot and the Title")
	public void to_ask_Screeshot_and_the_Title() {
		seleniumUtil=new SeleniumUtility(driver);
		seleniumUtil.to_take_screenshot("login");
		  logger.info("Taken Screenshot");
		  seleniumUtil.getTitle();
	}


}
