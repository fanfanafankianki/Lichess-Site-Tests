package StepDefinitions.FooterButtons;


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
		driver = DriverInstance.getDriver();
	}

	@When("user hovers over Learn and clicks on Coordinates")
	public void user_hovers_over_learn_and_clicks_on_coordinates() throws InterruptedException {
		home = new HomePage(driver);
		home.hover_Learn_Coordinates();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Coordinates page")
	public void user_is_navigated_to_the_coordinates_page() throws InterruptedException {
		coordpage = new CoordinatesPage(driver);
	}

	@And("Coordinates board is displayed")
	public void coordinates_board_is_displayed() {
		coordpage.coordinatesboardIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
