package StepDefinitions.FooterButtons;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;

public class Search_Input {
	WebDriver driver;
	HomePage home;
	AccountPage account;
	private Utility utility;

	public Search_Input(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	

	@When("user clicks on Search icon")
	public void user_clicks_on_search_icon() throws InterruptedException {
		home = utility.getHomePage();
		home.clickSearch();
	}
	
	@And("Text input is displayed")
	public void text_input_is_displayed() throws InterruptedException {
		home.search_inputisDisplayed();
	}

	@And("user type valid username and clicks enter")
	public void user_type_valid_username_and_clicks_enter() throws InterruptedException {
		home.search_inputsendKeys("TestingAccount321"+Keys.ENTER);
	}
	@Then("user is navigated to account page")
	public void user_is_navigated_to_account_page() throws InterruptedException {
		account = utility.getAccountPage();
	}

	@And("account form is displayed")
	public void account_form_is_displayed() {
		account.accountSectionIsDisplayed();
		utility.driverTeardown(driver);
	}


}
