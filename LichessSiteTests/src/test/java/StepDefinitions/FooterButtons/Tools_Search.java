package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchPage;

public class Tools_Search {
	WebDriver driver;
	HomePage home;
	SearchPage search;
	private DriverInstance DriverInstance;

	public Tools_Search(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
	}

	@When("user hovers over Tools and clicks on Advanced search")
	public void user_hovers_over_tools_and_clicks_on_advanced_search() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Tools_Search();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Search page")
	public void user_is_navigated_to_the_search_page() throws InterruptedException {
		driver = DriverInstance.getDriver();
		search = new SearchPage(driver);
	}

	@And("Search form is displayed")
	public void search_form_is_displayed() {
		driver = DriverInstance.getDriver();
		search.searchSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
