package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.TvGamesPage;

public class Watch_CurrentGames {
	WebDriver driver;
	HomePage home;
	TvGamesPage games;
	private Utility utility;

	
	//Constructor with dependency injection
	public Watch_CurrentGames(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	
	@When("user hovers over Watch and clicks on Current Games")
	public void user_hovers_over_watch_and_clicks_on_current_games() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Watch_Games();
	}

	@Then("user is navigated to the games page")
	public void user_is_navigated_to_the_games_page() throws InterruptedException {
		games = utility.getTvGamesPage();
	}

	@And("TV games form is displayed")
	public void tv_games_form_is_displayed() {
		games.tvgamesSectionIsDisplayed();
		utility.driverTeardown(driver);
	}


}
