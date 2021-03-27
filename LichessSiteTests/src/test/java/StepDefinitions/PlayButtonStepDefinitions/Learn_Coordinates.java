package StepDefinitions.PlayButtonStepDefinitions;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArenaPage;
import pages.CoordinatesPage;
import pages.HomePage;

public class Learn_Coordinates {
	WebDriver driver;
	HomePage home;
	ArenaPage arena;
	CoordinatesPage coordpage;
	private DriverInstance DriverInstance;

	public Learn_Coordinates(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
	}

	@When("user hovers over Learn and clicks on Coordinates")
	public void user_hovers_over_learn_and_clicks_on_coordinates() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Learn_Coordinates();
		Thread.sleep(5000);
	}

	@Then("user is navigated to the Coordinates page")
	public void user_is_navigated_to_the_coordinates_page() throws InterruptedException {
		driver = DriverInstance.getDriver();
		coordpage = new CoordinatesPage(driver);
	}

	@And("Coordinates board is displayed")
	public void coordinates_board_is_displayed() {
		driver = DriverInstance.getDriver();
		coordpage.coordinatesboardIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
