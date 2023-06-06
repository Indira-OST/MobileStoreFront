package org.PersonalInfoTest;

import org.AbstractPageWebFront.AbstractPage;
import org.PersonalInfoPage.HomePage;
import org.PersonalInfoPage.ProductViewPage;
import org.testng.annotations.Test;

public class ProductViewTest extends AbstractPage {

	@Test(priority =1)
	public void verifyHomePage() throws InterruptedException {

		new HomePage(driver)
		.verifyHeader();
	
	}
	@Test(priority =2)
	public void productViewDetails() throws InterruptedException {
		new ProductViewPage(driver)
		.verifyProductDetailsPage()
		.verifyProdSizAddtoCart()
		.verifyNaturalHealthSection();
	}
	@Test(priority = 3)
	public void productDescriptionDetails() throws InterruptedException {
		new ProductViewPage(driver)
		.verifyDescTxt()
		.verifyReviewTxt()
		.verifyProdAllCategories()
		//.verifyProductDetailsPage()
		.verifyRelatedProd()
		.verifyRelProdExpAll()
		.verifyRecenPurchProdExpAll();
	
	}
	@Test(priority = 4)
		public void verifySignUpPage() throws InterruptedException {
		new ProductViewPage(driver)
		.verifyLoginPage()
		.verifyForgotPswd()
		.verifyOtp()
		.verifyCreateNewPswd()
		.verifySignUpPage();
	
		
			
		}
	

}