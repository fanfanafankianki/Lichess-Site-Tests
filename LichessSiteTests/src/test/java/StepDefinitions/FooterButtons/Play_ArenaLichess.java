package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArenaPage;
import pages.HomePage;

public class Play_ArenaLichess {
	
	WebDriver driver;
	HomePage home;
	ArenaPage arena;
	private Utility utility;
	
	
	public Play_ArenaLichess(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}

	@Given("browser is open")
	public void browser_is_open() {
		driver=utility.getDriver();
	}
	
	@And("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		driver.navigate().to("https://lichess.org/");
		Thread.sleep(2000);
	}

	@When("user hovers over Play and clicks on Arena tournaments")
	public void user_hovers_over_play_and_clicks_on_arena_tournaments() throws InterruptedException {
		HomePage home = utility.getHomePage();
		home.hover_Play_Arena();
	}

	@Then("user is navigated to the arena page")
	public void user_is_navigated_to_the_arena_page() throws InterruptedException {
		arena = utility.getArenaPage();
	}

	@And("tournament section is displayed")
	public void tournament_section_is_displayed() {
		arena.tournamentSectionIsDisplayed();
		utility.driverTeardown(driver);
	}
}
