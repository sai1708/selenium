package com.step_defination;

import org.openqa.selenium.WebElement;

import com.base_class.Library;
import com.pages.OrangeHrmAdminPage;
import com.pages.OrangeHrmLoginPage;
import com.selenium_reuseablefunction.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmAdminSteps extends Library {
	
	OrangeHrmLoginPage loginPage;
	OrangeHrmAdminPage adminPage;
	SeleniumUtility utility;

	
	
	@Given("To Open Admin functionlity of OrangeHrm")
	public void to_Open_Admin_functionlity_of_OrangeHrm() {
	    adminPage = new OrangeHrmAdminPage(driver);
	    adminPage.adminMenu();
	}

	@When("To Enter {string}")
	public void to_Enter(String uName) {
	    adminPage = new OrangeHrmAdminPage(driver);
	    adminPage.userName(uName);
	}

	@Then("Select UserRole")
	public void select_UserRole() {
	    adminPage = new OrangeHrmAdminPage(driver);
	    utility = new SeleniumUtility(driver);
	    utility.dropdown(adminPage.userType(), properties.getProperty("userRole"));
	}

	@Then("To Enter EmployeeName")
	public void to_Enter_EmployeeName() {
	    adminPage = new OrangeHrmAdminPage(driver);
	    adminPage.empName(properties.getProperty("empname"));
	}

	@Then("Select Status")
	public void select_Status() {
		 adminPage = new OrangeHrmAdminPage(driver);
		    utility = new SeleniumUtility(driver);
		    utility.dropdown(adminPage.empStatus(), properties.getProperty("status"));
	}

	@Then("Click Search Button")
	public void click_Search_Button() {
		 adminPage = new OrangeHrmAdminPage(driver);
		 adminPage.submit();
	}

	@Then("Take the Screenshot and the Title")
	public void take_the_Screenshot_and_the_Title() {
	    utility = new SeleniumUtility(driver);
	    utility.to_take_screenshot("admin");
	}

	@Then("Close the browser")
	public void close_the_browser() {
	   tearDown();
	}
}
