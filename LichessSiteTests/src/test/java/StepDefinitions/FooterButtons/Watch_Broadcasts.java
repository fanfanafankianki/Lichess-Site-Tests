package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BroadcastPage;
import pages.HomePage;

public class Watch_Broadcasts {
	WebDriver driver;
	HomePage home;
	BroadcastPage broadcast;
	private Utility utility;

	public Watch_Broadcasts(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	@When("user hovers over Watch and clicks on Broadcasts")
	public void user_hovers_over_watch_and_clicks_on_broadcasts() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Watch_Broadcasts();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Broadcasts page")
	public void user_is_navigated_to_the_broadcasts_page() throws InterruptedException {
		broadcast = utility.getBroadcastPage();
	}

	@And("broadcasts form is displayed")
	public void broadcasts_form_is_displayed() {
		broadcast.broadcastSectionIsDisplayed();
		utility.driverTeardown(driver);
	}


}
