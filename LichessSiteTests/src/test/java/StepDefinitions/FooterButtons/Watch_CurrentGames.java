package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.TvGamesPage;

public class Watch_CurrentGames {
	WebDriver driver;
	HomePage home;
	TvGamesPage games;
	private DriverInstance DriverInstance;

	public Watch_CurrentGames(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
	}
	
	@When("user hovers over Watch and clicks on Current Games")
	public void user_hovers_over_watch_and_clicks_on_current_games() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Watch_Games();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the games page")
	public void user_is_navigated_to_the_games_page() throws InterruptedException {
		driver = DriverInstance.getDriver();
		games = new TvGamesPage(driver);
	}

	@And("TV games form is displayed")
	public void tv_games_form_is_displayed() {
		driver = DriverInstance.getDriver();
		games.tvgamesSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
