package utils;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class InjectionInstance {
	
	public WebDriver driver ;
	public String vegname;
	
	public PageObjectManager pageObjectManager; 
	
	public InjectionInstance() {
		
		   pageObjectManager= new PageObjectManager(driver);
	}

}
