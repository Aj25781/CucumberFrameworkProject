package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	WebDriver driver ;
	public OfferPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	By searchOfferField=By.xpath("//input[@id='search-field']");
	By getSearchText=By.cssSelector("tr td:nth-child(1)");
	By topDealsBtn=By.linkText("Top Deals");
	
	public void searchOfferFieldMethod(String shortname)
	{
		
		driver.findElement(searchOfferField).sendKeys(shortname);
	}
	
	public String getSearchTextMethod()
	{
		return driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	}
	
	public void clickTopDealBtn()
	{
		driver.findElement(topDealsBtn).click();
	}

}
