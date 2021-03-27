package StepDefinitions.PlayButtonStepDefinitions;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArenaPage;
import pages.HomePage;

public class Play_ArenaLichess {
	
	WebDriver driver = null;
	HomePage home;
	ArenaPage arena;
	private DriverInstance DriverInstance;
	
	
	public Play_ArenaLichess(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
		
	}

	@Given("browser is open")
	public void browser_is_open() {
		driver = DriverInstance.setUp();
	}
	
	@And("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		driver.navigate().to("https://lichess.org/");
		Thread.sleep(2000);
	}

	@When("user hovers over Play and clicks on Arena tournaments")
	public void user_hovers_over_play_and_clicks_on_arena_tournaments() throws InterruptedException {
		driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Play_Arena();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the arena page")
	public void user_is_navigated_to_the_arena_page() throws InterruptedException {
		Thread.sleep(2000);
		arena = new ArenaPage(driver);
	}

	@And("tournament section is displayed")
	public void tournament_section_is_displayed() {
		driver = DriverInstance.getDriver();
		arena.tournamentSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}
}
