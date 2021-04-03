package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.TeamsPage;

public class Community_Teams {
	WebDriver driver;
	HomePage home;
	TeamsPage teams;
	private DriverInstance DriverInstance;

	public Community_Teams(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
		driver = DriverInstance.getDriver();
	}

	@When("user hovers over Community and clicks on Teams")
	public void user_hovers_over_community_and_clicks_on_teams() throws InterruptedException {
		home = new HomePage(driver);
		home.hover_Community_Teams();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Teams page")
	public void user_is_navigated_to_the_teams_page() throws InterruptedException {
		teams = new TeamsPage(driver);
	}

	@And("Teams form is displayed")
	public void teams_form_is_displayed() {
		teams.teamsSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
