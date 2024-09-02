package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = "F:\\Eclipse-Frameworks\\CucumberTutorial\\src\\test\\java\\feature\\sample.feature",
		snippets = SnippetType.CAMELCASE,
		dryRun = !true,
		glue = {"steps","hooks"},//This is used to place package name of all the steps available
		tags = "@regression",
		plugin = {
				"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:.\\src\\test\\resources\\Reports\\index.html",
				"json:.\\src\\test\\resources\\Reports\\index.json",
				"junit:.\\src\\test\\resources\\Reports\\index.xml"
		}
		)
public class SampleRun extends AbstractTestNGCucumberTests{

	
	
	
	
	
	
	
	
	
	
	
	
}
