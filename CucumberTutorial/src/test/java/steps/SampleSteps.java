package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import hooks.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SampleSteps{
	
	DriverInstance driverInstance;
	
	public SampleSteps(DriverInstance driverInstance) {
		this.driverInstance=driverInstance;
	}
	
	List<WebElement> links;
	
	@Given("User gets all links text and attribute")
	public void userGetsAllLinksTextAndAttribute() {
		links = driverInstance.getDriver().findElements(By.tagName("a"));
	   for (WebElement aa : links) {
		System.out.println(aa.getText()+"---->"+aa.getAttribute("href"));
	}
	}
	
	@Given("User gets the Links Count")
	public void userGetsTheLinksCount() {
	    links = driverInstance.getDriver().findElements(By.tagName("a"));
	    System.out.println(links.size());
	}
	
	@Then("User gets Page Title and URL")
	public void userGetsPageTitleAndURL() {
	    System.out.println(driverInstance.getDriver().getTitle());
	    System.out.println(driverInstance.getDriver().getCurrentUrl());
	}

	@Then("User enters the username as {string} and password as {string}")
	public void userEntersTheUsernameAsAndPasswordAs(String username, String password) {
		 WebElement emailField = driverInstance.getDriver().findElement(By.id("email"));
		   WebElement passwordField = driverInstance.getDriver().findElement(By.id("pass"));
		   emailField.sendKeys(username);
		   passwordField.sendKeys(password);
	}
	@Then("User clicks login button")
	public void userClicksLoginButton() {
		 WebElement loginButton = driverInstance.getDriver().findElement(By.name("log"));
		 loginButton.click();
	}
}
