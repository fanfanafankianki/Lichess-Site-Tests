package StepDefinitions.PlayButtonStepDefinitions;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArenaPage;
import pages.CoachesPage;
import pages.HomePage;

public class Learn_Coaches {
	WebDriver driver;
	HomePage home;
	ArenaPage arena;
	CoachesPage coaches;
	private DriverInstance DriverInstance;

	public Learn_Coaches(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
	}


	@When("user hovers over Learn and clicks on Coaches")
	public void user_hovers_over_learn_and_clicks_on_coaches() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Learn_Coaches();
		Thread.sleep(5000);
	}


	@Then("user is navigated to the Coaches page")
	public void user_is_navigated_to_the_coaches_page() throws InterruptedException {
		driver = DriverInstance.getDriver();
		coaches = new CoachesPage(driver);
	}

	@And("coaches form is displayed")
	public void coaches_form_is_displayed() {
		driver = DriverInstance.getDriver();
		coaches.coachformIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
