package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.When;
import pages.ForumPage;
import pages.HomePage;

public class Home_CreateAGame {
	WebDriver driver;
	HomePage home;
	ForumPage forum;
	private Utility utility;

	public Home_CreateAGame(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	

	@When("user clicks create a game button")
	public void user_clicks_create_a_game_button() throws InterruptedException {
		home = utility.getHomePage();
		home.clickCreate_a_Game();
	}
}
