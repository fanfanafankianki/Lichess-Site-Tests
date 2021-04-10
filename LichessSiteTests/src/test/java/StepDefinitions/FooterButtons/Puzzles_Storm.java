package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.PuzzleStormPage;

public class Puzzles_Storm {
	WebDriver driver;
	HomePage home;
	PuzzleStormPage puzzlestorm;
	private Utility utility;

	//Constructor with dependency injection
	public Puzzles_Storm(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	@When("user hovers over Puzzles and clicks on Puzzle storm")
	public void user_hovers_over_puzzles_and_clicks_on_puzzle_storm() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Puzzles_Storm();
	}

	@Then("user is navigated to the Puzzle storm page")
	public void user_is_navigated_to_the_puzzle_storm_page() throws InterruptedException {
		puzzlestorm = utility.getPuzzleStormPage();
	}

	@And("puzzle storm gameboard is displayed")
	public void puzzle_storm_gameboard_is_displayed() {
		puzzlestorm.puzzlestormgameboardIsDisplayed();
		utility.driverTeardown(driver);
	}


}
