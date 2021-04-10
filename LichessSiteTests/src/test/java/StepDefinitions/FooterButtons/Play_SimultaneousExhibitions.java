package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SimultaneousExhibitionsPage;

public class Play_SimultaneousExhibitions {

	WebDriver driver;
	HomePage home;
	SimultaneousExhibitionsPage simul;
	private Utility utility;
	
	public Play_SimultaneousExhibitions(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	@When("user hovers over Play and clicks on Simultaneous exhibitions")
	public void user_hovers_over_play_and_clicks_on_simultaneous_exhibitions() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Play_Simultan();
	}

	@Then("user is navigated to the simultaneous exhibitions page")
	public void user_is_navigated_to_the_simultaneous_exhibitions_page() throws InterruptedException {
		simul = utility.getSilumtaneousExhibitionsPage();
	}
	@And("simultaneous exhibitions is displayed")
	public void simultaneous_exhibitions_is_displayed() {
		simul.simultournamentSectionIsDisplayed();
		utility.driverTeardown(driver);
	}
}
