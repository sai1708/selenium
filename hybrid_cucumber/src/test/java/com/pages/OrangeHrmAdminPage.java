package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmAdminPage {
	
public OrangeHrmAdminPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
			
	}

@FindBy(id = "searchSystemUser_userName")
WebElement usernameText;

@FindBy(id = "searchSystemUser_userType")
WebElement typeText;


@FindBy(id = "searchSystemUser_employeeName_empName")
WebElement empName;



@FindBy(id = "searchSystemUser_status")
WebElement empStatus;

@FindBy(id = "searchBtn")
WebElement searchButton;

@FindBy(xpath =  "//*[@id=\'menu_admin_viewAdminModule\']/b")
WebElement adminMenu;

public void adminMenu()
{
	adminMenu.click();
}



public void userName(String username) {
	usernameText.sendKeys(username);
	
}
public void empName(String empname) {
	empName.sendKeys(empname);
	
}

public WebElement userType() {
	return typeText;
	
}

public WebElement empStatus() {
	return empStatus;
	
}


public void submit() {
	
	searchButton.click();
	
}







}
