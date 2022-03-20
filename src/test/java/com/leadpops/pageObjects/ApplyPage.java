package com.leadpops.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyPage {

WebDriver ldriver;
	
	public ApplyPage(WebDriver rdriver)
	
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="collapse-text_131")
	WebElement borrowersDropdown;
	
	@FindBy(xpath="//label[@id='label_input_175_0']")
	WebElement oneBorrowerCheckbox;
	
	@FindBy(xpath="//label[@id='label_input_175_1']")
	WebElement twoBorrowerCheckbox;
	
	@FindBy(xpath="//div[@id='collapse_131']//span[@class='form-collapse-right form-collapse-right-hide']")
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
	
	@FindBy(name="//div[@id='collapse_152']//span[@class='form-collapse-right form-collapse-right-hide']")
	WebElement primaryBorrowerDeclaration;
	
	
	// Actions
	
	TestData testdata = new TestData();
	
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
	
}
