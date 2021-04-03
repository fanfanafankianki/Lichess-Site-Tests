package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.StreamersPage;

public class Watch_Streamers {
	WebDriver driver;
	HomePage home;
	StreamersPage streamers;
	private DriverInstance DriverInstance;

	public Watch_Streamers(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
		driver = DriverInstance.getDriver();
	}

	@When("user hovers over Watch and clicks on Streamers")
	public void user_hovers_over_watch_and_clicks_on_streamers() throws InterruptedException {
		home = new HomePage(driver);
		home.hover_Watch_Streamers();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Streamer page")
	public void user_is_navigated_to_the_streamer_page() throws InterruptedException {
		streamers = new StreamersPage(driver);
	}

	@And("streamer form is displayed")
	public void streamer_form_is_displayed() {
		streamers.streamerSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
