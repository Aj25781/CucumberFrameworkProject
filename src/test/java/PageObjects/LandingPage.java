package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	WebDriver driver; 
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
                       
	//Page objects below 
	By Search=By.xpath("//input[@type='search']");
	By productName=By.cssSelector("h4.product-name");
	By topDealsBtn=By.linkText("Top Deals");
	
	//action methods
	public void searchItem(String shortname)
	{
		
		driver.findElement(Search).sendKeys(shortname);
	}
	
	public String getProductName()
	{
		return driver.findElement(By.cssSelector("h4.product-name")).getText();
	}
	
	public void clickTopDealBtn()
	{
		driver.findElement(topDealsBtn).click();
	}
}
