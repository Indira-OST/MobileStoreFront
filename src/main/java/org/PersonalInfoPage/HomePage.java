package org.PersonalInfoPage;

import java.time.Duration;
import java.util.List;

import org.AbstractPageWebFront.AbstractPage;
import org.apache.poi.ss.formula.functions.WeekdayFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import utility.ExtentTestManager;

public class HomePage extends AbstractPage {
	private static final By homePageMegaMartLogo = By.xpath("//div[@class='logo']/a");
	private static final By hpSearchProd=By.xpath("//input[@placeholder='Search for products']");
	private static final By hpSearchBtn=By.xpath("//i[@class='fa fa-search']");
	private static final By hpLangBtn=By.xpath("//a[@title='Change language']/img");
	private static final By hpCartBtn=By.xpath("//span[@class='img-cart']/img");
	private static final By hpCartNumTxt=By.xpath("//span[@class='img-cart']/following-sibling::span[1]");
	private static final By hpNotifBtn=By.xpath("//a[@title='notification']/img");
	private static final By hpNotifNumTxt=By.xpath("//span[@class='count-number']");
	private static final By hpProfIcon=By.xpath("//a[@title='Login/Register']/img");
	private static final By thisWeekOfferTxt=By.xpath("//h2[text()='This week offers ']");
	private static final By onionImgTxt=By.xpath("(//h6[text()='Onion local from southasian countries'])[1]");
	private static final By homeTxt=By.xpath("//a[text()='Home']");
	private static final By tomatoProdNameTxt=By.xpath("//div[@class='product-right']/h2");
	private static final By arabicLangTxt=By.xpath("(//span[@class='menu-label'])[5]");
	private static final By subTotalTxt=By.xpath("//span[@class='totalitems']");
	private static final By totalAmtxt=By.xpath("//span[@class='totalamount']");
	private static final By currencyNameTxt=By.xpath("//span[@class='currencyname']");
	private static final By checkOutBtn= By.xpath("//button[@class='btn_checkout']");
	private static final By gorceryTxt=By.xpath("//span[text()='Grocery']");
	private static final By bannerLeftArrow=By.xpath("//div[@class='owl-nav ng-star-inserted']//div[1]");
	private static final By bannerRightArrow= By.xpath("(//div[@class='owl-nav ng-star-inserted']//div)[2]");
	private static final By oneFavIcon =By.xpath("(//i[@class='ti-heart'])[1]");
	private static final By offerBannerImg= By.xpath("(//img[@alt='collection-banner'])[1]");
	private static final By offer50Percent=By.xpath("(//h3[@class='adscontainer_offer'])[1]");
	private static final By offerPotatoImgTxt=By.xpath("(//h3[@class='adscontainer_title'])[1]");
	private static final By offerShopNow =By.xpath("(//button[@class='btn adscontainer_shopnow'])[1]");
	private static final By offerCatTxt=By.xpath("//h3[text()='Category']");
	private static final By weekOfferExpAll=By.xpath("(//div[contains(@class,'title4 pb-30')]//a)[1]");
	private static final By weekOfferWasTxt=By.xpath("(//small[text()='was'])[1]");
	private static final By weekOfferStrikeAmt=By.xpath("(//del[@class='ng-star-inserted']//span)[1]");
	private static final By weekOfferNewAmt=By.xpath("(//del[@class='ng-star-inserted']/following-sibling::strong)[1]");
	private static final By OneQARtxt=By.xpath("(//span[@class='QAR_color'])[1]");
	private static final By oneAddTxt=By.xpath("(//button[text()='Add'])[1]");
	private static final By prodHomeArrow=By.xpath("(//span[@class='ng-star-inserted'])[1]");
	private static final By prodHomeVegTitle=By.xpath("//b[text()='Vegetables']");
	private static final By prodHomeHeading =By.xpath("//h3[text()='Vegetables']");
	private static final By prodHomeOfferTxt=By.xpath("(//span[@class='lable3 ng-star-inserted'])[1]");
	private static final By showingProdPagination =By.xpath("//h5[text()='Showing Products 12 of 36 Result']");
	private static final By catTxt=By.xpath("//h4[text()='Categories']");
	private static final By catProdTxt=By.xpath("(//div[@class='category-name']/h3/a)");
	private static final By catVegProdTxt=By.xpath("(//div[@class='category-name']/h3/a)[1]");
	private static final By catVegProdImg=By.xpath("//img[@alt='Vegetables']");
	private static final By catExploreAll= By.xpath("//h4[text()='Categories']/following-sibling::div/div[text()=' Explore all ']");
	private static final By allCatTxt=By.xpath("//b[text()='All categories']");
	private static final By moreDealsTxt= By.xpath("//h1[text()='More deals for you!']");
	private static final By moreDealsOffer=By.xpath("(//h3[@class='dealsconatiner_offer'])[1]");
	private static final By moreDealsTitle=By.xpath("(//h3[@class='dealsconatiner_title'])[1]");
	private static final By moreDealsSubTitle=By.xpath("(//h3[@class='dealsconatiner_subtitle'])[1]");
	private static final By moreDealsExpAllTxt= By.xpath("//h1[text()='More deals for you!']/following-sibling::a/h2");
	private static final By brandStoreExpAll=By.xpath("//a[@ng-reflect-router-link='/shop/brand-list']");
	private static final By brandStoreTxt=By.xpath("//h2[text()='Brand store ']");
	private static final By brandStoreLogo= By.xpath("(//div[@class='lable-block brand-logo'])[1]");
	private static final By brandStoreProdImg= By.xpath("(//a[@ng-reflect-router-link='/shop/product/left/sidebar/'])[1]/img");
	private static final By brandStoreExpBtn=By.xpath("(//button[@class='btn explore'])[1]");
	private static final By threeLayerVegCatAdd=By.xpath("(//button[text()='Add'])[17]");
	private static final By threeLayerFavIcon=By.xpath("(//a[@title='Add to Wishlist'])[17]");
	private static final By threeLayersShopCat=By.xpath("(//a[@class='btn btn-primary'])[1]");
	private static final By threeLayerOnion=By.xpath("(//h6[text()='Onion local from southasian countries'])[2]");
	private static final By recPurItemTxt=By.xpath("//h2[text()='Recently purchased items ']");
	private static final By organicFromSweTxt=By.xpath("(//h6[text()='Capsicum green - Organic from sweden'])[4]");
	
