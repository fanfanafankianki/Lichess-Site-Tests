package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SwissTournamentsPage;

public class Play_SwissTournaments {

	WebDriver driver = null;
	HomePage home;
	SwissTournamentsPage swiss;
	private Utility utility;
	
	public Play_SwissTournaments(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	
	@When("user hovers over Play and clicks on Swiss tournaments")
	public void user_hovers_over_play_and_clicks_on_swiss_tournaments() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Play_Swiss();
	}
	
	@Then("user is navigated to the swiss tournaments page")
	public void user_is_navigated_to_the_swiss_tournaments_page() throws InterruptedException {
		swiss = utility.getSwissTournamentsPage();
	}

	@And("swiss tournament section is displayed")
	public void swiss_tournament_section_is_displayed() {
		swiss.swisstournamentSectionIsDisplayed();
		utility.driverTeardown(driver);
	}
}
