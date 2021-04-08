package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.TeamsPage;

public class Community_Teams {
	WebDriver driver;
	HomePage home;
	TeamsPage teams;
	private Utility utility;

	public Community_Teams(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}

	@When("user hovers over Community and clicks on Teams")
	public void user_hovers_over_community_and_clicks_on_teams() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Community_Teams();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Teams page")
	public void user_is_navigated_to_the_teams_page() throws InterruptedException {
		teams = utility.getTeamsPage();
	}

	@And("Teams form is displayed")
	public void teams_form_is_displayed() {
		teams.teamsSectionIsDisplayed();
		utility.driverTeardown(driver);
	}


}
