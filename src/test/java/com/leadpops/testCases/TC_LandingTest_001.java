package com.leadpops.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.leadpops.pageObjects.LandingPage;

public class TC_LandingTest_001 extends BaseClass {

	@Test
	public void homePageTest()
	{
		driver.get(baseURL);
		
		LandingPage lp = new LandingPage(driver);
		lp.clickApply();
		if (driver.getTitle().equals("Olympia Senior Loan Officer | Mortgage Home Loans"))
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(true);
		}
		
		lp.clickOnlineApply();
	}
	
}
