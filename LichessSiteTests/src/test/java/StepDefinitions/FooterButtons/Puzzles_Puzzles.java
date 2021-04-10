package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.PuzzlePage;

public class Puzzles_Puzzles {
	WebDriver driver;
	HomePage home;
	PuzzlePage puzzle;
	private Utility utility;

	//Constructor with dependency injection
	public Puzzles_Puzzles(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	
	@When("user clicks on Puzzles")
	public void user_clicks_on_puzzles() throws InterruptedException {
		home = utility.getHomePage();
		home.clickPuzzles();
	}

	@When("user hovers over Puzzles and clicks on Puzzles")
	public void user_hovers_over_puzzles_and_clicks_on_puzzles() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Puzzles_Puzzles();
	}

	@Then("user is navigated to the Puzzles page")
	public void user_is_navigated_to_the_puzzles_page() throws InterruptedException {
		puzzle = utility.getPuzzlePage();
	}

	@And("puzzle gameboard is displayed")
	public void puzzle_gameboard_is_displayed() {
		puzzle.puzzlegameboardIsDisplayed();
		utility.driverTeardown(driver);
	}


}
