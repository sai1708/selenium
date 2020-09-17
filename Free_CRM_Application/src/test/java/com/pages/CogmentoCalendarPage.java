package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Library;

public class CogmentoCalendarPage  extends Library{
	
public CogmentoCalendarPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
			
	}
@FindBy(xpath = "//*[@id=\"main-nav\"]/a[2]")
WebElement calendarButton;

public void calendarMenu()
{
	calendarButton.click();
	
}

}
