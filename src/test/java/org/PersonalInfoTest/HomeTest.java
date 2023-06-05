package org.PersonalInfoTest;
import org.testng.annotations.Test;



import java.util.Arrays;
import java.util.List;

import org.AbstractPageWebFront.AbstractPage;

import org.PersonalInfoPage.HomePage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class HomeTest extends AbstractPage {

	ExtentReports extent;
	ExtentTest test;
	private static final String EMAILID = "superadmintest@openshopee.com";

	@Test(priority =1)
	public void verifyHomePage() throws InterruptedException {

		// AdminPortalPage a=new AdminPortalPage();
//		a.clickloginpage();
		new HomePage(driver)
		.verifyHeader();
	//	.VerifyHeaderAvailDetails()
		//.verifyOfferBanner();
		
		
			//.adminwebui();.clickloginpage()
	}
	//@Test(priority = 2)
	public void verifyWeekOffer() {
		new HomePage(driver)
		.verifyThisWeekOffer()
		.verifyThisWeekOfferExpAll();
		
	}
//	@Test(priority = 3)
	public void verifyCategory() {
		new HomePage(driver)
		
		.verifyCaetgories()
		.verifyCatExploreAll();
		
	}
	@Test(priority = 4)
	public void verifyMoreDeals() throws InterruptedException {
		new HomePage(driver)
		
		.verifyMoreDealsForYou()
		.verifyBrandStore()
		.verifyRecentlyPurchasedItem();
	}
	
}
