package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.PracticePage;

public class Learn_Practice {
	WebDriver driver;
	HomePage home;
	PracticePage practice;
	private Utility utility;

	public Learn_Practice(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	
	@When("user clicks on Learn")
	public void user_clicks_on_learn() throws InterruptedException {
		home = utility.getHomePage();
		home.clickLearn();
	}

	@When("user hovers over Learn and clicks on Practice")
	public void user_hovers_over_learn_and_clicks_on_practice() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Learn_Practice();
	}

	@Then("user is navigated to the Practice page")
	public void user_is_navigated_to_the_practice_page() throws InterruptedException {
		practice = utility.getPracticePage();
	}

	@And("practice form is displayed")
	public void practice_form_is_displayed() {
		practice.practiceformIsDisplayed();
		utility.driverTeardown(driver);
	}


}
