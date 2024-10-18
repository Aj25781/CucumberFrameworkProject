package stepDefinitions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OfferPage;
import PageObjects.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.InjectionInstance;

public class OfferPageStepDefinition {

	public InjectionInstance inject;
	public PageObjectManager pageObjectManager;
	
	public OfferPageStepDefinition(InjectionInstance inject) {
		this.inject=inject;
	}
	
	
	
	@Then("User search with {string} same shortname in offers page to check if product exist")
	public void User_search_with_same_shortname_in_offers_page(String shortname)
	{
		OfferPage offerpage=new OfferPage(inject.driver);
		
		switchToOffersPage();
	
		offerpage.searchOfferFieldMethod(shortname);
		String offerveginame=offerpage.getSearchTextMethod();
		
		Assert.assertEquals(inject.vegname, offerveginame);
		
		inject.driver.quit();
		
		
	}
	
	public void switchToOffersPage()
	{
		
		LandingPage landingPage=inject.pageObjectManager.getLandingPageObject();
		
		landingPage.clickTopDealBtn();
		Set<String>s1=inject.driver.getWindowHandles();
		Iterator<String>i1=s1.iterator();
		String parentWindow=i1.next();
		String childWindow = i1.next();
		
		inject.driver.switchTo().window(childWindow);
		
	}
	
	

}