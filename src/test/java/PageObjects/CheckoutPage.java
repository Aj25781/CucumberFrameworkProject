package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	WebDriver driver; 
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
        
	By cartBag=By.xpath("//img[@alt='Cart']");
	By checkOutButton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoCodeSearch=By.xpath("//input[@class='promoCode']");
	By promoApply=By.xpath("//input[@class='promoBtn']");
	By placeOrderText=By.xpath("//button[contains(text(),'Place Order')]");
	By getProductName=By.xpath("//p[@class='product-name']");
	//Page objects below 
	
	
	
	//action methods
	public void checkOutItems() {
		
		driver.findElement(cartBag).click();;
		driver.findElement(checkOutButton).click();
	}
	
	public boolean verifyPromoBtn()
	{
		driver.findElement(promoCodeSearch);
		return driver.findElement(promoApply).isDisplayed();
	}
	
	public boolean verifyPlaceOrder() {
		
	return	driver.findElement(placeOrderText).isDisplayed();
		
	}
	public String getProductName() {
		
		return driver.findElement(getProductName).getText().split("-")[0].trim();
	}
	
	

}
