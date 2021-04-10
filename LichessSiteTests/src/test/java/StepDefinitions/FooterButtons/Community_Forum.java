package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForumPage;
import pages.HomePage;

public class Community_Forum {
	WebDriver driver;
	HomePage home;
	ForumPage forum;
	private Utility utility;

	//Constructor with dependency injection
	public Community_Forum(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	

	@When("user hovers over Community and clicks on Forum")
	public void user_hovers_over_community_and_clicks_on_forum() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Community_Forum();
	}
	
	@Then("user is navigated to the Forum page")
	public void user_is_navigated_to_the_forum_page() throws InterruptedException {
		forum = utility.getForumPage();
	}

	@And("Forum form is displayed")
	public void forum_form_is_displayed() {
		forum.forumSectionIsDisplayed();
		utility.driverTeardown(driver);
	}


}