	private static final By prodShopArrow=By.xpath("(//span[@class='ng-star-inserted'])[2]");
	private static final By prodFreshArrow=By.xpath("(//span[@class='ng-star-inserted'])[3]");
	private static final By prodVegArrow=By.xpath("(//span[@class='ng-star-inserted'])[4]");
	private static final By prod20PerTxt= By.xpath("(//span[text()='20% OFF'])[1]");
	private static final By prod20Per2Txt= By.xpath("(//span[text()='20% OFF'])[2]");
	private static final By prodSwipeBnt=By.xpath("//div[@class='owl-dot ng-star-inserted']");	

	
	
	
	


	


			
	
	
	
	
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

	}
//	public HomePage scrollToElement(By element) {
//		WebElement l = driver.findElement(element);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
//	return this;
//	}
	public HomePage verifyHeader () {
		element_isDisplayed(homePageMegaMartLogo);
		element_isDisplayed(hpSearchProd);
		element_isDisplayed(hpSearchBtn);
		element_isDisplayed(hpLangBtn);
		element_isDisplayed(hpCartBtn);
		element_isDisplayed(hpCartNumTxt);
		getElementText(hpCartNumTxt, "0");
		element_isDisplayed(hpNotifBtn);
		getElementText(hpNotifNumTxt, "0");
		element_isDisplayed(hpProfIcon);
		
		
		ExtentTestManager.getTest().log(Status.INFO, "Verified header section successfully");
		return this;
	}
	
	public HomePage VerifyHeaderAvailDetails() throws InterruptedException {
	
		scrollToElement(thisWeekOfferTxt);
		getElementText(onionImgTxt, "Onion local from southasian countries");
		Thread.sleep(2000);
		click_btn(onionImgTxt);
		getElementText(homeTxt, "Home");
		getElementText(tomatoProdNameTxt, "FRESH TOMATO");
		Thread.sleep(2000);
		click_btn(homePageMegaMartLogo);
		element_isDisplayed(hpCartBtn);
//		click_btn(hpLangBtn);
//		Thread.sleep(2000);
//		
//		getElementText(arabicLangTxt, "Deals");
//		
//		Thread.sleep(3000);
//		click_btn(hpLangBtn);
//		click_btn(homePageMegaMartLogo);
//		getElementText(gorceryTxt, "Grocery");
//		Thread.sleep(2000);
		
		
		click_btn(hpCartBtn);
		getElementText(subTotalTxt, "Subtotal (6 items) :");
		getElementText(totalAmtxt, "358.89");
		getElementText(currencyNameTxt, "QAR");
		getElementText(checkOutBtn, "Checkout");
		Thread.sleep(5000);
		click_btn(homePageMegaMartLogo);
		click_btn(bannerLeftArrow);
		click_btn(bannerRightArrow);
		ExtentTestManager.getTest().log(Status.INFO, "Verified cart section successfully");

		return this;
		
	}
	public HomePage verifyOfferBanner() {
	
		element_isDisplayed(offerBannerImg);
		getElementText(offer50Percent, "5% Offer");
		getElementText(offerPotatoImgTxt, "Potatos on fire!");
	//	getElementText(offerShopNow, "SHOP NOW");
		click_btn(offer50Percent);
		getElementText(offerCatTxt, "CATEGORY");
		click_btn(homePageMegaMartLogo);
		ExtentTestManager.getTest().log(Status.INFO, "Offer Banner section successfully");

		return this;
	}
	public HomePage verifyThisWeekOffer() {

		scrollToElement(thisWeekOfferTxt);
		getElementText(thisWeekOfferTxt, "This week offers");
		getElementText(weekOfferExpAll, "Explore all");
		getElementText(onionImgTxt, "Onion local from southasian countries");
		element_isDisplayed(oneFavIcon);
		getElementText(weekOfferWasTxt, "was");
		getElementText(weekOfferStrikeAmt, "166.87");
		getElementText(weekOfferNewAmt, "123.89");
		getElementText(OneQARtxt, "QAR");
		getElementText(oneAddTxt, "Add");
		ExtentTestManager.getTest().log(Status.INFO, "This week offer section successfully");

		return this;

	}
	
	public HomePage verifyThisWeekOfferExpAll() {
		click_btn(weekOfferExpAll);
		getElementText(homeTxt, "Home");
		element_isDisplayed(prodHomeArrow);
		getElementText(prodHomeVegTitle, "Vegetables");
		getElementText(prodHomeHeading, "Vegetables");
		getElementText(prodHomeOfferTxt, "On offer");
		scrollToElement(showingProdPagination);
		getElementText(showingProdPagination, "Showing Products 12 of 36 Result");
		click_btn(homePageMegaMartLogo);
		ExtentTestManager.getTest().log(Status.INFO, "This week offer Explore all section successfully");

		return this;
		
		
	}
	public HomePage verifyCaetgories() {
		scrollToElement(catTxt);
		getElementText(catTxt, "Categories");
		getElementText(catVegProdTxt, "Vegetables");
		element_isDisplayed(catVegProdImg);
		scrollToElement(catVegProdImg);
		List<WebElement> columns = driver.findElements(catProdTxt);
		int prods=columns.size();
		Assert.assertEquals(prods, 10);
		for(WebElement col:columns) {
			String catproductsTxt=col.getText();
			System.out.println("the categories products"+catproductsTxt);
			
	//		Assert.assertEquals(catproductsTxt, "Vegetables");
//	//		Assert.assertEquals(catproductsTxt, "Fresh Fruits");
//			Assert.assertEquals(catproductsTxt, "Dairy & Egg");
//			Assert.assertEquals(catproductsTxt, "Frozen Meat");
//			Assert.assertEquals(catproductsTxt, "Packed Foods");
//			Assert.assertEquals(catproductsTxt, "Beverages");
//			Assert.assertEquals(catproductsTxt, "Hygiene");		
//			Assert.assertEquals(catproductsTxt, "Babycare");		
//			Assert.assertEquals(catproductsTxt, "Indian Spieces");
//			Assert.assertEquals(catproductsTxt, "Munchies");		
		}
		getElementText(catExploreAll, "Explore all");
		ExtentTestManager.getTest().log(Status.INFO, "Verified Categories section successfully");

		return this;
		
	}
	
	public HomePage verifyCatExploreAll() {

		click_btn(catExploreAll);
		getElementText(allCatTxt, "All categories");
		element_isDisplayed(allCatTxt);
		List<WebElement> columns = driver.findElements(catProdTxt);
		int prods=columns.size();
		Assert.assertEquals(prods, 20);
		for(WebElement col:columns) {
			String catproductsTxt=col.getText();
			System.out.println("the categories products"+catproductsTxt);
		}
		ExtentTestManager.getTest().log(Status.INFO, "Verified Categories section Expore all successfully");

		return this;
	}
	
	public HomePage verifyMoreDealsForYou() throws InterruptedException {
		scrollToElement(catTxt);
		getElementText(moreDealsExpAllTxt, "Explore all");
		getElementText(moreDealsTxt, "More deals for you!");
		getElementText(moreDealsOffer, "5% Offer");
		getElementText(moreDealsTitle, "Save the water!");
		getElementText(moreDealsSubTitle, "Save the money");
	//	scrollToElement(moreDealsTxt);
		Thread.sleep(5000);
		click_btn(moreDealsSubTitle);
		Thread.sleep(5000);
		click_btn(homePageMegaMartLogo);
		ExtentTestManager.getTest().log(Status.INFO, "Verified More Deals for you section successfully");

		return this;

	}
	
	public HomePage verifyBrandStore() {
		scrollToElement(brandStoreExpAll);
		getElementText(brandStoreTxt, "Brand store");
		getElementText(brandStoreExpAll,"Explore all");
		element_isDisplayed(brandStoreLogo);
		element_isDisplayed(brandStoreProdImg);
		getElementText(brandStoreExpBtn, "Explore");
		ExtentTestManager.getTest().log(Status.INFO, "Verified Brand store section successfully");

		return this;
		
		
	}
	public HomePage threeLayersCategory() {

		element_isDisplayed(threeLayerVegCatAdd);
		getElementText(threeLayersShopCat, "Shop now");
		click_btn(threeLayersShopCat);
		click_btn(homePageMegaMartLogo);
		scrollToElement(threeLayerVegCatAdd);
		element_isDisplayed(threeLayerFavIcon);
		getElementText(threeLayerOnion, "Onion local from southasian countries");
		click_btn(threeLayerOnion);
		getElementText(tomatoProdNameTxt, "FRESH TOMATO");
		click_btn(homePageMegaMartLogo);
		ExtentTestManager.getTest().log(Status.INFO, "Verified three layers category section successfully");

		return this;
			
	}
	public HomePage verifyRecentlyPurchasedItem() {
	
		getElementText(recPurItemTxt, "Recently purchased items");
		getElementText(organicFromSweTxt, "Capsicum green - Organic from sweden");
		getElementText(recPurItemTxt, "Recently purchased items");
		getElementText(organicFromSweTxt, "Capsicum green - Organic from sweden");
		ExtentTestManager.getTest().log(Status.INFO, "Verified Recently purchased section successfully");

		return this;

	}
	
	public HomePage verifyProductDetailsPage() throws InterruptedException {
	
		verifyHeader();
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
		click_btn(prod20Per2Txt);
		getElementText(weekOfferWasTxt, "was");
		getElementText(weekOfferStrikeAmt, "8.55");
		getElementText(weekOfferNewAmt, "6.05");
		getElementText(OneQARtxt, "QAR");
		return this;

}
}