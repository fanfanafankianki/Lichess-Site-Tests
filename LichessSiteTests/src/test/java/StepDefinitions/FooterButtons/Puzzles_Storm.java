package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArenaPage;
import pages.HomePage;
import pages.PuzzleStormPage;

public class Puzzles_Storm {
	WebDriver driver;
	HomePage home;
	ArenaPage arena;
	PuzzleStormPage puzzlestorm;
	private DriverInstance DriverInstance;

	public Puzzles_Storm(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
		driver = DriverInstance.getDriver();
	}

	@When("user hovers over Puzzles and clicks on Puzzle storm")
	public void user_hovers_over_puzzles_and_clicks_on_puzzle_storm() throws InterruptedException {
		home = new HomePage(driver);
		home.hover_Puzzles_Storm();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Puzzle storm page")
	public void user_is_navigated_to_the_puzzle_storm_page() throws InterruptedException {
		puzzlestorm = new PuzzleStormPage(driver);
	}

	@And("puzzle storm gameboard is displayed")
	public void puzzle_storm_gameboard_is_displayed() {
		puzzlestorm.puzzlestormgameboardIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
