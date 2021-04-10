package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.PlayerPage;

public class Community_Players {
	WebDriver driver;
	HomePage home;
	PlayerPage player;
	private Utility utility;

	//Constructor with dependency injection
	public Community_Players(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	
	@When("user clicks on Community")
	public void user_clicks_on_community() throws InterruptedException {
		home = utility.getHomePage();
		home.clickCommunity();
	}

	@When("user hovers over Community and clicks on Players")
	public void user_hovers_over_community_and_clicks_on_players() throws InterruptedException {
		home = utility.getHomePage();
		home.hover_Community_Players();
	}

	@Then("user is navigated to the Player page")
	public void user_is_navigated_to_the_player_page() throws InterruptedException {
		player = utility.getPlayerPage();
	}

	@And("player form is displayed")
	public void player_form_is_displayed() {
		player.playerSectionIsDisplayed();
		utility.driverTeardown(driver);
	}


}
