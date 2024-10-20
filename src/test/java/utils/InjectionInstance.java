package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class InjectionInstance {

	public WebDriver driver;
	public String vegname;
	public TestBase testBase;

	public PageObjectManager pageObjectManager;
	public GenericUtils genericUtils;

	public InjectionInstance() throws IOException {

		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
	}

}
