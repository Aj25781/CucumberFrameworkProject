package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.InjectionInstance;

public class Hooks {

	InjectionInstance inject;

	public Hooks(InjectionInstance inject) {

		this.inject = inject;
	}

	@After
	public void closeBrowser() throws IOException {

		inject.testBase.WebDriverManager().quit();

	}

	@AfterStep
	public void takeScreenshot(Scenario scenario) throws WebDriverException, IOException {
		if (scenario.isFailed()) {
			File screenshot = ((TakesScreenshot) inject.testBase.WebDriverManager()).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(screenshot);
            scenario.attach(fileContent, "image/png", "image");
		}
	}

}
