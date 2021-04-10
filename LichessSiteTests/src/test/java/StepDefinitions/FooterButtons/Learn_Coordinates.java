package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CoordinatesPage;
import pages.HomePage;

public class Learn_Coordinates {
	WebDriver driver;
	HomePage home;
	CoordinatesPage coordpage;
	private Utility utility;

	public Learn_Coordinates(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}

	@When("user hovers over Learn and clicks on Coordinates")
	public void user_hovers_over_learn_and_clicks_on_coordinates() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Learn_Coordinates();
	}

	@Then("user is navigated to the Coordinates page")
	public void user_is_navigated_to_the_coordinates_page() throws InterruptedException {
		coordpage = utility.getCoordinatesPage();
	}

	@And("Coordinates board is displayed")
	public void coordinates_board_is_displayed() {
		coordpage.coordinatesboardIsDisplayed();
		utility.driverTeardown(driver);
	}


}
