package com.leadpops.testCases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.leadpops.pageObjects.ApplyPage;
import com.leadpops.pageObjects.LandingPage;

public class TC_LandingTest_001 extends BaseClass {

	@Test
	public void homePageTest()
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LandingPage lp = new LandingPage(driver);
		ApplyPage ap = new ApplyPage(driver);
		
		lp.clickApply();
		logger.info("Clicked Apply Button");
		
		if (driver.getTitle().equals("Olympia Mortgage Application Center | Mortgage Home Loans"))
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false);
			
		}
		
		lp.clickOnlineApply();
		logger.info("Clicked on Apply Online");
		
		ap.performScroll();
		logger.info("Scrolling to view the element");
		
		ap.switchToiframe();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		ap.clickPrimaryBorrowerInfoDropdown();
		logger.info("Clicked Primary Borrower Info Dropdown");
	
		
		ap.firstName();
		ap.middleName();
		ap.lastName();
		ap.emailAddress();
		ap.contactNumber();
		ap.CellNumber();
		logger.info("Entered all contact info");
		
		ap.selectMonth();
		ap.selectDay();
		ap.selectYear();
		logger.info("Selected the Date of Birth ");
		
		ap.checkRentCheckbox();
		ap.currentResidenceAddress();
		ap.enterCity();
		ap.selectState();
		ap.zipCode();
		ap.yearsAtResidence();
		ap.currentEmployer();
		ap.employerPhoneNumber();
		ap.enterEmployerAddress();
		ap.cityEmployer();
		ap.zipCodeEmployer();
		ap.position();
		ap.paidHourlyCheckbox();
		ap.yesSelfEmployed();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		logger.info("Entered all the Primary Borrower Info");
		
		ap.finalizeForm();
		logger.info("Clicked the Finalize form Droapdown");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		ap.clientApproval();
	}
	
}
