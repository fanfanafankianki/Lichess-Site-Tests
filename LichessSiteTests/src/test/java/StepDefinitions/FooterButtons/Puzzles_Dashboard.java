package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignupPage;

public class Puzzles_Dashboard {
	WebDriver driver;
	HomePage home;
	SignupPage register;
	private Utility utility;

	//Constructor with dependency injection
	public Puzzles_Dashboard(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}

	@When("user hovers over Puzzles and clicks on Puzzle dashboard")
	public void user_hovers_over_puzzles_and_clicks_on_puzzle_dashboard() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Puzzles_Dashboard();
	}

	@Then("user is navigated to the register page")
	public void user_is_navigated_to_the_register_page() throws InterruptedException {
		register = utility.getSignupPage();
	}

	@And("register form is displayed")
	public void register_form_is_displayed() {
		register.registerformIsDisplayed();
		utility.driverTeardown(driver);
	}


}
