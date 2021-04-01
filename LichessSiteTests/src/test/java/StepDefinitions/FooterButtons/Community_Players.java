package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.PlayerPage;

public class Community_Players {
	WebDriver driver;
	HomePage home;
	PlayerPage player;
	private DriverInstance DriverInstance;

	public Community_Players(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
	}
	
	@When("user clicks on Community")
	public void user_clicks_on_community() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.clickCommunity();
		Thread.sleep(3000);
	}

	@When("user hovers over Community and clicks on Players")
	public void user_hovers_over_community_and_clicks_on_players() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Community_Players();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the Player page")
	public void user_is_navigated_to_the_player_page() throws InterruptedException {
		driver = DriverInstance.getDriver();
		player = new PlayerPage(driver);
	}

	@And("player form is displayed")
	public void player_form_is_displayed() {
		driver = DriverInstance.getDriver();
		player.playerSectionIsDisplayed();
		DriverInstance.teardown(driver);
	}


}
