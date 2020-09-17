package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
public FacebookLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
			
	}
	
	@FindBy(id = "email")
	WebElement usernameText;
	
	@FindBy(id = "pass")
	WebElement passwordText;
	
	@FindBy(id = "u_0_k")
	WebElement loginButton;
	
	public void LoginUser(String username, String password) {
		
		usernameText.sendKeys(username);
		passwordText.sendKeys(password);
		loginButton.click();
	}

}
