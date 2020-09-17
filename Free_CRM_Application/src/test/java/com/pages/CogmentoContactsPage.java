package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Library;

public class CogmentoContactsPage extends Library{
	
public CogmentoContactsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
			
	}
@FindBy(xpath = "//*[@id=\"main-nav\"]/a[3]/span")
WebElement contactButton;

public void contactsMenu()
{
	contactButton.click();
	
}

}
