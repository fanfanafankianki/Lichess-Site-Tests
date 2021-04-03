package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForumPage;
import pages.HomePage;

public class Community_Forum {
	WebDriver driver;
	HomePage home;
	ForumPage forum;
	private DriverInstance DriverInstance;

	public Community_Forum(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
		driver = DriverInstance.getDriver();
	}

	@When("user hovers over Community and clicks on Forum")
	public void user_hovers_over_community_and_clicks_on_forum() throws InterruptedException {
		home = new HomePage(driver);
		home.hover_Community_Forum();
		Thread.sleep(3000);
	}
	
	@Then("user is navigated to the Forum page")
	public void user_is_navigated_to_the_forum_page() throws InterruptedException {
		forum = new ForumPage(driver);
	}

	@And("Forum form is displayed")
	public void forum_form_is_displayed() {
		forum.forumSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
