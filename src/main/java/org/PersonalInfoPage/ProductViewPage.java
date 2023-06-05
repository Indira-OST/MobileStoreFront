package org.PersonalInfoPage;

import java.time.Duration;

import org.AbstractPageWebFront.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import utility.ExtentTestManager;

public class ProductViewPage extends AbstractPage {
	
	private static final By thisWeekOfferTxt=By.xpath("//h2[text()='This week offers ']");
	private static final By onionImgTxt=By.xpath("(//h6[text()='Onion local from southasian countries'])[1]");
	private static final By homeTxt=By.xpath("//a[text()='Home']");
	private static final By tomatoProdNameTxt=By.xpath("//div[@class='product-right']/h2");
	
	private static final By prodShopArrow=By.xpath("(//span[@class='ng-star-inserted'])[2]");
	private static final By prodFreshArrow=By.xpath("(//span[@class='ng-star-inserted'])[3]");
	private static final By prodVegArrow=By.xpath("(//span[@class='ng-star-inserted'])[4]");
	private static final By prod20PerTxt= By.xpath("(//span[text()='20% OFF'])[1]");
	private static final By prod20Per2Txt= By.xpath("(//span[text()='20% OFF'])[2]");
	private static final By prodSwipeBnt=By.xpath("//div[@class='owl-dot ng-star-inserted']");	
	private static final By weekOfferWasTxt=By.xpath("(//small[text()='was'])[1]");
	private static final By weekOfferStrikeAmt=By.xpath("(//del[@class='ng-star-inserted']//span)[1]");
	private static final By weekOfferNewAmt=By.xpath("(//del[@class='ng-star-inserted']/following-sibling::strong)[1]");
	private static final By OneQARtxt=By.xpath("(//span[@class='QAR_color'])[1]");
	private static final By week2StrikeAmt=By.xpath("(//del[@class='ng-star-inserted']//span)[2]");
	private static final By week2NewAmt=By.xpath("(//del[@class='ng-star-inserted']/following-sibling::strong)[2]");
	private static final By One2QARtxt=By.xpath("(//span[@class='QAR_color'])[2]");
	private static final By prodSizeTxt = By.xpath("//span[text()='Size']");
	private static final By prodSizeFirst = By.xpath("(//div[contains(@class,'size-box d-flex')]//ul[1]/li/a)[1]");
	private static final By prodSizeSec = By.xpath("(//div[contains(@class,'size-box d-flex')]//ul[1]/li/a)[2]");
	private static final By prodSizeThird = By.xpath("(//div[contains(@class,'size-box d-flex')]//ul[1]/li/a)[3]");
	private static final By prodQtyTxt = By.className("product-title");
	private static final By prodInStockTxt = By.xpath("//h5[@class='avalibility ng-star-inserted']//span[1]");
	private static final By prodMinusBtn = By.xpath("//button[@data-type='minus']");
	private static final By prodPlusBtn = By.xpath("//button[@data-type='plus']");
	private static final By prodAddToCart = By.xpath("//a[@class='btn btn-success']");
	private static final By prodOfferDetailsOne = By.xpath("//ul[contains(@class,'ul-style check')]//li[1]");
	private static final By prodOfferDetailsTwo = By.xpath("//ul[contains(@class,'ul-style check')]//li[2]");
	private static final By prodOfferDetailsThre = By.xpath("//ul[contains(@class,'ul-style check')]//li[3]");
	private static final By natHealthImg = By.xpath("//div[@class='ts-product-brand-info']/div/img");
	private static final By natHealthOnionTxt = By.xpath("(//h3[@class='heading-title product-name']/a)[1]");
	private static final By natHealthOnionNatTxt = By.xpath("(//div[@class='meta-wrapper']/img)[1]");
	private static final By oneAddTxt=By.xpath("(//button[text()='Add'])[1]");
	private static final By natHealthOnionImg = By.xpath("(//figure[@class='no-back-image'])[1]");
	private static final By natHealthTomImg = By.xpath("(//figure[@class='no-back-image'])[2]");
	private static final By natHealthTomTxt = By.xpath("(//h3[@class='heading-title product-name']/a)[2]");
	private static final By natHealthOTomNatTxt = By.xpath("(//div[@class='meta-wrapper']/img)[2]");
	private static final By twoAddTxt=By.xpath("(//button[text()='Add'])[2]");
	private static final By natHealthCapImg = By.xpath("(//figure[@class='no-back-image'])[3]");
	private static final By natHealthCapTxt = By.xpath("(//h3[@class='heading-title product-name']/a)[3]");
	private static final By natHealthCapNatTxt = By.xpath("(//div[@class='meta-wrapper']/img)[3]");
	private static final By threeAddTxt=By.xpath("(//button[text()='Add'])[2]");
	private static final By prodDescTxt = By.xpath("//a[text()='Description']");
	private static final By prodDescDetTxt = By.xpath("//p[@class='ng-star-inserted']");
	private static final By prodRevTxt = By.xpath("//a[text()='Review']");
	private static final By revRatTxt = By.xpath("//label[text()='Rating']");
	private static final By revRatStarImg = By.xpath("(//div[@class='rating three-star']/i)[1]");
	private static final By revNameTxt = By.xpath("//label[@for='name']");
	private static final By revEnterName = By.xpath("//input[@id='name']");
	private static final By revEmailTxt = By.xpath("//label[@for='email']");
	private static final By revEnterEmail = By.xpath("//input[@id='email']");
	private static final By revTitleTxt = By.xpath("(//label[@for='review'])[1]");
	private static final By revTitleTxt2 = By.xpath("(//label[@for='review'])[2]");
	private static final By revEnterRevTitle = By.xpath("//input[@id='review']");
	private static final By revEnterRevDetTitle = By.xpath("//textarea[@id='exampleFormControlTextarea1']");
	private static final By submitRevBtn = By.xpath("//button[@class='btn btn-solid']");
	private static final By homePageMegaMartLogo = By.xpath("//div[@class='logo']/a");
	private static final By prodCollapseBtn = By.xpath("//mat-sidenav-content[@class='mat-drawer-content mat-sidenav-content']/div/button/div");
	private static final By prodAllCatTxt = By.xpath("//small[text()='All categories']");
	private static final By prodVegImg = By.xpath("(//div[@class='gradient-menu']/img)[2]");
	private static final By prodVegTxt = By.xpath("//small[text()='Vegetables']");
	private static final By prodMuncTxt = By.xpath("//small[text()='Munchies']");
	private static final By showProdPaginationTxt= By.xpath("//div[@class='product-search-count-bottom']/h5");
	private static final By prodRelProdTxt = By.xpath("//h2[text()='Related products ']");
	private static final By prodRecePurchItem = By.xpath("//h2[text()='Recently purchased items ']");
	private static final By recPurchItemsCapsicTxt = By.xpath("(//h6[text()='Capsicum green - Organic from sweden'])[2]");
	private static final By relProdExpAll = By.xpath("(//a[text()=' Explore all '])[1]");
	private static final By recentPurcProdExpAll = By.xpath("(//a[text()=' Explore all '])[2]");
	private static final By hpProfIcon=By.xpath("//a[@class='my-account']//img[1]");
	private static final By profLefImg = By.xpath("//img[@class='login-image']");
	private static final By lgnToMegaMart = By.xpath("//h3[text()='Login to Megamart! ']");
	private static final By EnteEmail = By.id("email");
	private static final By EnterPswd = By.xpath("//input[@placeholder='Enter Password']");
	private static final By showPswd = By.xpath("//i[@class='fa gradient-icon fa-eye eye-show']");
	private static final By hidePswd = By.xpath("//i[@class='fa gradient-icon fa-eye-slash eye-hide']");
	private static final By forgotPswd= By.xpath("//div[text()='Forgot password? ']");
	private static final By loginBtn =By.xpath("//button[@type='submit']");
	private static final By continuWithTxt = By.xpath("//span[text()='Or continue with ']");
	private static final By signUpGoogleSym = By.xpath("//button[@class='btn btn-social btn-block google-login']/i");
	private static final By signUpGoogleTxt = By.xpath("//button[@class='btn btn-social btn-block google-login']/span");
	private static final By signUpFbSym = By.xpath("//button[@class='btn btn-social btn-block facebook-login']/i");
	private static final By signUpFbTxt = By.xpath("//button[@class='btn btn-social btn-block facebook-login']/span");		
	private static final By newToMegaMart = By.xpath("//div[text()='New to Megamart? ']");
	private static final By signUpBtn = By.xpath("//button[@class='btn gradient-btn-o btn-block mt-3 signuptxt']");
	private static final By forgotPswdPageTxt = By.xpath("//div[@class='login-form']/h3");
	private static final By enterMobNumbTxt = By.xpath("//label[text()='Enter the mobile number linked with your account!']");
	private static final By flagImg = By.xpath("//div[@class='iti__selected-flag']");
	private static final By enterMobNum = By.xpath("//input[@formcontrolname='mobile']");
	private static final By verifyMobNumTxt = By.xpath("//h3[text()='Verify your mobile number!']");
	private static final By verifyOtpTxt = By.xpath("//label[text()='Enter the OTP sent to']");
	private static final By verifyOtpMobNUm = By.xpath("//label[text()='Enter the OTP sent to']/b");
	private static final By verifyOtpFirstNum = By.xpath("(//input[@class='form-control'])[1]");
	private static final By verifyOtpSedNum = By.xpath("(//input[@class='form-control'])[2]");
	private static final By verifyOtpThirdNum = By.xpath("(//input[@class='form-control'])[3]");
	private static final By verifyOtpFourthNum = By.xpath("(//input[@class='form-control'])[4]");
	private static final By resendOtp = By.xpath("//div[@class='pt-4 pb-3 otpresend_txt']");
	private static final By resendOtpSec = By.xpath("//div[@class='pt-4 pb-3 otpresend_txt']/b");
	private static final By createPswdTxt = By.xpath("//h3[text()='Create new password!']");
	private static final By savePswdTxt = By.xpath("//button[@class='btn gradient-btn btn-block login-btn']");
	private static final By pswdReqTxt = By.xpath("(//div[@class='ng-star-inserted'])[1]");
	private static final By enterPswd = By.xpath("//input[@placeholder='Password']");
	private static final By enterConfPswd = By.xpath("//input[@placeholder='Confirm password']");
	
	
			
	
		

	
	

	
	
	
	public ProductViewPage (WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

	}
	
