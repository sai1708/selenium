package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Library;

public class CogmentoLoginPage extends Library{
	
public CogmentoLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
			
	}
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")
	WebElement usernameText;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")
	WebElement passwordText;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginButton;
	
	
	public void LoginUser(String username, String password) {
		
		usernameText.sendKeys(username);
		passwordText.sendKeys(password);
		
	}
	
	public void submit() {
		
		loginButton.click();
		
	}
	

}
