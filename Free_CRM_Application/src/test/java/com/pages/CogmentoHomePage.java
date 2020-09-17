package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Library;

public class CogmentoHomePage extends Library{
	
public CogmentoHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
			
	}
@FindBy(xpath = "//*[@id=\"main-nav\"]/a[1]")
WebElement homeButton;

public void homeMenu()
{
	homeButton.click();
	
}


}