	public ProductViewPage verifyProductDetailsPage() throws InterruptedException {
		

		scrollToElement(thisWeekOfferTxt);
		getElementText(onionImgTxt, "Onion local from southasian countries");
		Thread.sleep(2000);
		click_btn(onionImgTxt);
		getElementText(homeTxt, "Home");
		getElementText(tomatoProdNameTxt, "FRESH TOMATO");
		Thread.sleep(2000);

		element_isDisplayed(prodFreshArrow);
		element_isDisplayed(prodShopArrow);
		element_isDisplayed(prodVegArrow);
		getElementText(prod20PerTxt, "20% OFF");
		click_btn(prodSwipeBnt);
		Thread.sleep(2000);
		getElementText(prod20Per2Txt, "20% OFF");
		getElementText(weekOfferWasTxt, "was");
		getElementText(weekOfferStrikeAmt, "8.55");
		getElementText(weekOfferNewAmt, "6.05");
		getElementText(OneQARtxt, "QAR");
		ExtentTestManager.getTest().log(Status.INFO, "Product details Home page section successfully");
		return this;

}
	public ProductViewPage verifyProdSizAddtoCart() throws InterruptedException {
	
		getElementText(prodSizeTxt, "Size");
		getElementText(prodSizeFirst, "500G");
		getElementText(prodSizeSec, "1Kg");
		getElementText(prodSizeThird, "2Kg");
		getElementText(prodQtyTxt, "Quantity");
		getElementText(prodInStockTxt, "In Stock");
		click_btn(prodPlusBtn);
		getElementText(prodInStockTxt, "Out of Stock");
		click_btn(prodMinusBtn);
		getElementText(prodInStockTxt, "In Stock");
		getElementText(prodAddToCart, "ADD TO CART");
		getElementText(prodOfferDetailsOne, "Highest quality healthy products");
		getElementText(prodOfferDetailsTwo, "Free delivery for first order");
		getElementText(prodOfferDetailsThre, "Always best quality");
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.INFO, "Product size details section successfully");
		return this;

	}
	
	public ProductViewPage verifyNaturalHealthSection() {

		element_isDisplayed(natHealthImg);
		getElementText(natHealthOnionTxt, "Onion local from southasian countries");
		element_isDisplayed(natHealthOnionNatTxt);
		
		getElementText(weekOfferWasTxt, "was");
		getElementText(week2StrikeAmt, "166.87");
		getElementText(week2NewAmt, "123.89");
		getElementText(One2QARtxt, "QAR");
		getElementText(twoAddTxt, "Add");
		element_isDisplayed(natHealthOnionImg);
		element_isDisplayed(natHealthTomImg);
		getElementText(natHealthTomTxt, "Tomatto form north indian states");
		element_isDisplayed(natHealthOTomNatTxt);
		getElementText(twoAddTxt, "Add");
		
		element_isDisplayed(natHealthCapImg);
		
		getElementText(natHealthCapTxt, "Capsicum green - Organic from sweden");
		element_isDisplayed(natHealthCapNatTxt);
		getElementText(threeAddTxt, "Add");
		ExtentTestManager.getTest().log(Status.INFO, "Natural health section successfully");
		return this;
		
	}
	public ProductViewPage verifyDescTxt() {
	
		getElementText(prodDescTxt, "Description");
		getElementText(prodDescDetTxt, "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters,It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters.");
		ExtentTestManager.getTest().log(Status.INFO, "Verify description section successfully");
		return this;
	}
	
	public ProductViewPage verifyReviewTxt() throws InterruptedException {
		scrollToElement(prodRevTxt);
		Thread.sleep(2000);
		getElementText(prodRevTxt, "Review");
		Thread.sleep(2000);
		click_btn(prodRevTxt);
		getElementText(revRatTxt, "Rating");
		element_isDisplayed(revRatStarImg);
		getElementText(revNameTxt, "Name");
		send_keys(revEnterName, "Autoamtion");

		getElementText(revEmailTxt, "Email");
		send_keys(revEnterEmail, "Test");
		getElementText(revTitleTxt, "Review Title");
		send_keys(revEnterRevTitle, "Reviews are entered");
		getElementText(revTitleTxt2, "Review Title");
		send_keys(revEnterRevDetTitle, "Review description entered");
		getElementText(submitRevBtn, "SUBMIT YOUR REVIEW");
		click_btn(submitRevBtn);
		ExtentTestManager.getTest().log(Status.INFO, "Product review section successfully");
		
		return this;

	
	}
	
	public ProductViewPage verifyProdAllCategories() throws InterruptedException {
	
		scrollToElement(prodCollapseBtn);
		element_isDisplayed(prodCollapseBtn);
		Thread.sleep(2000);
		click_btn(prodCollapseBtn);
		Thread.sleep(2000);
		getElementText(prodAllCatTxt, "All categories");
		element_isDisplayed(prodVegImg);
		getElementText(prodVegTxt, "Vegetables");
//		scrollToElement(prodMuncTxt);
//		getElementText(prodMuncTxt, "Munchies");
//		scrollToElement(prodVegImg);
		click_btn(prodVegImg);
	//	getElementText(onionImgTxt, "Onion local from southasian countries");
		scrollToElement(showProdPaginationTxt);
		
		getElementText(showProdPaginationTxt, "Showing Products 12 of 36 Result");
		driver.navigate().back();
		//click_btn(homePageMegaMartLogo);
		ExtentTestManager.getTest().log(Status.INFO, "Product all categories section successfully");
		return this;
		
	}
	public ProductViewPage verifyRelatedProd() {

		scrollToElement(prodRelProdTxt);
		
		getElementText(prodRelProdTxt, "Related products");
		getElementText(onionImgTxt, "Onion local from southasian countries");
		element_isDisplayed(natHealthOnionNatTxt);
		
		getElementText(weekOfferWasTxt, "was");
		getElementText(week2StrikeAmt, "166.87");
		getElementText(week2NewAmt, "123.89");
		getElementText(One2QARtxt, "QAR");
		getElementText(twoAddTxt, "Add");
		scrollToElement(prodRecePurchItem);
		getElementText(natHealthCapTxt, "Capsicum green - Organic from sweden");
		element_isDisplayed(natHealthCapNatTxt);
		getElementText(threeAddTxt, "Add");
		return this;
		
	}
	public ProductViewPage verifyRelProdExpAll() throws InterruptedException {
		
		scrollToElement(relProdExpAll);		
		Thread.sleep(2000);
		click_btn(relProdExpAll);
		getElementText(onionImgTxt, "Onion local from southasian countries");		
		driver.navigate().back();
		ExtentTestManager.getTest().log(Status.INFO, "Related product section successfully");
		return this;
		
	}
	public ProductViewPage verifyRecenPurchProdExpAll() throws InterruptedException {

		Thread.sleep(2000);
		scrollToElement(prodRecePurchItem);	
		Thread.sleep(2000);
		click_btn(recentPurcProdExpAll);
		getElementText(onionImgTxt, "Onion local from southasian countries");	
		ExtentTestManager.getTest().log(Status.INFO, "Verified Recently purchased product section successfully");
		return this;
		
	}
	public ProductViewPage verifySignUpPage() throws InterruptedException {

		driver.navigate().back();
		Thread.sleep(5000);
//		click_btn(homePageMegaMartLogo);
//		Thread.sleep(3000);
	
		scrollToElement(hpProfIcon);
		Thread.sleep(3000);
		click_btn(hpProfIcon);
		Thread.sleep(3000);
		element_isDisplayed(profLefImg);
		getElementText(lgnToMegaMart, "Login to Megamart!");
		send_keys(EnteEmail, "Automation");
		send_keys(EnterPswd, "Test");
		click_btn(hidePswd);
		click_btn(showPswd);
		ExtentTestManager.getTest().log(Status.INFO, "Verified Login page  successfully");
		click_btn(loginBtn);
		element_isDisplayed(forgotPswd);
		getElementText(forgotPswd, "Forgot password?");
		getElementText(continuWithTxt, "Or continue with");
		element_isDisplayed(signUpGoogleSym);
		getElementText(signUpGoogleTxt, "Google");
		scrollToElement(signUpFbTxt);
		element_isDisplayed(signUpFbSym);
		getElementText(signUpFbTxt, "Facebook");
		getElementText(newToMegaMart, "New to Megamart?");
		getElementText(signUpBtn, "Sign up");
		ExtentTestManager.getTest().log(Status.INFO, "Verified Login page subsection  successfully");
		
		
		
		return this;
		
		
	}
	
	public ProductViewPage verifyForgotPswd() {
	
		element_isDisplayed(profLefImg);
		click_btn(forgotPswd);
		getElementText(forgotPswdPageTxt, "Forgot password?");
		getElementText(enterMobNumbTxt, "Enter the mobile number linked with your account!");
		element_isDisplayed(flagImg);
		send_keys(enterMobNum, "46654642");
		getElementText(loginBtn, "Send code");
		click_btn(loginBtn);
		ExtentTestManager.getTest().log(Status.INFO, "Verified forgot password successfully");
		return this;
	}
	
	public ProductViewPage verifyOtp() {
		element_isDisplayed(profLefImg);

		getElementText(verifyMobNumTxt, "Verify your mobile number!");
				getElementText(verifyOtpTxt, "Enter the OTP sent to +971 4368 4026");
			//	getElementText(verifyOtpMobNUm, "+971 4368 4026");
				send_keys(verifyOtpFirstNum, "1");
				send_keys(verifyOtpSedNum, "2");
				send_keys(verifyOtpThirdNum, "3");
				send_keys(verifyOtpFourthNum, "4");
				getElementText(resendOtp, "Resend OTP in 18 seconds");
				//getElementText(resendOtpSec, "18 seconds");
				getElementText(loginBtn, "Verify & proceed");
				click_btn(loginBtn);
				ExtentTestManager.getTest().log(Status.INFO, "Verified otp pagesuccessfully");
		return this;		
				
		
	}
	
	public ProductViewPage verifyCreateNewPswd() throws InterruptedException {
	
		
		getElementText(createPswdTxt, "Create new password!");
		getElementText(savePswdTxt, "Save password");
		click_btn(savePswdTxt);
		Thread.sleep(2000);
		getElementText(pswdReqTxt, "Password is required");
		send_keys(enterPswd, "Password@1234");
		send_keys(enterConfPswd, "password");
		click_btn(savePswdTxt);
		send_keys(enterConfPswd, "Password@1234");
		click_btn(savePswdTxt);
		ExtentTestManager.getTest().log(Status.INFO, "Verified Saved password successfully");
		return this;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
