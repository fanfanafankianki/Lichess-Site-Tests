package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchPage;

public class Tools_Search {
	WebDriver driver;
	HomePage home;
	SearchPage search;
	private Utility utility;

	
	//Constructor with dependency injection
	public Tools_Search(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}

	@When("user hovers over Tools and clicks on Advanced search")
	public void user_hovers_over_tools_and_clicks_on_advanced_search() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Tools_Search();
	}

	@Then("user is navigated to the Search page")
	public void user_is_navigated_to_the_search_page() throws InterruptedException {
		search = utility.getSearchPage();
	}

	@And("Search form is displayed")
	public void search_form_is_displayed() {
		search.searchSectionIsDisplayed();
		utility.driverTeardown(driver);
	}


}
