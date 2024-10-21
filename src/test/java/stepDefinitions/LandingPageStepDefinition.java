package stepDefinitions;

import java.io.IOException;
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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.InjectionInstance;



public class LandingPageStepDefinition {

	public LandingPageStepDefinition(InjectionInstance inject) {
		this.inject=inject;
		
	}
	
	InjectionInstance inject;
	
	@Given("User is on GreenKart landing page")
	public void User_is_on_GreenKart_landing_page() throws IOException {
		
		//inject.testBase.WebDriverManager();
		
	}
	
	@When("^User search with shortname (.+) and extracted actual name of product$")
	public void User_search_with_shortname(String shortname) throws InterruptedException
	{
		LandingPage landingPage=inject.pageObjectManager.getLandingPageObject();
		
		landingPage.searchItem(shortname);
		
		Thread.sleep(2000);
		
		 inject.vegname=landingPage.getProductName().split("-")[0].trim();
		
		 System.out.println(inject.vegname+" is extracted from Home Page");
		
	}
	
	@When("Added {string} items of selected product to cart")
	public void added_items_product(String qty) {
		
		for(int i=0;i<=qty.length();i++)
		{
			inject.pageObjectManager.landingPage.incrementQty();
		}
		
		inject.pageObjectManager.landingPage.addToCartPress();
		
	}
	
	


}
