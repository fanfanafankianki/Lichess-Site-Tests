package StepDefinitions.FooterButtons;


import org.openqa.selenium.chrome.ChromeDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.PatronPage;
import pages.TrainingDailyPage;

public class Home_Patron {
	ChromeDriver driver;
	HomePage home;
	PatronPage patron;
	TrainingDailyPage training;
	private Utility utility;

	public Home_Patron(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=(ChromeDriver) utility.driver;
	}
	
	@When("user scroll donate button into view")
	public void user_scroll_donate_button_into_view() throws InterruptedException {
		home = utility.getHomePage();
		home.scrollintoPatron(driver);
		Thread.sleep(500); 
	}

	@And("user clicks on donate button")
	public void user_clicks_on_donate_button() {
		home.clickDonate();
	}

	@Then("user is navigated to the patron page")
	public void user_is_navigated_to_the_patron_page() throws InterruptedException {
		patron=utility.getPatronPage();
	}

	@And("patron form is displayed")
	public void patron_form_is_displayed() {
		patron.patronsformIsDisplayed();
		utility.driverTeardown(driver);
	}
}
