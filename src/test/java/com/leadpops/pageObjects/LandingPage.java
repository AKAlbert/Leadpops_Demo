package com.leadpops.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver ldriver;
	
	public LandingPage(WebDriver rdriver)
	
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//a[@class='header__apply']")
	WebElement applyBtn;
	
	@FindBy(xpath="//a[@title='Apply Online Right Now']")
	WebElement onlineApplyBtn;
	
	// Action Methods
	
	public void clickApply()
	{
		applyBtn.click();
	}
	
	public void clickOnlineApply()
	{
		onlineApplyBtn.click();
	}
}
