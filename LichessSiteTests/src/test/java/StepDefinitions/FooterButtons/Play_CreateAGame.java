package StepDefinitions.FooterButtons;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GamePage;
import pages.HomePage;

public class Play_CreateAGame extends Utility {
	WebDriver driver;
	HomePage home;
	GamePage game;
	private Utility utility;


	public Play_CreateAGame(StepDefinitions.Utility utility) {
		this.utility=utility;
		this.driver=utility.driver;
	}

	@When("user hovers over Play and clicks on Create a game")
	public void user_hovers_over_play_and_clicks_on_create_a_game() throws InterruptedException {
		
		home=utility.getHomePage();
		home.hover_Play_NewGame();
		Thread.sleep(3000);
	}

	@And("user choose black pieces")
	public void user_choose_black_pieces() throws InterruptedException {
		home.creategame_chooseblack();
		Thread.sleep(8000);
	}

	@Then("game page is opened")
	public void game_page_is_opened() throws InterruptedException {
		game = utility.getGamePage();
	}

	@And("game board is displayed")
	public void game_board_is_displayed() {
		game.gameboardIsDisplayed();
		utility.driverTeardown(driver);
	}
	
	
}
