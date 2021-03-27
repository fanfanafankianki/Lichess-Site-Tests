package StepDefinitions.PlayButtonStepDefinitions;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArenaPage;
import pages.HomePage;
import pages.PuzzleRacePage;

public class Puzzles_Racer {
	WebDriver driver;
	HomePage home;
	ArenaPage arena;
	PuzzleRacePage puzzleracer;
	private DriverInstance DriverInstance;

	public Puzzles_Racer(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
	}

	@When("user hovers over Puzzles and clicks on Puzzle races")
	public void user_hovers_over_puzzles_and_clicks_on_puzzle_races() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Puzzles_Racer();
		Thread.sleep(5000);
	}

	@Then("user is navigated to the Puzzle races page")
	public void user_is_navigated_to_the_puzzle_races_page() throws InterruptedException {
		driver = DriverInstance.getDriver();
		puzzleracer = new PuzzleRacePage(driver);
	}

	@And ("puzzle racer form is displayed")
	public void puzzle_racer_form_is_displayed() {
		driver = DriverInstance.getDriver();
		puzzleracer.puzzleracergameboardIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
