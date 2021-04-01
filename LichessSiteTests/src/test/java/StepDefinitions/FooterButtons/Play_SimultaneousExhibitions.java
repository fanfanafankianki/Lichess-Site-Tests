package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArenaPage;
import pages.HomePage;
import pages.SimultaneousExhibitionsPage;

public class Play_SimultaneousExhibitions {

	WebDriver driver = null;
	HomePage home;
	ArenaPage arena;
	SimultaneousExhibitionsPage simul;
	private DriverInstance DriverInstance;
	
	public Play_SimultaneousExhibitions(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
	}
	@When("user hovers over Play and clicks on Simultaneous exhibitions")
	public void user_hovers_over_play_and_clicks_on_simultaneous_exhibitions() throws InterruptedException {

		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Play_Simultan();
		Thread.sleep(2000);
	}

	@Then("user is navigated to the simultaneous exhibitions page")
	public void user_is_navigated_to_the_simultaneous_exhibitions_page() throws InterruptedException {
		driver = DriverInstance.getDriver();
		simul = new SimultaneousExhibitionsPage(driver);
	}
	@And("simultaneous exhibitions is displayed")
	public void simultaneous_exhibitions_is_displayed() {
		driver = DriverInstance.getDriver();
		simul.simultournamentSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}
}
