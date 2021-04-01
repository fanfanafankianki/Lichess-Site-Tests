package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArenaPage;
import pages.HomePage;
import pages.SwissTournamentsPage;

public class Play_SwissTournaments {

	WebDriver driver = null;
	HomePage home;
	ArenaPage arena;
	private DriverInstance DriverInstance;
	SwissTournamentsPage swiss;
	
	public Play_SwissTournaments(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
	}
	
	@When("user hovers over Play and clicks on Swiss tournaments")
	public void user_hovers_over_play_and_clicks_on_swiss_tournaments() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Play_Swiss();
		Thread.sleep(2000);
	}
	@Then("user is navigated to the swiss tournaments page")
	public void user_is_navigated_to_the_swiss_tournaments_page() throws InterruptedException {
		driver = DriverInstance.getDriver();
		swiss = new SwissTournamentsPage(driver);
	}

	@And("swiss tournament section is displayed")
	public void swiss_tournament_section_is_displayed() {
		driver = DriverInstance.getDriver();
		swiss.swisstournamentSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}
}