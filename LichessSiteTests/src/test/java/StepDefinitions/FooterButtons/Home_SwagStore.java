package StepDefinitions.FooterButtons;


import org.openqa.selenium.chrome.ChromeDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SwagStorePage;
import pages.TrainingDailyPage;

public class Home_SwagStore {
	ChromeDriver driver;
	HomePage home;
	SwagStorePage swagstore;
	TrainingDailyPage training;
	private Utility utility;

	public Home_SwagStore(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=(ChromeDriver) utility.driver;
	}
	
	@When("user scroll Swag Store button into view")
	public void user_scroll_swag_store_button_into_view() throws InterruptedException {
		home = utility.getHomePage();
		home.scrollintoSwagStore(driver);
		Thread.sleep(500); 
		
	}

	@When("user clicks on Swag Store button")
	public void user_clicks_on_swag_store_button() {
		home.clickSwagStore();
		
	}

	@Then("user is navigated to the Swag Store page")
	public void user_is_navigated_to_the_swag_store_page() throws InterruptedException {
		swagstore=utility.getSwagStorePage();
	}

	@And("Swag Store form is displayed")
	public void swag_store_form_is_displayed() {
		swagstore.swag_footerIsDisplayed();
		utility.driverTeardown(driver);
		
	}
}
