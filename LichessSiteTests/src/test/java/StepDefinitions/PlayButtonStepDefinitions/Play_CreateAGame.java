package StepDefinitions.PlayButtonStepDefinitions;


import org.openqa.selenium.WebDriver;

import StepDefinitions.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArenaPage;
import pages.GamePage;
import pages.HomePage;

public class Play_CreateAGame {
	WebDriver driver;
	HomePage home;
	GamePage game;
	ArenaPage arena;
	private DriverInstance DriverInstance;
	
	public Play_CreateAGame(StepDefinitions.DriverInstance DriverInstance) {
		this.DriverInstance=DriverInstance;
	}

	@When("user hovers over Play and clicks on Create a game")
	public void user_hovers_over_play_and_clicks_on_create_a_game() throws InterruptedException {
		WebDriver driver = DriverInstance.getDriver();
		home = new HomePage(driver);
		home.hover_Play_NewGame();
		Thread.sleep(5000);
	}

	@And("user choose black pieces")
	public void user_choose_black_pieces() throws InterruptedException {
		home.creategame_chooseblack();
		Thread.sleep(8000);
	}

	@Then("game page is opened")
	public void game_page_is_opened() throws InterruptedException {
		driver = DriverInstance.getDriver();
		game = new GamePage(driver);
	}

	@And("game board is displayed")
	public void game_board_is_displayed() {
		driver = DriverInstance.getDriver();
		game.gameboardIsDisplayed();
		System.out.println(driver);
		DriverInstance.teardown(driver);
	}
	
	
}
