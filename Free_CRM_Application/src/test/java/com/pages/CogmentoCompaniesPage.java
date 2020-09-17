package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Library;

public class CogmentoCompaniesPage extends Library {
public CogmentoCompaniesPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
			
	}
@FindBy(xpath = "//*[@id=\"main-nav\"]/a[4]/span")
WebElement companiesButton;

public void companiesMenu()
{
	companiesButton.click();
	
}


}
