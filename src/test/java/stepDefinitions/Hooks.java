package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
import utils.InjectionInstance;

public class Hooks {
	
	InjectionInstance inject;
	
	public Hooks(InjectionInstance inject) {
		
		this.inject=inject;
	}
	
	@After
	public void closeBrowser() throws IOException {
		
		inject.testBase.WebDriverManager().quit();
		
	}

}
