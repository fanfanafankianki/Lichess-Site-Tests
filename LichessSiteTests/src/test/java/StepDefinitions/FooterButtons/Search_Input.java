package StepDefinitions.FooterButtons;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;

public class Search_Input {
	WebDriver driver;
	HomePage home;
	AccountPage account;
	private DriverInstance DriverInstance;

	public Search_Input(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
		driver = DriverInstance.getDriver();
	}
	

	@When("user clicks on Search icon")
	public void user_clicks_on_search_icon() throws InterruptedException {
		home = new HomePage(driver);
		home.clickSearch();
		Thread.sleep(5000);
	}
	
	@When("Text input is displayed")
	public void text_input_is_displayed() throws InterruptedException {
		home = new HomePage(driver);
		home.search_inputisDisplayed();
	}

	@When("user type valid username and clicks enter")
	public void user_type_valid_username_and_clicks_enter() throws InterruptedException {
		home = new HomePage(driver);
		home.search_inputsendKeys("TestingAccount321"+Keys.ENTER);
	}
	@Then("user is navigated to account page")
	public void user_is_navigated_to_account_page() throws InterruptedException {
		account = new AccountPage(driver);
	}

	@And("account form is displayed")
	public void account_form_is_displayed() {
		account.accountSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
