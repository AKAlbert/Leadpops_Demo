package com.leadpops.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class ApplyPage {

WebDriver ldriver;
	
	public ApplyPage(WebDriver rdriver)
	
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[@id='collapse-text_179']")
	WebElement borrowersDropdown;
	
	@FindBy(xpath="//label[@id='label_input_175_0']")
	WebElement oneBorrowerCheckbox;
	
	@FindBy(xpath="//label[@id='label_input_175_1']")
	WebElement twoBorrowerCheckbox;
	
	@FindBy(xpath="//span[@id='collapse-text_131']")
	WebElement primaryBorrowerInfoDropdown;
	
	@FindBy(name="q1_firstName")
	WebElement firstName;
	
	@FindBy(name="q2_middleName2")
	WebElement middleName;
	
	@FindBy(name="q3_lastName")
	WebElement lastName;
	
	@FindBy(name="q8_emailAddress8")
	WebElement emailAddress;
	
	@FindBy(name="q39_bestContact39[full]")
	WebElement contactNumber;
	
	@FindBy(name="q40_homecellNumber[full]")
	WebElement cellNumber;
	
	@FindBy(name="q38_birthDate38[month]")
	WebElement monthPicker;
	
	@FindBy(name="q38_birthDate38[day]")
	WebElement dayPicker;
	
	@FindBy(name="q38_birthDate38[year]")
	WebElement yearPicker;
	
	@FindBy(xpath="//label[@id='label_input_163_0']")
	WebElement rentCheckbox;
	
	@FindBy(xpath="//label[@id='label_input_163_1']")
	WebElement ownCheckbox;
	
	@FindBy(name="q17_currentResidence")
	WebElement residenceAddress;
	
	@FindBy(name="q62_unitNumber")
	WebElement unitNumber;
	
	@FindBy(name="q59_city59")
	WebElement city;
	
	@FindBy(name="q166_state")
	WebElement state;
	
	@FindBy(name="q61_zipCode61")
	WebElement zipCode;
	
	@FindBy(name="q165_howLong")
	WebElement yearsOnResidence;
	
	@FindBy(name="q64_currentEmployer64")
	WebElement currentEmployer;
	
	@FindBy(name="q100_yearsAt100")
	WebElement yearsAtEmployer;
	
	@FindBy(name="q67_employerPhone[full]")
	WebElement employerPhoneNumber;
	
	@FindBy(name="q65_employerAddress65")
	WebElement employerAddress;
	
	@FindBy(name="q83_city83")
	WebElement cityEmployer;
	
	@FindBy(name="q85_zipCode85")
	WebElement zipCodeEmployer;
	
	@FindBy(name="q75_grossMonthly75")
	WebElement grossMonthly;
	
	@FindBy(name="q87_position87")
	WebElement position;
	
	@FindBy(xpath="//label[@id='label_input_76_0']")
	WebElement paidHourly;
	
	@FindBy(xpath="//label[@id='label_input_76_1']")
	WebElement paidSalary;
	
	@FindBy(xpath="//label[@id='label_input_76_2']")
	WebElement paidCommission;
	
	@FindBy(xpath="//label[@id='label_input_90_0']")
	WebElement additionalCommission;
	
	@FindBy(xpath="//label[@id='label_input_90_1']")
	WebElement additionalBonus;
	
	@FindBy(xpath="//label[@id='label_input_90_2']")
	WebElement additionalOvertime;
	
	@FindBy(xpath="//label[@id='label_input_169_0']")
	WebElement selfEmployed;
	
	@FindBy(xpath="//label[@id='label_input_169_1']")
	WebElement receiveV2;
	
	@FindBy(xpath="//label[@id='label_input_168_0']")
	WebElement yesChildSupport;
	
	@FindBy(xpath="//label[@id='label_input_168_1']")
	WebElement noChildSupport;
	
	@FindBy(name="q134_numberOf")
	WebElement yearsInSchool;
	
	@FindBy(xpath="//span[@id='collapse-text_152']")
	WebElement primaryBorrowerDeclaration;
	
	@FindBy(xpath="//span[@id='collapse-text_44']")
	WebElement finalizeForm;
	
	@FindBy(xpath="//input[@id='input_30']")
	WebElement clientApproval;
	
	@FindBy(xpath="//img[@id='input_37_captcha']")
	WebElement captchaMessage;
	
	@FindBy(xpath="//button[@id='input_33']")
	WebElement submitBtn;
	
	@FindBy(xpath="//p[contains(text(),'There are errors on the form. Please fix them befo')]")
	WebElement errorMsg;
	
	// Actions
	
	TestData testdata = new TestData();
	
	public void performScroll()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
//		js.executeScript("arguments[0].scrollIntoView(true)", primaryBorrowerInfoDropdown );
		js.executeScript("window.scrollTo(0,500)");
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void switchToiframe() {
		ldriver.switchTo().frame("211432822246953");
	}
	
	public void clickPrimaryBorrowerInfoDropdown()
	{
		primaryBorrowerInfoDropdown.click();
	}
	
	public void firstName()
	{
		firstName.sendKeys(testdata.firstName);
	}
	
	public void middleName()
	{
		middleName.sendKeys(testdata.middleName);
	}
	
	public void lastName()
	{
		lastName.sendKeys(testdata.lastName);
	}
	
	public void emailAddress()
	{
		emailAddress.sendKeys(testdata.emailAddress);
	}
	
	public void contactNumber()
	{
		contactNumber.sendKeys(testdata.contactNumber);
	}

	public void CellNumber()
	{
		cellNumber.sendKeys(testdata.middleName);
	}
	
	public void selectMonth()
	{
		monthPicker.click();
		Select drop = new Select(monthPicker);
		drop.selectByIndex(1);
	}
	
	public void selectYear()
	{
		yearPicker.click();
		Select drop = new Select(yearPicker);
		drop.selectByIndex(30);
	}
	
	public void selectDay()
	{
		dayPicker.click();
		Select drop = new Select(dayPicker);
		drop.selectByIndex(3);
	}
	
	public void checkRentCheckbox()
	{
		rentCheckbox.click();
	}
	
	public void currentResidenceAddress()
	{
		residenceAddress.sendKeys(testdata.residenceAddress);
	}
	
	public void enterCity()
	{
		city.sendKeys(testdata.city);
	}
	
	public void selectState()
	{
		state.click();
		Select drop = new Select(state);
		drop.selectByIndex(1);
	}
	
	public void zipCode()
	{
		zipCode.sendKeys(testdata.city);
	}
	
	public void yearsAtResidence()
	{
		yearsOnResidence.click();
		Select drop = new Select(yearsOnResidence);
		drop.selectByIndex(1);
	}
	
	public void enterEmployerAddress()
	{
		employerAddress.sendKeys(testdata.employerAddress);
	}
	
	public void employerPhoneNumber()
	{
		employerPhoneNumber.sendKeys(testdata.employerPhoneNumber);
	}
	
	public void currentEmployer()
	{
		currentEmployer.sendKeys(testdata.currentEmployer);
	}
	
	public void cityEmployer()
	{
		cityEmployer.sendKeys(testdata.cityEmployer);
	}
	
	public void zipCodeEmployer()
	{
		zipCodeEmployer.sendKeys(testdata.zipCodeEmployer);
	}
	
	public void position()
	{
		position.sendKeys(testdata.position);
	}
	
	public void paidHourlyCheckbox()
	{
		paidHourly.click();
	}
	
	public void yesSelfEmployed()
	{
		selfEmployed.click();
	}
	
	public void primaryBorrowerDeclarations()
	{
		primaryBorrowerDeclaration.click();
	}
	
	public void finalizeForm()
	{
		finalizeForm.click();
	}
	
	public void clientApproval()
	{
		clientApproval.sendKeys(testdata.clientNames);
	}
	
	public void clickSubmitBtn()
	{
		submitBtn.click();
	}
	
	public String verifyErrorMsg()
	{
		errorMsg.isDisplayed();
		String errorMsgTxt = errorMsg.getText();
		Assert.assertEquals(errorMsgTxt, testdata.errorMsg);
		
		return errorMsgTxt;
	}
	
}
