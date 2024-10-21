package stepDefinitions;

import static org.testng.Assert.assertTrue;

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



public class CheckoutPage {
	public InjectionInstance inject;
	public PageObjects.CheckoutPage checkOutPage;

	public CheckoutPage(InjectionInstance inject) {
		this.inject=inject;
		this.checkOutPage=inject.pageObjectManager.CheckoutPage();//constructor will be executed before any method execute.
		
	}
	
	
	
	
	@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void user_proceed_to_checkout(String expectedName) throws InterruptedException {
		
		checkOutPage.checkOutItems();
		Thread.sleep(2000);
		//assertion to extract name from screen and compare with name 
		String actualName=checkOutPage.getProductName();
		Assert.assertEquals(actualName, expectedName);
	}
	
	@Then("verify user has ability to enter promo code and place the order ")
	public void verify_user_ability__to_enter_promo_and_place_order() {
	
		Assert.assertTrue(checkOutPage.verifyPromoBtn());
		Assert.assertTrue(checkOutPage.verifyPlaceOrder());   
		
	}
	
	
	


}
