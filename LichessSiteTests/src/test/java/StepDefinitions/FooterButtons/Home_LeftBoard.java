package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.When;
import pages.FriendGamePage;
import pages.HomePage;

public class Home_LeftBoard {
	WebDriver driver;
	HomePage home;
	FriendGamePage friendgame;
	private Utility utility;

	//Constructor with dependency injection
	public Home_LeftBoard(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}
	
	@When("user clicks on left gameboard")
	public void user_clicks_on_left_gameboard() throws InterruptedException {
		home = utility.getHomePage();
		home.clickLeftBoard();
	}
}
