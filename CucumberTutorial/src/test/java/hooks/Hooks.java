package hooks;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks{

	WebDriver driver;
	DriverInstance driverInstance;
	
	public Hooks(DriverInstance driverInstance) {
		this.driverInstance=driverInstance;
	}
	

	@Before
	public void beforeScenario(Scenario scenario)
	{
		System.out.println(scenario.getName());
		System.out.println(scenario.getLine());
		driverInstance.setDriver(driver);
		driverInstance.getDriver().manage().window().maximize();
		driverInstance.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driverInstance.getDriver().get("https://www.facebook.com/");
	}
	
	@AfterStep
	public void afterStep(Scenario scenario)
	{
		if(scenario.isFailed())
		{
		TakesScreenshot ts=(TakesScreenshot)driverInstance.getDriver();
		byte[] screen=ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screen, "image/png", "screenshot captured....");
		}
		System.out.println(scenario.getStatus());
	
	}
	
}
