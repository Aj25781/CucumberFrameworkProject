package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPage landingPage;
	public OfferPage offerPage;
	public WebDriver driver;
	public CheckoutPage checkOutPage;

	// create objects for all pageobject classes that's why it's called as page
	// object factory .

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;
	}

	public LandingPage getLandingPageObject() {
		landingPage = new LandingPage(driver);
		return landingPage;
	}

	public OfferPage getOfferPageObject() {

		offerPage = new OfferPage(driver);
		return offerPage;
	}

	public CheckoutPage CheckoutPage() {

		checkOutPage = new CheckoutPage(driver);
		return checkOutPage;
	}
}
